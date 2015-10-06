/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.Controls.ControlsPackage;

import com.dsleng.etool.models.Controls.impl.ControlsPackageImpl;

import com.dsleng.etool.models.bobjs.BobjsPackage;

import com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl;

import com.dsleng.etool.models.egov.BOAttribute;
import com.dsleng.etool.models.egov.BOMapper;
import com.dsleng.etool.models.egov.EService;
import com.dsleng.etool.models.egov.EgovFactory;
import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.NamedElement;
import com.dsleng.etool.models.egov.Page;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgovPackageImpl extends EPackageImpl implements EgovPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.dsleng.etool.models.egov.EgovPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EgovPackageImpl() {
		super(eNS_URI, EgovFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EgovPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EgovPackage init() {
		if (isInited) return (EgovPackage)EPackage.Registry.INSTANCE.getEPackage(EgovPackage.eNS_URI);

		// Obtain or create and register package
		EgovPackageImpl theEgovPackage = (EgovPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EgovPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EgovPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ControlsPackageImpl theControlsPackage = (ControlsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI) instanceof ControlsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI) : ControlsPackage.eINSTANCE);
		BobjsPackageImpl theBobjsPackage = (BobjsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) instanceof BobjsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) : BobjsPackage.eINSTANCE);

		// Create package meta-data objects
		theEgovPackage.createPackageContents();
		theControlsPackage.createPackageContents();
		theBobjsPackage.createPackageContents();

		// Initialize created meta-data
		theEgovPackage.initializePackageContents();
		theControlsPackage.initializePackageContents();
		theBobjsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEgovPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EgovPackage.eNS_URI, theEgovPackage);
		return theEgovPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEService() {
		return eServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEService_Pages() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEService_IndexPage() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEService_DirLocation() {
		return (EAttribute)eServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEService_BusinessUnit() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_NextPage() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_BOMaps() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pagetype() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOMapper() {
		return boMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOMapper_Attributes() {
		return (EReference)boMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOMapper_BusinessObject() {
		return (EReference)boMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOMapper_Botype() {
		return (EReference)boMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOAttribute() {
		return boAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOAttribute_Controltype() {
		return (EReference)boAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOAttribute_Attribute() {
		return (EReference)boAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgovFactory getEgovFactory() {
		return (EgovFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eServiceEClass = createEClass(ESERVICE);
		createEReference(eServiceEClass, ESERVICE__PAGES);
		createEReference(eServiceEClass, ESERVICE__INDEX_PAGE);
		createEAttribute(eServiceEClass, ESERVICE__DIR_LOCATION);
		createEReference(eServiceEClass, ESERVICE__BUSINESS_UNIT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__NEXT_PAGE);
		createEReference(pageEClass, PAGE__BO_MAPS);
		createEReference(pageEClass, PAGE__PAGETYPE);
		createEAttribute(pageEClass, PAGE__TITLE);

		boMapperEClass = createEClass(BO_MAPPER);
		createEReference(boMapperEClass, BO_MAPPER__ATTRIBUTES);
		createEReference(boMapperEClass, BO_MAPPER__BUSINESS_OBJECT);
		createEReference(boMapperEClass, BO_MAPPER__BOTYPE);

		boAttributeEClass = createEClass(BO_ATTRIBUTE);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__CONTROLTYPE);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BobjsPackage theBobjsPackage = (BobjsPackage)EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI);
		ControlsPackage theControlsPackage = (ControlsPackage)EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eServiceEClass.getESuperTypes().add(this.getNamedElement());
		pageEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(eServiceEClass, EService.class, "EService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEService_Pages(), this.getPage(), null, "pages", null, 0, -1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_IndexPage(), this.getPage(), null, "indexPage", null, 1, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEService_DirLocation(), ecorePackage.getEString(), "dirLocation", null, 0, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_BusinessUnit(), theBobjsPackage.getOrgUnit(), null, "BusinessUnit", null, 0, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_NextPage(), this.getPage(), null, "nextPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_BOMaps(), this.getBOMapper(), null, "BOMaps", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pagetype(), theControlsPackage.getPageType(), null, "pagetype", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boMapperEClass, BOMapper.class, "BOMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOMapper_Attributes(), this.getBOAttribute(), null, "attributes", null, 0, -1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMapper_BusinessObject(), theBobjsPackage.getBusinessObject(), null, "BusinessObject", null, 0, 1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMapper_Botype(), theControlsPackage.getBOType(), null, "botype", null, 0, 1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boAttributeEClass, BOAttribute.class, "BOAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOAttribute_Controltype(), theControlsPackage.getAttributeType(), null, "controltype", null, 0, 1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOAttribute_Attribute(), theBobjsPackage.getAttribute(), null, "attribute", null, 0, 1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EgovPackageImpl
