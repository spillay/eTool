/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.NamedElementImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

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
	int ESERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__PAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__INDEX_PAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__DIR_LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Business Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE__BUSINESS_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.PageImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NEXT_PAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BO Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BO_MAPS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.egov.impl.BOMapperImpl <em>BO Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.egov.impl.BOMapperImpl
	 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getBOMapper()
	 * @generated
	 */
	int BO_MAPPER = 3;

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
	int BO_ATTRIBUTE = 4;

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
	 * The number of structural features of the '<em>BO Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BO Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BO_ATTRIBUTE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link com.dsleng.etool.models.egov.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.dsleng.etool.models.egov.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.egov.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.egov.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

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
		 * The meta object literal for the '{@link com.dsleng.etool.models.egov.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.egov.impl.NamedElementImpl
		 * @see com.dsleng.etool.models.egov.impl.EgovPackageImpl#getNamedElement()
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

	}

} //EgovPackage
