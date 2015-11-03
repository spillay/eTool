/**
 */
package com.dsleng.etool.models.bobjs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.models.bobjs.BobjsFactory
 * @model kind="package"
 * @generated
 */
public interface BobjsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bobjs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/dsleng/etool/models/bobjs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.dsleng.etool.models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BobjsPackage eINSTANCE = com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.NamedElementImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.OrgUnitImpl <em>Org Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.OrgUnitImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOrgUnit()
	 * @generated
	 */
	int ORG_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Businessobjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__BUSINESSOBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__ARTIFACT_ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__GROUP_ID = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__LANG_FILE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__DIR_LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Web Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__WEB_DIRECTORY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Boenums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT__BOENUMS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.AttributeImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_MANAGEMENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.ReferencesImpl <em>References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.ReferencesImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getReferences()
	 * @generated
	 */
	int REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Businessobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__BUSINESSOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Inclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__INCLUSION = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__MULTIPLICITY = 2;

	/**
	 * The number of structural features of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__SUPER_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ENUMS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Basedon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__BASEDON = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.BOEnumImpl <em>BO Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.BOEnumImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBOEnum()
	 * @generated
	 */
	int BO_ENUM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ENUM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ENUM__LITERAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BO Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ENUM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BO Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ENUM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.LiteralImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.EnumImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Boenum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BOENUM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.BasedOnImpl <em>Based On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.BasedOnImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBasedOn()
	 * @generated
	 */
	int BASED_ON = 8;

	/**
	 * The feature id for the '<em><b>Businessobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON__BUSINESSOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Removes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON__REMOVES = 1;

	/**
	 * The number of structural features of the '<em>Based On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Based On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.OperationImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Opparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SYNTAX = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.OpParameterImpl <em>Op Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.OpParameterImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOpParameter()
	 * @generated
	 */
	int OP_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Op Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Op Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.AnnotationImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.impl.BusinessTypeImpl <em>Business Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.impl.BusinessTypeImpl
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBusinessType()
	 * @generated
	 */
	int BUSINESS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__NAME = BUSINESS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__ATTRIBUTES = BUSINESS_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__REFERENCES = BUSINESS_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__SUPER_TYPES = BUSINESS_OBJECT__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__ENUMS = BUSINESS_OBJECT__ENUMS;

	/**
	 * The feature id for the '<em><b>Basedon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__BASEDON = BUSINESS_OBJECT__BASEDON;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE__OPERATIONS = BUSINESS_OBJECT__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Business Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE_FEATURE_COUNT = BUSINESS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TYPE_OPERATION_COUNT = BUSINESS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 13;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.Inclusions <em>Inclusions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.Inclusions
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getInclusions()
	 * @generated
	 */
	int INCLUSIONS = 14;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.Multiplicity
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 15;


	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.dsleng.etool.models.bobjs.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.bobjs.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Unit</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit
	 * @generated
	 */
	EClass getOrgUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.OrgUnit#getBusinessobjects <em>Businessobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businessobjects</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getBusinessobjects()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EReference getOrgUnit_Businessobjects();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getArtifactId()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getGroupId()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getLangFile <em>Lang File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang File</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getLangFile()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_LangFile();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getVersion()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getDirLocation <em>Dir Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Location</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getDirLocation()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_DirLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getWebDirectory <em>Web Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Directory</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getWebDirectory()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_WebDirectory();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OrgUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getPackage()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EAttribute getOrgUnit_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.OrgUnit#getBoenums <em>Boenums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boenums</em>'.
	 * @see com.dsleng.etool.models.bobjs.OrgUnit#getBoenums()
	 * @see #getOrgUnit()
	 * @generated
	 */
	EReference getOrgUnit_Boenums();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Attribute#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute#isMandatory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Attribute#isDataManagement <em>Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Management</em>'.
	 * @see com.dsleng.etool.models.bobjs.Attribute#isDataManagement()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataManagement();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References</em>'.
	 * @see com.dsleng.etool.models.bobjs.References
	 * @generated
	 */
	EClass getReferences();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.bobjs.References#getBusinessobject <em>Businessobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Businessobject</em>'.
	 * @see com.dsleng.etool.models.bobjs.References#getBusinessobject()
	 * @see #getReferences()
	 * @generated
	 */
	EReference getReferences_Businessobject();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.References#getInclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusion</em>'.
	 * @see com.dsleng.etool.models.bobjs.References#getInclusion()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Inclusion();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.References#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see com.dsleng.etool.models.bobjs.References#getMultiplicity()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Multiplicity();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getAttributes()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getReferences()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_References();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getSuperTypes()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getEnums()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Enums();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getBasedon <em>Basedon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basedon</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getBasedon()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Basedon();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BusinessObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessObject#getOperations()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Operations();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.BOEnum <em>BO Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BO Enum</em>'.
	 * @see com.dsleng.etool.models.bobjs.BOEnum
	 * @generated
	 */
	EClass getBOEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.BOEnum#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see com.dsleng.etool.models.bobjs.BOEnum#getLiteral()
	 * @see #getBOEnum()
	 * @generated
	 */
	EReference getBOEnum_Literal();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.dsleng.etool.models.bobjs.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see com.dsleng.etool.models.bobjs.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.bobjs.Enum#getBoenum <em>Boenum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boenum</em>'.
	 * @see com.dsleng.etool.models.bobjs.Enum#getBoenum()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Boenum();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.BasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Based On</em>'.
	 * @see com.dsleng.etool.models.bobjs.BasedOn
	 * @generated
	 */
	EClass getBasedOn();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.bobjs.BasedOn#getBusinessobject <em>Businessobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Businessobject</em>'.
	 * @see com.dsleng.etool.models.bobjs.BasedOn#getBusinessobject()
	 * @see #getBasedOn()
	 * @generated
	 */
	EReference getBasedOn_Businessobject();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.bobjs.BasedOn#getRemoves <em>Removes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Removes</em>'.
	 * @see com.dsleng.etool.models.bobjs.BasedOn#getRemoves()
	 * @see #getBasedOn()
	 * @generated
	 */
	EReference getBasedOn_Removes();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.Operation#getOpparameters <em>Opparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opparameters</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation#getOpparameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Opparameters();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Operation#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation#getSyntax()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Syntax();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.bobjs.Operation#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.dsleng.etool.models.bobjs.Operation#getAnnotations()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Annotations();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.OpParameter <em>Op Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Parameter</em>'.
	 * @see com.dsleng.etool.models.bobjs.OpParameter
	 * @generated
	 */
	EClass getOpParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OpParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.bobjs.OpParameter#getName()
	 * @see #getOpParameter()
	 * @generated
	 */
	EAttribute getOpParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.OpParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dsleng.etool.models.bobjs.OpParameter#getType()
	 * @see #getOpParameter()
	 * @generated
	 */
	EAttribute getOpParameter_Type();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.dsleng.etool.models.bobjs.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.bobjs.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.bobjs.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.bobjs.BusinessType <em>Business Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Type</em>'.
	 * @see com.dsleng.etool.models.bobjs.BusinessType
	 * @generated
	 */
	EClass getBusinessType();

	/**
	 * Returns the meta object for enum '{@link com.dsleng.etool.models.bobjs.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Types</em>'.
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @generated
	 */
	EEnum getDataTypes();

	/**
	 * Returns the meta object for enum '{@link com.dsleng.etool.models.bobjs.Inclusions <em>Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inclusions</em>'.
	 * @see com.dsleng.etool.models.bobjs.Inclusions
	 * @generated
	 */
	EEnum getInclusions();

	/**
	 * Returns the meta object for enum '{@link com.dsleng.etool.models.bobjs.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see com.dsleng.etool.models.bobjs.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BobjsFactory getBobjsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.NamedElementImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.OrgUnitImpl <em>Org Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.OrgUnitImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOrgUnit()
		 * @generated
		 */
		EClass ORG_UNIT = eINSTANCE.getOrgUnit();

		/**
		 * The meta object literal for the '<em><b>Businessobjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_UNIT__BUSINESSOBJECTS = eINSTANCE.getOrgUnit_Businessobjects();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__ARTIFACT_ID = eINSTANCE.getOrgUnit_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__GROUP_ID = eINSTANCE.getOrgUnit_GroupId();

		/**
		 * The meta object literal for the '<em><b>Lang File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__LANG_FILE = eINSTANCE.getOrgUnit_LangFile();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__VERSION = eINSTANCE.getOrgUnit_Version();

		/**
		 * The meta object literal for the '<em><b>Dir Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__DIR_LOCATION = eINSTANCE.getOrgUnit_DirLocation();

		/**
		 * The meta object literal for the '<em><b>Web Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__WEB_DIRECTORY = eINSTANCE.getOrgUnit_WebDirectory();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORG_UNIT__PACKAGE = eINSTANCE.getOrgUnit_Package();

		/**
		 * The meta object literal for the '<em><b>Boenums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORG_UNIT__BOENUMS = eINSTANCE.getOrgUnit_Boenums();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.AttributeImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MANDATORY = eINSTANCE.getAttribute_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Data Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_MANAGEMENT = eINSTANCE.getAttribute_DataManagement();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.ReferencesImpl <em>References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.ReferencesImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getReferences()
		 * @generated
		 */
		EClass REFERENCES = eINSTANCE.getReferences();

		/**
		 * The meta object literal for the '<em><b>Businessobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES__BUSINESSOBJECT = eINSTANCE.getReferences_Businessobject();

		/**
		 * The meta object literal for the '<em><b>Inclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES__INCLUSION = eINSTANCE.getReferences_Inclusion();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES__MULTIPLICITY = eINSTANCE.getReferences_Multiplicity();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl <em>Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBusinessObject()
		 * @generated
		 */
		EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__ATTRIBUTES = eINSTANCE.getBusinessObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__REFERENCES = eINSTANCE.getBusinessObject_References();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__SUPER_TYPES = eINSTANCE.getBusinessObject_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__ENUMS = eINSTANCE.getBusinessObject_Enums();

		/**
		 * The meta object literal for the '<em><b>Basedon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__BASEDON = eINSTANCE.getBusinessObject_Basedon();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__OPERATIONS = eINSTANCE.getBusinessObject_Operations();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.BOEnumImpl <em>BO Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.BOEnumImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBOEnum()
		 * @generated
		 */
		EClass BO_ENUM = eINSTANCE.getBOEnum();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ENUM__LITERAL = eINSTANCE.getBOEnum_Literal();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.LiteralImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.EnumImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Boenum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__BOENUM = eINSTANCE.getEnum_Boenum();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.BasedOnImpl <em>Based On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.BasedOnImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBasedOn()
		 * @generated
		 */
		EClass BASED_ON = eINSTANCE.getBasedOn();

		/**
		 * The meta object literal for the '<em><b>Businessobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON__BUSINESSOBJECT = eINSTANCE.getBasedOn_Businessobject();

		/**
		 * The meta object literal for the '<em><b>Removes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON__REMOVES = eINSTANCE.getBasedOn_Removes();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.OperationImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Opparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPPARAMETERS = eINSTANCE.getOperation_Opparameters();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SYNTAX = eINSTANCE.getOperation_Syntax();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ANNOTATIONS = eINSTANCE.getOperation_Annotations();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.OpParameterImpl <em>Op Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.OpParameterImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getOpParameter()
		 * @generated
		 */
		EClass OP_PARAMETER = eINSTANCE.getOpParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_PARAMETER__NAME = eINSTANCE.getOpParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_PARAMETER__TYPE = eINSTANCE.getOpParameter_Type();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.AnnotationImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.impl.BusinessTypeImpl <em>Business Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.impl.BusinessTypeImpl
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getBusinessType()
		 * @generated
		 */
		EClass BUSINESS_TYPE = eINSTANCE.getBusinessType();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.DataTypes <em>Data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.DataTypes
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getDataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getDataTypes();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.Inclusions <em>Inclusions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.Inclusions
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getInclusions()
		 * @generated
		 */
		EEnum INCLUSIONS = eINSTANCE.getInclusions();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.bobjs.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.bobjs.Multiplicity
		 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

	}

} //BobjsPackage
