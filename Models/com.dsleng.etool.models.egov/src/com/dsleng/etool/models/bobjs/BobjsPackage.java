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
	 * The number of structural features of the '<em>Org Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

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
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 5;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.Inclusions <em>Inclusions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.Inclusions
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getInclusions()
	 * @generated
	 */
	int INCLUSIONS = 6;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.bobjs.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.bobjs.Multiplicity
	 * @see com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 7;


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
