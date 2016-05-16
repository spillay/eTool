/**
 */
package com.dsleng.etool.models.egov;

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
 * @see com.dsleng.etool.models.egov.EgovFactory
 * @model kind="package"
 * @generated
 */
public interface EgovPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "egov";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/dsleng/etool/models/egov";

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
	EgovPackage eINSTANCE = com.dsleng.etool.models.egov.impl.EgovPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.WebElementImpl <em>Web Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.WebElementImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getWebElement()
	 * @generated
	 */
	int WEB_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Web Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Web Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.EServiceImpl <em>EService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.EServiceImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getEService()
	 * @generated
	 */
	int ESERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__NAME = WEB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__PAGES = WEB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__INDEX_PAGE = WEB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__DIR_LOCATION = WEB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Business Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__BUSINESS_UNIT = WEB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__IMPORTS = WEB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Admin Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__ADMIN_PAGES = WEB_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__MENU = WEB_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_FEATURE_COUNT = WEB_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_OPERATION_COUNT = WEB_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.PageImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = WEB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NEXT_PAGE = WEB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BO Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BO_MAPS = WEB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGETYPE = WEB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = WEB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extra Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EXTRA_CONTROLS = WEB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NORTH = WEB_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SOUTH = WEB_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__WEST = WEB_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EAST = WEB_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Businesstype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BUSINESSTYPE = WEB_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = WEB_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = WEB_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.BOMapperImpl <em>BO Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.BOMapperImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getBOMapper()
	 * @generated
	 */
	int BO_MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_MAPPER__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_MAPPER__BUSINESS_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Botype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_MAPPER__BOTYPE = 2;

	/**
	 * The number of structural features of the '<em>BO Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_MAPPER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BO Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.BOAttributeImpl <em>BO Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.BOAttributeImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getBOAttribute()
	 * @generated
	 */
	int BO_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Controltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE__CONTROLTYPE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Controlparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE__CONTROLPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Predefinedcontainers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE__PREDEFINEDCONTAINERS = 3;

	/**
	 * The number of structural features of the '<em>BO Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BO Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.PreDefinedValueImpl <em>Pre Defined Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.PreDefinedValueImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPreDefinedValue()
	 * @generated
	 */
	int PRE_DEFINED_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Pre Defined Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pre Defined Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.ControlMapperImpl <em>Control Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.ControlMapperImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getControlMapper()
	 * @generated
	 */
	int CONTROL_MAPPER = 5;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MAPPER__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MAPPER__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Mapped To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MAPPER__MAPPED_TO = 2;

	/**
	 * The number of structural features of the '<em>Control Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MAPPER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.PreDefinedContainerImpl <em>Pre Defined Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.PreDefinedContainerImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPreDefinedContainer()
	 * @generated
	 */
	int PRE_DEFINED_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Predefinedvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_CONTAINER__PREDEFINEDVALUES = 1;

	/**
	 * The number of structural features of the '<em>Pre Defined Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Defined Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_DEFINED_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.ImportImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.AdminImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 8;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Businesstypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__BUSINESSTYPES = 1;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__MENU = 2;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.MenuImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = WEB_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PARENT_MENU = WEB_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DESCRIPTION = WEB_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PAGE = WEB_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Menu Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MENU_TYPE = WEB_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = WEB_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = WEB_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.MenuType <em>Menu Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.MenuType
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getMenuType()
	 * @generated
	 */
	int MENU_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.EService <em>EService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EService</em>'.
	 * @see com.dsleng.etool.models.egov.EService
	 * @generated
	 */
	EClass getEService();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.EService#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getPages()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_Pages();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.EService#getIndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Page</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getIndexPage()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_IndexPage();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.EService#getDirLocation <em>Dir Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir Location</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getDirLocation()
	 * @see #getEService()
	 * @generated
	 */
	EAttribute getEService_DirLocation();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.EService#getBusinessUnit <em>Business Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Unit</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getBusinessUnit()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_BusinessUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.EService#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getImports()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link com.dsleng.etool.models.egov.EService#getAdminPages <em>Admin Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admin Pages</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getAdminPages()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_AdminPages();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.EService#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see com.dsleng.etool.models.egov.EService#getMenu()
	 * @see #getEService()
	 * @generated
	 */
	EReference getEService_Menu();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see com.dsleng.etool.models.egov.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.Page#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getNextPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_NextPage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.Page#getBOMaps <em>BO Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BO Maps</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getBOMaps()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_BOMaps();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.Page#getPagetype <em>Pagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pagetype</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getPagetype()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagetype();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.egov.Page#getExtraControls <em>Extra Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extra Controls</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getExtraControls()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ExtraControls();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Page#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getNorth()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_North();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Page#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getSouth()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_South();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Page#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getWest()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_West();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Page#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getEast()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_East();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.Page#getBusinesstype <em>Businesstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Businesstype</em>'.
	 * @see com.dsleng.etool.models.egov.Page#getBusinesstype()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Businesstype();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.BOMapper <em>BO Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BO Mapper</em>'.
	 * @see com.dsleng.etool.models.egov.BOMapper
	 * @generated
	 */
	EClass getBOMapper();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.BOMapper#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.dsleng.etool.models.egov.BOMapper#getAttributes()
	 * @see #getBOMapper()
	 * @generated
	 */
	EReference getBOMapper_Attributes();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.BOMapper#getBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Object</em>'.
	 * @see com.dsleng.etool.models.egov.BOMapper#getBusinessObject()
	 * @see #getBOMapper()
	 * @generated
	 */
	EReference getBOMapper_BusinessObject();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.BOMapper#getBotype <em>Botype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Botype</em>'.
	 * @see com.dsleng.etool.models.egov.BOMapper#getBotype()
	 * @see #getBOMapper()
	 * @generated
	 */
	EReference getBOMapper_Botype();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.BOAttribute <em>BO Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BO Attribute</em>'.
	 * @see com.dsleng.etool.models.egov.BOAttribute
	 * @generated
	 */
	EClass getBOAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.BOAttribute#getControltype <em>Controltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controltype</em>'.
	 * @see com.dsleng.etool.models.egov.BOAttribute#getControltype()
	 * @see #getBOAttribute()
	 * @generated
	 */
	EReference getBOAttribute_Controltype();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.BOAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see com.dsleng.etool.models.egov.BOAttribute#getAttribute()
	 * @see #getBOAttribute()
	 * @generated
	 */
	EReference getBOAttribute_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.BOAttribute#getControlparameters <em>Controlparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlparameters</em>'.
	 * @see com.dsleng.etool.models.egov.BOAttribute#getControlparameters()
	 * @see #getBOAttribute()
	 * @generated
	 */
	EReference getBOAttribute_Controlparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.BOAttribute#getPredefinedcontainers <em>Predefinedcontainers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefinedcontainers</em>'.
	 * @see com.dsleng.etool.models.egov.BOAttribute#getPredefinedcontainers()
	 * @see #getBOAttribute()
	 * @generated
	 */
	EReference getBOAttribute_Predefinedcontainers();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.PreDefinedValue <em>Pre Defined Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Defined Value</em>'.
	 * @see com.dsleng.etool.models.egov.PreDefinedValue
	 * @generated
	 */
	EClass getPreDefinedValue();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.PreDefinedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.dsleng.etool.models.egov.PreDefinedValue#getValue()
	 * @see #getPreDefinedValue()
	 * @generated
	 */
	EAttribute getPreDefinedValue_Value();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.ControlMapper <em>Control Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Mapper</em>'.
	 * @see com.dsleng.etool.models.egov.ControlMapper
	 * @generated
	 */
	EClass getControlMapper();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.ControlMapper#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see com.dsleng.etool.models.egov.ControlMapper#getOption()
	 * @see #getControlMapper()
	 * @generated
	 */
	EReference getControlMapper_Option();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.ControlMapper#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see com.dsleng.etool.models.egov.ControlMapper#getAttribute()
	 * @see #getControlMapper()
	 * @generated
	 */
	EReference getControlMapper_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.ControlMapper#getMappedTo <em>Mapped To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped To</em>'.
	 * @see com.dsleng.etool.models.egov.ControlMapper#getMappedTo()
	 * @see #getControlMapper()
	 * @generated
	 */
	EAttribute getControlMapper_MappedTo();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.PreDefinedContainer <em>Pre Defined Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Defined Container</em>'.
	 * @see com.dsleng.etool.models.egov.PreDefinedContainer
	 * @generated
	 */
	EClass getPreDefinedContainer();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.PreDefinedContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.egov.PreDefinedContainer#getName()
	 * @see #getPreDefinedContainer()
	 * @generated
	 */
	EAttribute getPreDefinedContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.PreDefinedContainer#getPredefinedvalues <em>Predefinedvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predefinedvalues</em>'.
	 * @see com.dsleng.etool.models.egov.PreDefinedContainer#getPredefinedvalues()
	 * @see #getPreDefinedContainer()
	 * @generated
	 */
	EReference getPreDefinedContainer_Predefinedvalues();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see com.dsleng.etool.models.egov.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see com.dsleng.etool.models.egov.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see com.dsleng.etool.models.egov.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.Admin#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see com.dsleng.etool.models.egov.Admin#getPages()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Pages();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.egov.Admin#getBusinesstypes <em>Businesstypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Businesstypes</em>'.
	 * @see com.dsleng.etool.models.egov.Admin#getBusinesstypes()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Businesstypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.egov.Admin#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see com.dsleng.etool.models.egov.Admin#getMenu()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Menu();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see com.dsleng.etool.models.egov.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.Menu#getParentMenu <em>Parent Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Menu</em>'.
	 * @see com.dsleng.etool.models.egov.Menu#getParentMenu()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_ParentMenu();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Menu#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.dsleng.etool.models.egov.Menu#getDescription()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Description();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.egov.Menu#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see com.dsleng.etool.models.egov.Menu#getPage()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Page();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.Menu#getMenuType <em>Menu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Type</em>'.
	 * @see com.dsleng.etool.models.egov.Menu#getMenuType()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_MenuType();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.WebElement <em>Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Element</em>'.
	 * @see com.dsleng.etool.models.egov.WebElement
	 * @generated
	 */
	EClass getWebElement();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.WebElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.egov.WebElement#getName()
	 * @see #getWebElement()
	 * @generated
	 */
	EAttribute getWebElement_Name();

	/**
	 * Returns the meta object for enum '{@link com.dsleng.etool.models.egov.MenuType <em>Menu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Menu Type</em>'.
	 * @see com.dsleng.etool.models.egov.MenuType
	 * @generated
	 */
	EEnum getMenuType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EgovFactory getEgovFactory();

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
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.EServiceImpl <em>EService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.EServiceImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getEService()
		 * @generated
		 */
		EClass ESERVICE = eINSTANCE.getEService();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__PAGES = eINSTANCE.getEService_Pages();

		/**
		 * The meta object literal for the '<em><b>Index Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__INDEX_PAGE = eINSTANCE.getEService_IndexPage();

		/**
		 * The meta object literal for the '<em><b>Dir Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESERVICE__DIR_LOCATION = eINSTANCE.getEService_DirLocation();

		/**
		 * The meta object literal for the '<em><b>Business Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__BUSINESS_UNIT = eINSTANCE.getEService_BusinessUnit();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__IMPORTS = eINSTANCE.getEService_Imports();

		/**
		 * The meta object literal for the '<em><b>Admin Pages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__ADMIN_PAGES = eINSTANCE.getEService_AdminPages();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESERVICE__MENU = eINSTANCE.getEService_Menu();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.PageImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__NEXT_PAGE = eINSTANCE.getPage_NextPage();

		/**
		 * The meta object literal for the '<em><b>BO Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__BO_MAPS = eINSTANCE.getPage_BOMaps();

		/**
		 * The meta object literal for the '<em><b>Pagetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGETYPE = eINSTANCE.getPage_Pagetype();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Extra Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__EXTRA_CONTROLS = eINSTANCE.getPage_ExtraControls();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NORTH = eINSTANCE.getPage_North();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__SOUTH = eINSTANCE.getPage_South();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__WEST = eINSTANCE.getPage_West();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__EAST = eINSTANCE.getPage_East();

		/**
		 * The meta object literal for the '<em><b>Businesstype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__BUSINESSTYPE = eINSTANCE.getPage_Businesstype();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.BOMapperImpl <em>BO Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.BOMapperImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getBOMapper()
		 * @generated
		 */
		EClass BO_MAPPER = eINSTANCE.getBOMapper();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_MAPPER__ATTRIBUTES = eINSTANCE.getBOMapper_Attributes();

		/**
		 * The meta object literal for the '<em><b>Business Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_MAPPER__BUSINESS_OBJECT = eINSTANCE.getBOMapper_BusinessObject();

		/**
		 * The meta object literal for the '<em><b>Botype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_MAPPER__BOTYPE = eINSTANCE.getBOMapper_Botype();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.BOAttributeImpl <em>BO Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.BOAttributeImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getBOAttribute()
		 * @generated
		 */
		EClass BO_ATTRIBUTE = eINSTANCE.getBOAttribute();

		/**
		 * The meta object literal for the '<em><b>Controltype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ATTRIBUTE__CONTROLTYPE = eINSTANCE.getBOAttribute_Controltype();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getBOAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Controlparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ATTRIBUTE__CONTROLPARAMETERS = eINSTANCE.getBOAttribute_Controlparameters();

		/**
		 * The meta object literal for the '<em><b>Predefinedcontainers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BO_ATTRIBUTE__PREDEFINEDCONTAINERS = eINSTANCE.getBOAttribute_Predefinedcontainers();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.PreDefinedValueImpl <em>Pre Defined Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.PreDefinedValueImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPreDefinedValue()
		 * @generated
		 */
		EClass PRE_DEFINED_VALUE = eINSTANCE.getPreDefinedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_DEFINED_VALUE__VALUE = eINSTANCE.getPreDefinedValue_Value();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.ControlMapperImpl <em>Control Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.ControlMapperImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getControlMapper()
		 * @generated
		 */
		EClass CONTROL_MAPPER = eINSTANCE.getControlMapper();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MAPPER__OPTION = eINSTANCE.getControlMapper_Option();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MAPPER__ATTRIBUTE = eINSTANCE.getControlMapper_Attribute();

		/**
		 * The meta object literal for the '<em><b>Mapped To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_MAPPER__MAPPED_TO = eINSTANCE.getControlMapper_MappedTo();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.PreDefinedContainerImpl <em>Pre Defined Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.PreDefinedContainerImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPreDefinedContainer()
		 * @generated
		 */
		EClass PRE_DEFINED_CONTAINER = eINSTANCE.getPreDefinedContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_DEFINED_CONTAINER__NAME = eINSTANCE.getPreDefinedContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Predefinedvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_DEFINED_CONTAINER__PREDEFINEDVALUES = eINSTANCE.getPreDefinedContainer_Predefinedvalues();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.ImportImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.AdminImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__PAGES = eINSTANCE.getAdmin_Pages();

		/**
		 * The meta object literal for the '<em><b>Businesstypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__BUSINESSTYPES = eINSTANCE.getAdmin_Businesstypes();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__MENU = eINSTANCE.getAdmin_Menu();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.MenuImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Parent Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PARENT_MENU = eINSTANCE.getMenu_ParentMenu();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__DESCRIPTION = eINSTANCE.getMenu_Description();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PAGE = eINSTANCE.getMenu_Page();

		/**
		 * The meta object literal for the '<em><b>Menu Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__MENU_TYPE = eINSTANCE.getMenu_MenuType();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.WebElementImpl <em>Web Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.WebElementImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getWebElement()
		 * @generated
		 */
		EClass WEB_ELEMENT = eINSTANCE.getWebElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ELEMENT__NAME = eINSTANCE.getWebElement_Name();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.MenuType <em>Menu Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.MenuType
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getMenuType()
		 * @generated
		 */
		EEnum MENU_TYPE = eINSTANCE.getMenuType();

	}

} //EgovPackage
