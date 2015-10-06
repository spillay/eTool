/**
 */
package com.dsleng.etool.models.Controls.impl;

import com.dsleng.etool.models.Controls.AttributeType;
import com.dsleng.etool.models.Controls.BOCtrl;
import com.dsleng.etool.models.Controls.BOType;
import com.dsleng.etool.models.Controls.Composite;
import com.dsleng.etool.models.Controls.CompositeMobCtrl;
import com.dsleng.etool.models.Controls.CompositeWebCtrl;
import com.dsleng.etool.models.Controls.ControlDef;
import com.dsleng.etool.models.Controls.ControlGroup;
import com.dsleng.etool.models.Controls.ControlManager;
import com.dsleng.etool.models.Controls.ControlsFactory;
import com.dsleng.etool.models.Controls.ControlsPackage;
import com.dsleng.etool.models.Controls.OptionInstance;
import com.dsleng.etool.models.Controls.Options;
import com.dsleng.etool.models.Controls.PageCtrl;
import com.dsleng.etool.models.Controls.PageInfo;
import com.dsleng.etool.models.Controls.PageType;
import com.dsleng.etool.models.Controls.Resource;
import com.dsleng.etool.models.Controls.SimpleControl;
import com.dsleng.etool.models.Controls.Type;
import com.dsleng.etool.models.Controls.TypeParameter;
import com.dsleng.etool.models.Controls.ValuePlaceHolder;

import com.dsleng.etool.models.bobjs.BobjsPackage;

import com.dsleng.etool.models.bobjs.impl.BobjsPackageImpl;

import com.dsleng.etool.models.egov.EgovPackage;

