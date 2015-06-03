// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.hadoopcluster.ui.conf;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.hadoop.version.EHadoopDistributions;
import org.talend.core.hadoop.version.EHadoopVersion4Drivers;
import org.talend.core.model.general.ILibrariesService;
import org.talend.core.model.general.Project;
import org.talend.core.model.repository.ResourceModelUtils;
import org.talend.designer.hdfsbrowse.manager.EHadoopConfProperties;
import org.talend.repository.ProjectManager;
import org.talend.repository.hadoopcluster.conf.EHadoopConfs;
import org.talend.repository.hadoopcluster.service.IRetrieveConfsService;
import org.talend.repository.hadoopcluster.ui.common.AbstractHadoopForm;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JarBuilder;

/**
 * created by ycbai on 2015年6月2日 Detailled comment
 *
 */
public class HadoopConfsUtils {

    public final static String CONFS_JAR_EXT = ".jar"; //$NON-NLS-1$

    public final static String CONFS_JAR_PREFIX = "hadoop-conf-"; //$NON-NLS-1$

    public final static String CONFS_FOLDER = "hadoopConfs"; //$NON-NLS-1$

    public final static String CONFS_SITES_FOLDER = "sites"; //$NON-NLS-1$

    public final static String CONFS_JAR_FOLDER = "jar"; //$NON-NLS-1$

    public static void openHadoopConfsWizard(AbstractHadoopForm parentForm, HadoopClusterConnectionItem connectionItem,
            boolean creation) {
        IWizard wizard = new HadoopImportConfsWizard(parentForm, connectionItem, creation);
        WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
        wizardDialog.create();
        wizardDialog.open();
    }

    public static String getConfsSitesTempFolder() {
        return getConfsTempFolder(CONFS_SITES_FOLDER);
    }

    public static String getConfsJarTempFolder() {
        return getConfsTempFolder(CONFS_JAR_FOLDER);
    }

    private static String getConfsTempFolder(String subFolderName) {
        Project project = ProjectManager.getInstance().getCurrentProject();
        String tmpFolder;
        try {
            IProject physProject = ResourceModelUtils.getProject(project);
            tmpFolder = physProject.getFolder("temp").getLocation().toPortableString(); //$NON-NLS-1$
        } catch (Exception e) {
            tmpFolder = System.getProperty("user.dir"); //$NON-NLS-1$
        }
        tmpFolder = tmpFolder + File.separator + CONFS_FOLDER;
        File confFolder = new File(tmpFolder + File.separator + subFolderName);
        if (!confFolder.exists()) {
            confFolder.mkdirs();
        } else {
            FilesUtils.emptyFolder(confFolder);
        }
        return confFolder.getAbsolutePath();
    }

    public static void buildAndDeployConfsJar(String dir, String jarName) {
        try {
            File parentFile = new File(getConfsJarTempFolder());
            File jarFile = new File(parentFile, jarName);
            File rootDir = new File(dir);
            JarBuilder jarBuilder = new JarBuilder(rootDir, jarFile);
            jarBuilder.setIncludeDir(null);
            jarBuilder.setExcludeDir(null);
            jarBuilder.buildJar();
            if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibrariesService.class)) {
                ILibrariesService service = (ILibrariesService) GlobalServiceRegister.getDefault().getService(
                        ILibrariesService.class);
                service.deployLibrary(jarFile.toURI().toURL());
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    public static String getConfsJarDefaultName(HadoopClusterConnectionItem connectionItem) {
        String connLabel = connectionItem.getProperty().getLabel();
        return CONFS_JAR_PREFIX.concat(connLabel).concat(CONFS_JAR_EXT);
    }

    public static void setConnectionParameters(HadoopClusterConnectionItem connectionItem, String distribution, String version,
            IRetrieveConfsService confsService) throws Exception {
        HadoopClusterConnection connection = (HadoopClusterConnection) connectionItem.getConnection();
        connection.setUseCustomConfs(true);
        EHadoopDistributions dist = EHadoopDistributions.getDistributionByDisplayName(distribution);
        EHadoopVersion4Drivers ver = EHadoopVersion4Drivers.indexOfByVersionDisplay(version);
        boolean supportYARN = ver.isSupportYARN();
        connection.setDistribution(dist.getName());
        connection.setDfVersion(ver.getVersionValue());
        String nn = confsService.getConfValue(EHadoopConfs.HDFS.getName(), EHadoopConfProperties.FS_DEFAULT_URI_NEW.getName());
        if (nn == null) {
            nn = confsService.getConfValue(EHadoopConfs.HDFS.getName(), EHadoopConfProperties.FS_DEFAULT_URI.getName());
        }
        if (nn != null) {
            connection.setNameNodeURI(nn);
        }
        String rmOrJt = null;
        if (supportYARN) {
            rmOrJt = confsService.getConfValue(EHadoopConfs.YARN.getName(), EHadoopConfProperties.RESOURCE_MANAGER.getName());
        } else {
            rmOrJt = confsService
                    .getConfValue(EHadoopConfs.MAP_REDUCE.getName(), EHadoopConfProperties.JOB_TRACKER_URI.getName());
        }
        if (rmOrJt != null) {
            connection.setJobTrackerURI(rmOrJt);
        }
        String rms = confsService.getConfValue(EHadoopConfs.YARN.getName(),
                EHadoopConfProperties.RESOURCEMANAGER_SCHEDULER.getName());
        if (rms != null) {
            connection.setRmScheduler(rms);
        }
        String jh = confsService.getConfValue(EHadoopConfs.MAP_REDUCE.getName(), EHadoopConfProperties.JOBHISTORY.getName());
        if (jh != null) {
            connection.setJobHistory(jh);
        }
        String sd = confsService.getConfValue(EHadoopConfs.MAP_REDUCE.getName(), EHadoopConfProperties.STAGING_DIR.getName());
        if (sd != null) {
            connection.setStagingDirectory(sd);
        }
        String at = confsService.getConfValue(EHadoopConfs.HDFS.getName(), EHadoopConfProperties.AUTHENTICATION.getName());
        if (at != null) {
            connection.setEnableKerberos("kerberos".equals(at)); //$NON-NLS-1$
        }
        String nnp = confsService.getConfValue(EHadoopConfs.HDFS.getName(), EHadoopConfProperties.KERBEROS_PRINCIPAL.getName());
        if (nnp != null) {
            connection.setPrincipal(nnp);
        }
        String rmOrJtPrincipal = null;
        if (supportYARN) {
            rmOrJtPrincipal = confsService
                    .getConfValue(EHadoopConfs.YARN.getName(), EHadoopConfProperties.RM_PRINCIPAL.getName());
        } else {
            rmOrJtPrincipal = confsService.getConfValue(EHadoopConfs.MAP_REDUCE.getName(),
                    EHadoopConfProperties.JT_PRINCIPAL.getName());
        }
        if (rmOrJtPrincipal != null) {
            connection.setJtOrRmPrincipal(rmOrJtPrincipal);
        }
        String jhp = confsService.getConfValue(EHadoopConfs.MAP_REDUCE.getName(), EHadoopConfProperties.JH_PRINCIPAL.getName());
        if (jhp != null) {
            connection.setJobHistoryPrincipal(jhp);
        }
    }
}
