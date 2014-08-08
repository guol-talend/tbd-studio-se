// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.nosql.db.util.cassandra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.nosql.db.common.cassandra.ICassandraAttributies;
import org.talend.repository.nosql.exceptions.NoSQLReflectionException;
import org.talend.repository.nosql.exceptions.NoSQLServerException;
import org.talend.repository.nosql.factory.NoSQLClassLoaderFactory;
import org.talend.repository.nosql.reflection.NoSQLReflection;
import org.talend.repository.ui.utils.ConnectionContextHelper;

public class CassandraConnectionUtil {

    private static Object cluster;

    public static synchronized boolean checkConnection(NoSQLConnection connection) throws NoSQLServerException {
        Object session = null;
        try {
            initCluster(connection);
            ContextType contextType = null;
            String ksName = connection.getAttributes().get(ICassandraAttributies.DATABASE);
            if (connection.isContextMode()) {
                contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            }
            if (contextType != null) {
                ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
            }
            if (StringUtils.isEmpty(ksName)) {
                session = NoSQLReflection.invokeMethod(cluster, "connect"); //$NON-NLS-1$
            } else {
                session = NoSQLReflection.invokeMethod(cluster, "connect", new Object[] { ksName }); //$NON-NLS-1$
            }
            return true;
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        } finally {
            try {
                if (session != null) {
                    NoSQLReflection.invokeMethod(session, "close"); //$NON-NLS-1$
                }
            } catch (NoSQLReflectionException e) {
                // only for debug
                e.printStackTrace();
            }
        }
    }

    public static synchronized void initCluster(NoSQLConnection connection) throws NoSQLServerException {
        try {
            if (cluster != null) {
                boolean isClosed = (Boolean) NoSQLReflection.invokeMethod(cluster, "isClosed"); //$NON-NLS-1$
                if (!isClosed) {
                    return;
                }
            }
            ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);
            ContextType contextType = null;
            String host = connection.getAttributes().get(ICassandraAttributies.HOST);
            // String port = connection.getAttributes().get(ICassandraAttributies.PORT);
            if (connection.isContextMode()) {
                contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            }
            if (contextType != null) {
                host = ContextParameterUtils.getOriginalValue(contextType, host);
                // port = ContextParameterUtils.getOriginalValue(contextType, port);
            }
            cluster = NoSQLReflection.invokeStaticMethod("com.datastax.driver.core.Cluster", "builder", classLoader); //$NON-NLS-1$ //$NON-NLS-2$
            cluster = NoSQLReflection.invokeMethod(cluster, "addContactPoint", new Object[] { host }); //$NON-NLS-1$
            // Do authenticate
            String requireAuthAttr = connection.getAttributes().get(ICassandraAttributies.REQUIRED_AUTHENTICATION);
            boolean requireAuth = requireAuthAttr == null ? false : Boolean.valueOf(requireAuthAttr);
            if (requireAuth) {
                String username = connection.getAttributes().get(ICassandraAttributies.USERNAME);
                String password = connection.getAttributes().get(ICassandraAttributies.PASSWORD);
                if (contextType != null) {
                    username = ContextParameterUtils.getOriginalValue(contextType, username);
                    password = ContextParameterUtils.getOriginalValue(contextType, password);
                }
                cluster = NoSQLReflection.invokeMethod(cluster, "withCredentials", new Object[] { username, password }); //$NON-NLS-1$
            }
            cluster = NoSQLReflection.invokeMethod(cluster, "build"); //$NON-NLS-1$

        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
    }

    public static synchronized Object getKeySpace(NoSQLConnection connection) throws NoSQLServerException {
        ContextType contextType = null;
        String ksName = connection.getAttributes().get(ICassandraAttributies.DATABASE);
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        if (contextType != null) {
            ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
        }
        return getKeySpace(connection, ksName);

    }