import com.dsleng.etool.models.egov.impl.EgovPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlsPackageImpl extends EPackageImpl implements ControlsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePlaceHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeWebCtrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMobCtrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boCtrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageCtrlEClass = null;

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
	 * @see com.dsleng.etool.models.Controls.ControlsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlsPackageImpl() {
		super(eNS_URI, ControlsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlsPackage init() {
		if (isInited) return (ControlsPackage)EPackage.Registry.INSTANCE.getEPackage(ControlsPackage.eNS_URI);

		// Obtain or create and register package
		ControlsPackageImpl theControlsPackage = (ControlsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EgovPackageImpl theEgovPackage = (EgovPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EgovPackage.eNS_URI) instanceof EgovPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EgovPackage.eNS_URI) : EgovPackage.eINSTANCE);
		BobjsPackageImpl theBobjsPackage = (BobjsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) instanceof BobjsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BobjsPackage.eNS_URI) : BobjsPackage.eINSTANCE);

		// Create package meta-data objects
		theControlsPackage.createPackageContents();
		theEgovPackage.createPackageContents();
		theBobjsPackage.createPackageContents();

		// Initialize created meta-data
		theControlsPackage.initializePackageContents();
		theEgovPackage.initializePackageContents();
		theBobjsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlsPackage.eNS_URI, theControlsPackage);
		return theControlsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlDef() {
		return controlDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlDef_Ns() {
		return (EAttribute)controlDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlDef_Prefix() {
		return (EAttribute)controlDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlDef_Name() {
		return (EAttribute)controlDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlDef_Options() {
		return (EReference)controlDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlDef_Syntax() {
		return (EAttribute)controlDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageInfo() {
		return pageInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageInfo_Resources() {
		return (EReference)pageInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageInfo_Dir() {
		return (EAttribute)pageInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageInfo_Title() {
		return (EAttribute)pageInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Ns() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Prefix() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlManager() {
		return controlManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlManager_Controls() {
		return (EReference)controlManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlManager_Pageinfos() {
		return (EReference)controlManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlManager_Composites() {
		return (EReference)controlManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlManager_Types() {
		return (EReference)controlManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlGroup() {
		return controlGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlGroup_Pageinfos() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlGroup_Composites() {
		return (EReference)controlGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlGroup_Name() {
		return (EAttribute)controlGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_Name() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptions_Valueplaceholder() {
		return (EReference)optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePlaceHolder() {
		return valuePlaceHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePlaceHolder_Name() {
		return (EAttribute)valuePlaceHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePlaceHolder_Syntax() {
		return (EAttribute)valuePlaceHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeWebCtrl() {
		return compositeWebCtrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMobCtrl() {
		return compositeMobCtrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_UsesControl() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComposite__GetCode() {
		return compositeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionInstance() {
		return optionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionInstance_Option() {
		return (EReference)optionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionInstance_Value() {
		return (EReference)optionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleControl() {
		return simpleControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleControl_Uses() {
		return (EReference)simpleControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleControl_OptionInstance() {
		return (EReference)simpleControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleControl_Name() {
		return (EAttribute)simpleControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleControl_NestedControls() {
		return (EReference)simpleControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleControl_Sibling() {
		return (EReference)simpleControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Control() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Parameters() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_Option() {
		return (EReference)typeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeParameter_Value() {
		return (EAttribute)typeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOType() {
		return boTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageType() {
		return pageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOCtrl() {
		return boCtrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageCtrl() {
		return pageCtrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlsFactory getControlsFactory() {
		return (ControlsFactory)getEFactoryInstance();
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
		controlDefEClass = createEClass(CONTROL_DEF);
		createEAttribute(controlDefEClass, CONTROL_DEF__NS);
		createEAttribute(controlDefEClass, CONTROL_DEF__PREFIX);
		createEAttribute(controlDefEClass, CONTROL_DEF__NAME);
		createEReference(controlDefEClass, CONTROL_DEF__OPTIONS);
		createEAttribute(controlDefEClass, CONTROL_DEF__SYNTAX);

		pageInfoEClass = createEClass(PAGE_INFO);
		createEReference(pageInfoEClass, PAGE_INFO__RESOURCES);
		createEAttribute(pageInfoEClass, PAGE_INFO__DIR);
		createEAttribute(pageInfoEClass, PAGE_INFO__TITLE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NS);
		createEAttribute(resourceEClass, RESOURCE__PREFIX);

		controlManagerEClass = createEClass(CONTROL_MANAGER);
		createEReference(controlManagerEClass, CONTROL_MANAGER__CONTROLS);
		createEReference(controlManagerEClass, CONTROL_MANAGER__PAGEINFOS);
		createEReference(controlManagerEClass, CONTROL_MANAGER__COMPOSITES);
		createEReference(controlManagerEClass, CONTROL_MANAGER__TYPES);

		controlGroupEClass = createEClass(CONTROL_GROUP);
		createEReference(controlGroupEClass, CONTROL_GROUP__PAGEINFOS);
		createEReference(controlGroupEClass, CONTROL_GROUP__COMPOSITES);
		createEAttribute(controlGroupEClass, CONTROL_GROUP__NAME);

		optionsEClass = createEClass(OPTIONS);
		createEAttribute(optionsEClass, OPTIONS__NAME);
		createEReference(optionsEClass, OPTIONS__VALUEPLACEHOLDER);

		valuePlaceHolderEClass = createEClass(VALUE_PLACE_HOLDER);
		createEAttribute(valuePlaceHolderEClass, VALUE_PLACE_HOLDER__NAME);
		createEAttribute(valuePlaceHolderEClass, VALUE_PLACE_HOLDER__SYNTAX);

		compositeWebCtrlEClass = createEClass(COMPOSITE_WEB_CTRL);

		compositeMobCtrlEClass = createEClass(COMPOSITE_MOB_CTRL);

		compositeEClass = createEClass(COMPOSITE);
		createEReference(compositeEClass, COMPOSITE__USES_CONTROL);
		createEOperation(compositeEClass, COMPOSITE___GET_CODE);

		optionInstanceEClass = createEClass(OPTION_INSTANCE);
		createEReference(optionInstanceEClass, OPTION_INSTANCE__OPTION);
		createEReference(optionInstanceEClass, OPTION_INSTANCE__VALUE);

		simpleControlEClass = createEClass(SIMPLE_CONTROL);
		createEReference(simpleControlEClass, SIMPLE_CONTROL__USES);
		createEReference(simpleControlEClass, SIMPLE_CONTROL__OPTION_INSTANCE);
		createEAttribute(simpleControlEClass, SIMPLE_CONTROL__NAME);
		createEReference(simpleControlEClass, SIMPLE_CONTROL__NESTED_CONTROLS);
		createEReference(simpleControlEClass, SIMPLE_CONTROL__SIBLING);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__CONTROL);
		createEReference(typeEClass, TYPE__PARAMETERS);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__OPTION);
		createEAttribute(typeParameterEClass, TYPE_PARAMETER__VALUE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);

		boTypeEClass = createEClass(BO_TYPE);

		pageTypeEClass = createEClass(PAGE_TYPE);

		boCtrlEClass = createEClass(BO_CTRL);

		pageCtrlEClass = createEClass(PAGE_CTRL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeWebCtrlEClass.getESuperTypes().add(this.getComposite());
		compositeMobCtrlEClass.getESuperTypes().add(this.getComposite());
		compositeEClass.getESuperTypes().add(this.getSimpleControl());
		attributeTypeEClass.getESuperTypes().add(this.getType());
		boTypeEClass.getESuperTypes().add(this.getType());
		pageTypeEClass.getESuperTypes().add(this.getType());
		boCtrlEClass.getESuperTypes().add(this.getComposite());
		pageCtrlEClass.getESuperTypes().add(this.getComposite());

		// Initialize classes, features, and operations; add parameters
		initEClass(controlDefEClass, ControlDef.class, "ControlDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlDef_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, ControlDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlDef_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, ControlDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, ControlDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlDef_Options(), this.getOptions(), null, "options", null, 0, -1, ControlDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlDef_Syntax(), ecorePackage.getEString(), "syntax", null, 0, 1, ControlDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageInfoEClass, PageInfo.class, "PageInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageInfo_Resources(), this.getResource(), null, "resources", null, 0, -1, PageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageInfo_Dir(), ecorePackage.getEString(), "dir", null, 0, 1, PageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageInfo_Title(), ecorePackage.getEString(), "title", null, 0, 1, PageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Ns(), ecorePackage.getEString(), "ns", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlManagerEClass, ControlManager.class, "ControlManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlManager_Controls(), this.getControlDef(), null, "controls", null, 0, -1, ControlManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlManager_Pageinfos(), this.getPageInfo(), null, "pageinfos", null, 0, -1, ControlManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlManager_Composites(), this.getSimpleControl(), null, "composites", null, 0, -1, ControlManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlManager_Types(), this.getType(), null, "types", null, 0, -1, ControlManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlGroupEClass, ControlGroup.class, "ControlGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlGroup_Pageinfos(), this.getPageInfo(), null, "pageinfos", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlGroup_Composites(), this.getComposite(), null, "composites", null, 0, -1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ControlGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptions_Name(), ecorePackage.getEString(), "name", null, 1, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptions_Valueplaceholder(), this.getValuePlaceHolder(), null, "valueplaceholder", null, 0, -1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePlaceHolderEClass, ValuePlaceHolder.class, "ValuePlaceHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuePlaceHolder_Name(), ecorePackage.getEString(), "name", null, 1, 1, ValuePlaceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuePlaceHolder_Syntax(), ecorePackage.getEString(), "syntax", null, 0, 1, ValuePlaceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeWebCtrlEClass, CompositeWebCtrl.class, "CompositeWebCtrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeMobCtrlEClass, CompositeMobCtrl.class, "CompositeMobCtrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposite_UsesControl(), this.getSimpleControl(), null, "usesControl", null, 1, 1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComposite__GetCode(), null, "getCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionInstanceEClass, OptionInstance.class, "OptionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionInstance_Option(), this.getOptions(), null, "option", null, 1, 1, OptionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionInstance_Value(), this.getValuePlaceHolder(), null, "value", null, 1, -1, OptionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleControlEClass, SimpleControl.class, "SimpleControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleControl_Uses(), this.getControlDef(), null, "uses", null, 0, 1, SimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleControl_OptionInstance(), this.getOptionInstance(), null, "optionInstance", null, 0, -1, SimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleControl_Name(), ecorePackage.getEString(), "name", null, 1, 1, SimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleControl_NestedControls(), this.getSimpleControl(), null, "nestedControls", null, 0, -1, SimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleControl_Sibling(), this.getSimpleControl(), null, "sibling", null, 0, -1, SimpleControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Control(), this.getSimpleControl(), null, "control", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Parameters(), this.getTypeParameter(), null, "parameters", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_Option(), this.getOptions(), null, "option", null, 1, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boTypeEClass, BOType.class, "BOType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageTypeEClass, PageType.class, "PageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boCtrlEClass, BOCtrl.class, "BOCtrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageCtrlEClass, PageCtrl.class, "PageCtrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ControlsPackageImpl
