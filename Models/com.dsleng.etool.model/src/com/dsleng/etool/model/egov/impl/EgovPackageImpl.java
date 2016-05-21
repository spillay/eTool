/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.bobjs.BobjsPackage;

import com.dsleng.etool.model.bobjs.impl.BobjsPackageImpl;

import com.dsleng.etool.model.controls.ControlsPackage;

import com.dsleng.etool.model.controls.impl.ControlsPackageImpl;

import com.dsleng.etool.model.egov.Admin;
import com.dsleng.etool.model.egov.BOAttribute;
import com.dsleng.etool.model.egov.BOMapper;
import com.dsleng.etool.model.egov.ControlMapper;
import com.dsleng.etool.model.egov.EService;
import com.dsleng.etool.model.egov.EgovFactory;
import com.dsleng.etool.model.egov.EgovPackage;
import com.dsleng.etool.model.egov.Import;
import com.dsleng.etool.model.egov.Menu;
import com.dsleng.etool.model.egov.MenuType;
import com.dsleng.etool.model.egov.Page;
import com.dsleng.etool.model.egov.PreDefinedContainer;
import com.dsleng.etool.model.egov.PreDefinedValue;
import com.dsleng.etool.model.egov.WebElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preDefinedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preDefinedContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum menuTypeEEnum = null;

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
	 * @see com.dsleng.etool.model.egov.EgovPackage#eNS_URI
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
		BobjsPackageImpl theBobjsPackage = (BobjsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) instanceof BobjsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) : BobjsPackage.eINSTANCE);
		ControlsPackageImpl theControlsPackage = (ControlsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI) instanceof ControlsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI) : ControlsPackage.eINSTANCE);

		// Create package meta-data objects
		theEgovPackage.createPackageContents();
		theBobjsPackage.createPackageContents();
		theControlsPackage.createPackageContents();

		// Initialize created meta-data
		theEgovPackage.initializePackageContents();
		theBobjsPackage.initializePackageContents();
		theControlsPackage.initializePackageContents();

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
	public EReference getEService_Imports() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEService_AdminPages() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEService_Menu() {
		return (EReference)eServiceEClass.getEStructuralFeatures().get(6);
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
	public EReference getPage_ExtraControls() {
		return (EReference)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_North() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_South() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_West() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_East() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Businesstype() {
		return (EReference)pageEClass.getEStructuralFeatures().get(9);
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
	public EReference getBOAttribute_Controlparameters() {
		return (EReference)boAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOAttribute_Predefinedcontainers() {
		return (EReference)boAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreDefinedValue() {
		return preDefinedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreDefinedValue_Value() {
		return (EAttribute)preDefinedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlMapper() {
		return controlMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlMapper_Option() {
		return (EReference)controlMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlMapper_Attribute() {
		return (EReference)controlMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlMapper_MappedTo() {
		return (EAttribute)controlMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreDefinedContainer() {
		return preDefinedContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreDefinedContainer_Name() {
		return (EAttribute)preDefinedContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreDefinedContainer_Predefinedvalues() {
		return (EReference)preDefinedContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportBOBPlugin() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportCtlPlugin() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmin_Pages() {
		return (EReference)adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmin_Businesstypes() {
		return (EReference)adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmin_Menu() {
		return (EReference)adminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_ParentMenu() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Description() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Page() {
		return (EReference)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_MenuType() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebElement() {
		return webElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebElement_Name() {
		return (EAttribute)webElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMenuType() {
		return menuTypeEEnum;
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
		createEReference(eServiceEClass, ESERVICE__IMPORTS);
		createEReference(eServiceEClass, ESERVICE__ADMIN_PAGES);
		createEReference(eServiceEClass, ESERVICE__MENU);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__NEXT_PAGE);
		createEReference(pageEClass, PAGE__BO_MAPS);
		createEReference(pageEClass, PAGE__PAGETYPE);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__EXTRA_CONTROLS);
		createEAttribute(pageEClass, PAGE__NORTH);
		createEAttribute(pageEClass, PAGE__SOUTH);
		createEAttribute(pageEClass, PAGE__WEST);
		createEAttribute(pageEClass, PAGE__EAST);
		createEReference(pageEClass, PAGE__BUSINESSTYPE);

		boMapperEClass = createEClass(BO_MAPPER);
		createEReference(boMapperEClass, BO_MAPPER__ATTRIBUTES);
		createEReference(boMapperEClass, BO_MAPPER__BUSINESS_OBJECT);
		createEReference(boMapperEClass, BO_MAPPER__BOTYPE);

		boAttributeEClass = createEClass(BO_ATTRIBUTE);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__CONTROLTYPE);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__ATTRIBUTE);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__CONTROLPARAMETERS);
		createEReference(boAttributeEClass, BO_ATTRIBUTE__PREDEFINEDCONTAINERS);

		preDefinedValueEClass = createEClass(PRE_DEFINED_VALUE);
		createEAttribute(preDefinedValueEClass, PRE_DEFINED_VALUE__VALUE);

		controlMapperEClass = createEClass(CONTROL_MAPPER);
		createEReference(controlMapperEClass, CONTROL_MAPPER__OPTION);
		createEReference(controlMapperEClass, CONTROL_MAPPER__ATTRIBUTE);
		createEAttribute(controlMapperEClass, CONTROL_MAPPER__MAPPED_TO);

		preDefinedContainerEClass = createEClass(PRE_DEFINED_CONTAINER);
		createEAttribute(preDefinedContainerEClass, PRE_DEFINED_CONTAINER__NAME);
		createEReference(preDefinedContainerEClass, PRE_DEFINED_CONTAINER__PREDEFINEDVALUES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);
		createEAttribute(importEClass, IMPORT__IMPORT_BOB_PLUGIN);
		createEAttribute(importEClass, IMPORT__IMPORT_CTL_PLUGIN);

		adminEClass = createEClass(ADMIN);
		createEReference(adminEClass, ADMIN__PAGES);
		createEReference(adminEClass, ADMIN__BUSINESSTYPES);
		createEReference(adminEClass, ADMIN__MENU);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__PARENT_MENU);
		createEAttribute(menuEClass, MENU__DESCRIPTION);
		createEReference(menuEClass, MENU__PAGE);
		createEAttribute(menuEClass, MENU__MENU_TYPE);

		webElementEClass = createEClass(WEB_ELEMENT);
		createEAttribute(webElementEClass, WEB_ELEMENT__NAME);

		// Create enums
		menuTypeEEnum = createEEnum(MENU_TYPE);
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
		eServiceEClass.getESuperTypes().add(this.getWebElement());
		pageEClass.getESuperTypes().add(this.getWebElement());
		menuEClass.getESuperTypes().add(this.getWebElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(eServiceEClass, EService.class, "EService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEService_Pages(), this.getPage(), null, "pages", null, 0, -1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_IndexPage(), this.getPage(), null, "indexPage", null, 1, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEService_DirLocation(), ecorePackage.getEString(), "dirLocation", null, 0, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_BusinessUnit(), theBobjsPackage.getOrgUnit(), null, "BusinessUnit", null, 0, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_Imports(), this.getImport(), null, "imports", null, 0, -1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_AdminPages(), this.getAdmin(), null, "adminPages", null, 0, 1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEService_Menu(), this.getMenu(), null, "menu", null, 0, -1, EService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_NextPage(), this.getPage(), null, "nextPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_BOMaps(), this.getBOMapper(), null, "BOMaps", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pagetype(), theControlsPackage.getPageType(), null, "pagetype", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ExtraControls(), theControlsPackage.getAttributeType(), null, "extraControls", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_North(), ecorePackage.getEString(), "North", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_South(), ecorePackage.getEString(), "South", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_West(), ecorePackage.getEString(), "West", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_East(), ecorePackage.getEString(), "East", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Businesstype(), theBobjsPackage.getBusinessType(), null, "businesstype", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boMapperEClass, BOMapper.class, "BOMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOMapper_Attributes(), this.getBOAttribute(), null, "attributes", null, 0, -1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMapper_BusinessObject(), theBobjsPackage.getBusinessObject(), null, "BusinessObject", null, 0, 1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOMapper_Botype(), theControlsPackage.getBOType(), null, "botype", null, 0, 1, BOMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boAttributeEClass, BOAttribute.class, "BOAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOAttribute_Controltype(), theControlsPackage.getAttributeType(), null, "controltype", null, 0, 1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOAttribute_Attribute(), theBobjsPackage.getAttribute(), null, "attribute", null, 0, 1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOAttribute_Controlparameters(), this.getControlMapper(), null, "controlparameters", null, 0, -1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOAttribute_Predefinedcontainers(), this.getPreDefinedContainer(), null, "predefinedcontainers", null, 0, -1, BOAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preDefinedValueEClass, PreDefinedValue.class, "PreDefinedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreDefinedValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, PreDefinedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlMapperEClass, ControlMapper.class, "ControlMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlMapper_Option(), theControlsPackage.getOptions(), null, "option", null, 0, 1, ControlMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlMapper_Attribute(), theBobjsPackage.getAttribute(), null, "attribute", null, 0, 1, ControlMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlMapper_MappedTo(), ecorePackage.getEString(), "mappedTo", null, 0, 1, ControlMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preDefinedContainerEClass, PreDefinedContainer.class, "PreDefinedContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreDefinedContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, PreDefinedContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreDefinedContainer_Predefinedvalues(), this.getPreDefinedValue(), null, "predefinedvalues", null, 0, -1, PreDefinedContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_ImportBOBPlugin(), ecorePackage.getEString(), "importBOBPlugin", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_ImportCtlPlugin(), ecorePackage.getEString(), "importCtlPlugin", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmin_Pages(), this.getPage(), null, "pages", null, 0, -1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_Businesstypes(), theBobjsPackage.getBusinessType(), null, "businesstypes", null, 0, -1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_Menu(), this.getMenu(), null, "menu", null, 0, -1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_ParentMenu(), this.getMenu(), null, "parentMenu", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Description(), ecorePackage.getEString(), "description", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Page(), this.getPage(), null, "page", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_MenuType(), this.getMenuType(), "menuType", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webElementEClass, WebElement.class, "WebElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, WebElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(menuTypeEEnum, MenuType.class, "MenuType");
		addEEnumLiteral(menuTypeEEnum, MenuType.STANDARD);
		addEEnumLiteral(menuTypeEEnum, MenuType.TOP_LEVEL);

		// Create resource
		createResource(eNS_URI);
	}

} //EgovPackageImpl