    public static synchronized Object getKeySpace(NoSQLConnection connection, String ksName) throws NoSQLServerException {
        Object keyspace = null;
        ContextType contextType = null;
        if (StringUtils.isEmpty(ksName)) {
            return keyspace;
        }
        if (connection.isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
        }
        if (contextType != null) {
            ksName = ContextParameterUtils.getOriginalValue(contextType, ksName);
        }
        ksName = TalendQuoteUtils.addQuotesIfNotExist(ksName);
        try {
            initCluster(connection);
            Object metadata = NoSQLReflection.invokeMethod(cluster, "getMetadata"); //$NON-NLS-1$
            keyspace = NoSQLReflection.invokeMethod(metadata, "getKeyspace", new Object[] { ksName }); //$NON-NLS-1$
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return keyspace;
    }

    @SuppressWarnings("rawtypes")
    public static synchronized List<String> getKeySpaceNames(NoSQLConnection connection) throws NoSQLServerException {
        List<String> ksNames = new ArrayList<String>();
        initCluster(connection);
        try {
            Object metadata = NoSQLReflection.invokeMethod(cluster, "getMetadata"); //$NON-NLS-1$
            List keySpaces = (List) NoSQLReflection.invokeMethod(metadata, "getKeyspaces"); //$NON-NLS-1$
            for (Object keySpace : keySpaces) {
                String ksName = (String) NoSQLReflection.invokeMethod(keySpace, "getName"); //$NON-NLS-1$
                ksNames.add(ksName);
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return ksNames;
    }

    public static synchronized Set<String> getColumnFamilyNames(NoSQLConnection connection) throws NoSQLServerException {
        return getColumnFamilyNames(connection, null);
    }

    @SuppressWarnings("rawtypes")
    public static synchronized Set<String> getColumnFamilyNames(NoSQLConnection connection, String ksName)
            throws NoSQLServerException {
        Set<String> cfNames = new HashSet<String>();
        try {
            Object keySpace = null;
            if (ksName == null) {
                keySpace = getKeySpace(connection);
            } else {
                keySpace = getKeySpace(connection, ksName);
                if (keySpace == null) {
                    return cfNames;
                }
            }
            if (keySpace == null) {
                List<String> ksNames = getKeySpaceNames(connection);
                for (String name : ksNames) {
                    cfNames.addAll(getColumnFamilyNames(connection, name));
                }
            } else {
                Collection tables = (Collection) NoSQLReflection.invokeMethod(keySpace, "getTables"); //$NON-NLS-1$
                for (Object table : tables) {
                    String cfName = (String) NoSQLReflection.invokeMethod(table, "getName"); //$NON-NLS-1$
                    cfNames.add(cfName);
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return cfNames;
    }

    public static synchronized Set<String> getSuperColumnFamilyNames(NoSQLConnection connection) throws NoSQLServerException {
        return getSuperColumnFamilyNames(connection, null);
    }

    @SuppressWarnings("rawtypes")
    public static synchronized Set<String> getSuperColumnFamilyNames(NoSQLConnection connection, String ksName)
            throws NoSQLServerException {
        Set<String> scfNames = new HashSet<String>();
        Object session = null;
        ClassLoader classLoader = NoSQLClassLoaderFactory.getClassLoader(connection);
        try {
            if (ksName == null) {
                List<String> ksNames = getKeySpaceNames(connection);
                for (String name : ksNames) {
                    scfNames.addAll(getColumnFamilyNames(connection, name));
                }
            } else {
                initCluster(connection);
                session = NoSQLReflection.invokeMethod(cluster, "connect", new Object[] { "system" }); //$NON-NLS-1$ //$NON-NLS-2$
                Object toPrepare = NoSQLReflection.newInstance("com.datastax.driver.core.SimpleStatement", //$NON-NLS-1$
                        new Object[] { "select * from schema_columnfamilies where keyspace_name =?" }, classLoader); //$NON-NLS-1$
                Object prepared = NoSQLReflection.invokeMethod(session, "prepare", new Object[] { toPrepare }, //$NON-NLS-1$
                        Class.forName("com.datastax.driver.core.RegularStatement", false, classLoader)); //$NON-NLS-1$
                Object statement = NoSQLReflection.invokeMethod(prepared, "bind", new Object[] { new Object[] { ksName } }, //$NON-NLS-1$
                        Object[].class);
                // Statement
                Object resultSet = NoSQLReflection.invokeMethod(session, "execute", new Object[] { statement }, //$NON-NLS-1$
                        Class.forName("com.datastax.driver.core.Statement", false, classLoader)); //$NON-NLS-1$
                Iterator iterator = (Iterator) NoSQLReflection.invokeMethod(resultSet, "iterator"); //$NON-NLS-1$
                while (iterator.hasNext()) {
                    Object row = iterator.next();
                    // String type = row.getString("type");s
                    String type = (String) NoSQLReflection.invokeMethod(row, "getString", new Object[] { "type" }); //$NON-NLS-1$ //$NON-NLS-2$
                    String scfName = (String) NoSQLReflection
                            .invokeMethod(row, "getString", new Object[] { "columnfamily_name" }); //$NON-NLS-1$ //$NON-NLS-2$
                    if (type.equalsIgnoreCase("super")) { //$NON-NLS-1$
                        scfNames.add(scfName);
                    }
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        } finally {
            try {
                if (session != null) {
                    NoSQLReflection.invokeMethod(session, "close"); //$NON-NLS-1$
                    closeConnections();
                }
            } catch (NoSQLReflectionException e) {
                // only for debug
                e.printStackTrace();
            }
        }
        return scfNames;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static synchronized List getColumns(NoSQLConnection connection, String ksName, String cfName)
            throws NoSQLServerException {
        List columns = new ArrayList();
        try {
            Object keySpace = getKeySpace(connection, ksName);
            if (keySpace == null) {
                return columns;
            }
            Collection tables = (Collection) NoSQLReflection.invokeMethod(keySpace, "getTables"); //$NON-NLS-1$
            for (Object table : tables) {
                String name = (String) NoSQLReflection.invokeMethod(table, "getName"); //$NON-NLS-1$
                if (name != null && cfName.equals(name)) {
                    columns.addAll((List) NoSQLReflection.invokeMethod(table, "getColumns")); //$NON-NLS-1$
                    break;
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return columns;
    }

    public static synchronized String getColumnName(NoSQLConnection connection, Object column) throws NoSQLServerException {
        String columnName = ""; //$NON-NLS-1$
        try {
            columnName = (String) NoSQLReflection.invokeMethod(column, "getName"); //$NON-NLS-1$
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return columnName;
    }

    @SuppressWarnings("rawtypes")
    public static synchronized String getColumnTalendType(Object column) throws NoSQLServerException {
        JavaType javaType = null;
        try {
            Object type = NoSQLReflection.invokeMethod(column, "getType"); //$NON-NLS-1$
            if (type != null) {
                Object typeName = NoSQLReflection.invokeMethod(type, "getName"); //$NON-NLS-1$
                Class javaClass = (Class) NoSQLReflection.invokeMethod(typeName, "asJavaClass"); //$NON-NLS-1$
                javaType = JavaTypesManager.getJavaTypeFromName(javaClass.getSimpleName());
                if (javaType == null) {
                    javaType = JavaTypesManager.STRING;
                }
            }
        } catch (Exception e) {
            throw new NoSQLServerException(e);
        }
        return javaType.getId();
    }

    public static synchronized void closeConnections() throws NoSQLServerException {
        try {
            if (cluster != null) {
                NoSQLReflection.invokeMethod(cluster, "close"); //$NON-NLS-1$
                cluster = null;
            }
        } catch (NoSQLReflectionException e) {
            throw new NoSQLServerException(e);
        }
    }
}
