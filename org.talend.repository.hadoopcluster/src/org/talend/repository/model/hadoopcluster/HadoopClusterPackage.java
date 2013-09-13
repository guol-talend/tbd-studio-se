/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hadoopcluster;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.repository.model.hadoopcluster.HadoopClusterFactory
 * @model kind="package"
 * @generated
 */
public interface HadoopClusterPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hadoopcluster";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/hadoopcluster";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendHadoopCluster";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HadoopClusterPackage eINSTANCE = org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionImpl
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopClusterConnection()
     * @generated
     */
    int HADOOP_CLUSTER_CONNECTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__NAME = ConnectionPackage.CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__VISIBILITY = ConnectionPackage.CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CLIENT_DEPENDENCY = ConnectionPackage.CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__SUPPLIER_DEPENDENCY = ConnectionPackage.CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CONSTRAINT = ConnectionPackage.CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__NAMESPACE = ConnectionPackage.CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__IMPORTER = ConnectionPackage.CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__STEREOTYPE = ConnectionPackage.CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__TAGGED_VALUE = ConnectionPackage.CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DOCUMENT = ConnectionPackage.CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DESCRIPTION = ConnectionPackage.CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__RESPONSIBLE_PARTY = ConnectionPackage.CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__ELEMENT_NODE = ConnectionPackage.CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__SET = ConnectionPackage.CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__RENDERED_OBJECT = ConnectionPackage.CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__VOCABULARY_ELEMENT = ConnectionPackage.CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__MEASUREMENT = ConnectionPackage.CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CHANGE_REQUEST = ConnectionPackage.CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DASDL_PROPERTY = ConnectionPackage.CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__PROPERTIES = ConnectionPackage.CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__ID = ConnectionPackage.CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__COMMENT = ConnectionPackage.CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__LABEL = ConnectionPackage.CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__READ_ONLY = ConnectionPackage.CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__SYNCHRONISED = ConnectionPackage.CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DIVERGENCY = ConnectionPackage.CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__OWNED_ELEMENT = ConnectionPackage.CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__IMPORTED_ELEMENT = ConnectionPackage.CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DATA_MANAGER = ConnectionPackage.CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__PATHNAME = ConnectionPackage.CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__MACHINE = ConnectionPackage.CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = ConnectionPackage.CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__COMPONENT = ConnectionPackage.CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__IS_CASE_SENSITIVE = ConnectionPackage.CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CLIENT_CONNECTION = ConnectionPackage.CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DATA_PACKAGE = ConnectionPackage.CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__RESOURCE_CONNECTION = ConnectionPackage.CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__VERSION = ConnectionPackage.CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__QUERIES = ConnectionPackage.CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CONTEXT_MODE = ConnectionPackage.CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CONTEXT_ID = ConnectionPackage.CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Context Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CONTEXT_NAME = ConnectionPackage.CONNECTION__CONTEXT_NAME;

    /**
     * The feature id for the '<em><b>Distribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DISTRIBUTION = ConnectionPackage.CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Df Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__DF_VERSION = ConnectionPackage.CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Use Custom Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__USE_CUSTOM_VERSION = ConnectionPackage.CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Yarn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__USE_YARN = ConnectionPackage.CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__SERVER = ConnectionPackage.CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name Node URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__NAME_NODE_URI = ConnectionPackage.CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Job Tracker URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__JOB_TRACKER_URI = ConnectionPackage.CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Enable Kerberos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__ENABLE_KERBEROS = ConnectionPackage.CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Principal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__PRINCIPAL = ConnectionPackage.CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__USER_NAME = ConnectionPackage.CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__GROUP = ConnectionPackage.CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Auth Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__AUTH_MODE = ConnectionPackage.CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Connection List</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__CONNECTION_LIST = ConnectionPackage.CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION__PARAMETERS = ConnectionPackage.CONNECTION_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_FEATURE_COUNT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 14;

    /**
     * The meta object id for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionItemImpl <em>Connection Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionItemImpl
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopClusterConnectionItem()
     * @generated
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM = 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__PROPERTY = PropertiesPackage.CONNECTION_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__STATE = PropertiesPackage.CONNECTION_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__PARENT = PropertiesPackage.CONNECTION_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Reference Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__REFERENCE_RESOURCES = PropertiesPackage.CONNECTION_ITEM__REFERENCE_RESOURCES;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__FILE_EXTENSION = PropertiesPackage.CONNECTION_ITEM__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Need Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__NEED_VERSION = PropertiesPackage.CONNECTION_ITEM__NEED_VERSION;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM__CONNECTION = PropertiesPackage.CONNECTION_ITEM__CONNECTION;

    /**
     * The number of structural features of the '<em>Connection Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_CLUSTER_CONNECTION_ITEM_FEATURE_COUNT = PropertiesPackage.CONNECTION_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopAdditionalPropertiesImpl <em>Hadoop Additional Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopAdditionalPropertiesImpl
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopAdditionalProperties()
     * @generated
     */
    int HADOOP_ADDITIONAL_PROPERTIES = 2;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_ADDITIONAL_PROPERTIES__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_ADDITIONAL_PROPERTIES__VALUE = 1;

    /**
     * The number of structural features of the '<em>Hadoop Additional Properties</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_ADDITIONAL_PROPERTIES_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionImpl <em>Hadoop Sub Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionImpl
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopSubConnection()
     * @generated
     */
    int HADOOP_SUB_CONNECTION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__NAME = ConnectionPackage.CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__VISIBILITY = ConnectionPackage.CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CLIENT_DEPENDENCY = ConnectionPackage.CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__SUPPLIER_DEPENDENCY = ConnectionPackage.CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CONSTRAINT = ConnectionPackage.CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__NAMESPACE = ConnectionPackage.CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__IMPORTER = ConnectionPackage.CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__STEREOTYPE = ConnectionPackage.CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__TAGGED_VALUE = ConnectionPackage.CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DOCUMENT = ConnectionPackage.CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DESCRIPTION = ConnectionPackage.CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__RESPONSIBLE_PARTY = ConnectionPackage.CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__ELEMENT_NODE = ConnectionPackage.CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__SET = ConnectionPackage.CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__RENDERED_OBJECT = ConnectionPackage.CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__VOCABULARY_ELEMENT = ConnectionPackage.CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__MEASUREMENT = ConnectionPackage.CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CHANGE_REQUEST = ConnectionPackage.CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DASDL_PROPERTY = ConnectionPackage.CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__PROPERTIES = ConnectionPackage.CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__ID = ConnectionPackage.CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__COMMENT = ConnectionPackage.CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__LABEL = ConnectionPackage.CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__READ_ONLY = ConnectionPackage.CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__SYNCHRONISED = ConnectionPackage.CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DIVERGENCY = ConnectionPackage.CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__OWNED_ELEMENT = ConnectionPackage.CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__IMPORTED_ELEMENT = ConnectionPackage.CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DATA_MANAGER = ConnectionPackage.CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__PATHNAME = ConnectionPackage.CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__MACHINE = ConnectionPackage.CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = ConnectionPackage.CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__COMPONENT = ConnectionPackage.CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__IS_CASE_SENSITIVE = ConnectionPackage.CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CLIENT_CONNECTION = ConnectionPackage.CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__DATA_PACKAGE = ConnectionPackage.CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__RESOURCE_CONNECTION = ConnectionPackage.CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__VERSION = ConnectionPackage.CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__QUERIES = ConnectionPackage.CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CONTEXT_MODE = ConnectionPackage.CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CONTEXT_ID = ConnectionPackage.CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Context Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__CONTEXT_NAME = ConnectionPackage.CONNECTION__CONTEXT_NAME;

    /**
     * The feature id for the '<em><b>Relative Hadoop Cluster Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION__RELATIVE_HADOOP_CLUSTER_ID = ConnectionPackage.CONNECTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hadoop Sub Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_FEATURE_COUNT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionItemImpl <em>Hadoop Sub Connection Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionItemImpl
     * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopSubConnectionItem()
     * @generated
     */
    int HADOOP_SUB_CONNECTION_ITEM = 4;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__PROPERTY = PropertiesPackage.CONNECTION_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__STATE = PropertiesPackage.CONNECTION_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__PARENT = PropertiesPackage.CONNECTION_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Reference Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__REFERENCE_RESOURCES = PropertiesPackage.CONNECTION_ITEM__REFERENCE_RESOURCES;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__FILE_EXTENSION = PropertiesPackage.CONNECTION_ITEM__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Need Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__NEED_VERSION = PropertiesPackage.CONNECTION_ITEM__NEED_VERSION;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM__CONNECTION = PropertiesPackage.CONNECTION_ITEM__CONNECTION;

    /**
     * The number of structural features of the '<em>Hadoop Sub Connection Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HADOOP_SUB_CONNECTION_ITEM_FEATURE_COUNT = PropertiesPackage.CONNECTION_ITEM_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection
     * @generated
     */
    EClass getHadoopClusterConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getDistribution <em>Distribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distribution</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getDistribution()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_Distribution();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getDfVersion <em>Df Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Df Version</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getDfVersion()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_DfVersion();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isUseCustomVersion <em>Use Custom Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Custom Version</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isUseCustomVersion()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_UseCustomVersion();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isUseYarn <em>Use Yarn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Yarn</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isUseYarn()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_UseYarn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getServer <em>Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getServer()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_Server();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getNameNodeURI <em>Name Node URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Node URI</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getNameNodeURI()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_NameNodeURI();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getJobTrackerURI <em>Job Tracker URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Job Tracker URI</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getJobTrackerURI()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_JobTrackerURI();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isEnableKerberos <em>Enable Kerberos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enable Kerberos</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#isEnableKerberos()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_EnableKerberos();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getPrincipal <em>Principal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Principal</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getPrincipal()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_Principal();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getUserName()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_UserName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getGroup()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_Group();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getAuthMode <em>Auth Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auth Mode</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getAuthMode()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_AuthMode();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getConnectionList <em>Connection List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Connection List</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getConnectionList()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EAttribute getHadoopClusterConnection_ConnectionList();

    /**
     * Returns the meta object for the map '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Parameters</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnection#getParameters()
     * @see #getHadoopClusterConnection()
     * @generated
     */
    EReference getHadoopClusterConnection_Parameters();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem <em>Connection Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Item</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem
     * @generated
     */
    EClass getHadoopClusterConnectionItem();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Hadoop Additional Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hadoop Additional Properties</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
     *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    EClass getHadoopAdditionalProperties();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getHadoopAdditionalProperties()
     * @generated
     */
    EAttribute getHadoopAdditionalProperties_Key();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getHadoopAdditionalProperties()
     * @generated
     */
    EAttribute getHadoopAdditionalProperties_Value();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hadoopcluster.HadoopSubConnection <em>Hadoop Sub Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hadoop Sub Connection</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopSubConnection
     * @generated
     */
    EClass getHadoopSubConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hadoopcluster.HadoopSubConnection#getRelativeHadoopClusterId <em>Relative Hadoop Cluster Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relative Hadoop Cluster Id</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopSubConnection#getRelativeHadoopClusterId()
     * @see #getHadoopSubConnection()
     * @generated
     */
    EAttribute getHadoopSubConnection_RelativeHadoopClusterId();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hadoopcluster.HadoopSubConnectionItem <em>Hadoop Sub Connection Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hadoop Sub Connection Item</em>'.
     * @see org.talend.repository.model.hadoopcluster.HadoopSubConnectionItem
     * @generated
     */
    EClass getHadoopSubConnectionItem();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HadoopClusterFactory getHadoopClusterFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionImpl
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopClusterConnection()
         * @generated
         */
        EClass HADOOP_CLUSTER_CONNECTION = eINSTANCE.getHadoopClusterConnection();

        /**
         * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__DISTRIBUTION = eINSTANCE.getHadoopClusterConnection_Distribution();

        /**
         * The meta object literal for the '<em><b>Df Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__DF_VERSION = eINSTANCE.getHadoopClusterConnection_DfVersion();

        /**
         * The meta object literal for the '<em><b>Use Custom Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__USE_CUSTOM_VERSION = eINSTANCE.getHadoopClusterConnection_UseCustomVersion();

        /**
         * The meta object literal for the '<em><b>Use Yarn</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__USE_YARN = eINSTANCE.getHadoopClusterConnection_UseYarn();

        /**
         * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__SERVER = eINSTANCE.getHadoopClusterConnection_Server();

        /**
         * The meta object literal for the '<em><b>Name Node URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__NAME_NODE_URI = eINSTANCE.getHadoopClusterConnection_NameNodeURI();

        /**
         * The meta object literal for the '<em><b>Job Tracker URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__JOB_TRACKER_URI = eINSTANCE.getHadoopClusterConnection_JobTrackerURI();

        /**
         * The meta object literal for the '<em><b>Enable Kerberos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__ENABLE_KERBEROS = eINSTANCE.getHadoopClusterConnection_EnableKerberos();

        /**
         * The meta object literal for the '<em><b>Principal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__PRINCIPAL = eINSTANCE.getHadoopClusterConnection_Principal();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__USER_NAME = eINSTANCE.getHadoopClusterConnection_UserName();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__GROUP = eINSTANCE.getHadoopClusterConnection_Group();

        /**
         * The meta object literal for the '<em><b>Auth Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__AUTH_MODE = eINSTANCE.getHadoopClusterConnection_AuthMode();

        /**
         * The meta object literal for the '<em><b>Connection List</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_CLUSTER_CONNECTION__CONNECTION_LIST = eINSTANCE.getHadoopClusterConnection_ConnectionList();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HADOOP_CLUSTER_CONNECTION__PARAMETERS = eINSTANCE.getHadoopClusterConnection_Parameters();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionItemImpl <em>Connection Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionItemImpl
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopClusterConnectionItem()
         * @generated
         */
        EClass HADOOP_CLUSTER_CONNECTION_ITEM = eINSTANCE.getHadoopClusterConnectionItem();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopAdditionalPropertiesImpl <em>Hadoop Additional Properties</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopAdditionalPropertiesImpl
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopAdditionalProperties()
         * @generated
         */
        EClass HADOOP_ADDITIONAL_PROPERTIES = eINSTANCE.getHadoopAdditionalProperties();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_ADDITIONAL_PROPERTIES__KEY = eINSTANCE.getHadoopAdditionalProperties_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_ADDITIONAL_PROPERTIES__VALUE = eINSTANCE.getHadoopAdditionalProperties_Value();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionImpl <em>Hadoop Sub Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionImpl
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopSubConnection()
         * @generated
         */
        EClass HADOOP_SUB_CONNECTION = eINSTANCE.getHadoopSubConnection();

        /**
         * The meta object literal for the '<em><b>Relative Hadoop Cluster Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HADOOP_SUB_CONNECTION__RELATIVE_HADOOP_CLUSTER_ID = eINSTANCE.getHadoopSubConnection_RelativeHadoopClusterId();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionItemImpl <em>Hadoop Sub Connection Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionItemImpl
         * @see org.talend.repository.model.hadoopcluster.impl.HadoopClusterPackageImpl#getHadoopSubConnectionItem()
         * @generated
         */
        EClass HADOOP_SUB_CONNECTION_ITEM = eINSTANCE.getHadoopSubConnectionItem();

    }

} //HadoopClusterPackage
