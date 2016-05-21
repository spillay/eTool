/**
 */
package com.dsleng.etool.model.controls.impl;

import com.dsleng.etool.model.controls.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlsFactoryImpl extends EFactoryImpl implements ControlsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlsFactory init() {
		try {
			ControlsFactory theControlsFactory = (ControlsFactory)EPackage.Registry.INSTANCE.getEFactory(ControlsPackage.eNS_URI);
			if (theControlsFactory != null) {
				return theControlsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ControlsPackage.CONTROL_DEF: return createControlDef();
			case ControlsPackage.PAGE_INFO: return createPageInfo();
			case ControlsPackage.RESOURCE: return createResource();
			case ControlsPackage.CONTROL_MANAGER: return createControlManager();
			case ControlsPackage.CONTROL_GROUP: return createControlGroup();
			case ControlsPackage.OPTIONS: return createOptions();
			case ControlsPackage.VALUE_PLACE_HOLDER: return createValuePlaceHolder();
			case ControlsPackage.COMPOSITE_WEB_CTRL: return createCompositeWebCtrl();
			case ControlsPackage.COMPOSITE_MOB_CTRL: return createCompositeMobCtrl();
			case ControlsPackage.COMPOSITE: return createComposite();
			case ControlsPackage.OPTION_INSTANCE: return createOptionInstance();
			case ControlsPackage.SIMPLE_CONTROL: return createSimpleControl();
			case ControlsPackage.TYPE: return createType();
			case ControlsPackage.TYPE_PARAMETER: return createTypeParameter();
			case ControlsPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case ControlsPackage.BO_TYPE: return createBOType();
			case ControlsPackage.PAGE_TYPE: return createPageType();
			case ControlsPackage.BO_CTRL: return createBOCtrl();
			case ControlsPackage.PAGE_CTRL: return createPageCtrl();
			case ControlsPackage.IMPORT: return createImport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlDef createControlDef() {
		ControlDefImpl controlDef = new ControlDefImpl();
		return controlDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageInfo createPageInfo() {
		PageInfoImpl pageInfo = new PageInfoImpl();
		return pageInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlManager createControlManager() {
		ControlManagerImpl controlManager = new ControlManagerImpl();
		return controlManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGroup createControlGroup() {
		ControlGroupImpl controlGroup = new ControlGroupImpl();
		return controlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePlaceHolder createValuePlaceHolder() {
		ValuePlaceHolderImpl valuePlaceHolder = new ValuePlaceHolderImpl();
		return valuePlaceHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeWebCtrl createCompositeWebCtrl() {
		CompositeWebCtrlImpl compositeWebCtrl = new CompositeWebCtrlImpl();
		return compositeWebCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMobCtrl createCompositeMobCtrl() {
		CompositeMobCtrlImpl compositeMobCtrl = new CompositeMobCtrlImpl();
		return compositeMobCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionInstance createOptionInstance() {
		OptionInstanceImpl optionInstance = new OptionInstanceImpl();
		return optionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleControl createSimpleControl() {
		SimpleControlImpl simpleControl = new SimpleControlImpl();
		return simpleControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOType createBOType() {
		BOTypeImpl boType = new BOTypeImpl();
		return boType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType createPageType() {
		PageTypeImpl pageType = new PageTypeImpl();
		return pageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOCtrl createBOCtrl() {
		BOCtrlImpl boCtrl = new BOCtrlImpl();
		return boCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageCtrl createPageCtrl() {
		PageCtrlImpl pageCtrl = new PageCtrlImpl();
		return pageCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlsPackage getControlsPackage() {
		return (ControlsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlsPackage getPackage() {
		return ControlsPackage.eINSTANCE;
	}

} //ControlsFactoryImpl
