/**
 */
package com.dsleng.etool.models.Controls.util;

import com.dsleng.etool.models.Controls.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.models.Controls.ControlsPackage
 * @generated
 */
public class ControlsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControlsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlsSwitch<Adapter> modelSwitch =
		new ControlsSwitch<Adapter>() {
			@Override
			public Adapter caseControlDef(ControlDef object) {
				return createControlDefAdapter();
			}
			@Override
			public Adapter casePageInfo(PageInfo object) {
				return createPageInfoAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseControlManager(ControlManager object) {
				return createControlManagerAdapter();
			}
			@Override
			public Adapter caseControlGroup(ControlGroup object) {
				return createControlGroupAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter caseValuePlaceHolder(ValuePlaceHolder object) {
				return createValuePlaceHolderAdapter();
			}
			@Override
			public Adapter caseCompositeWebCtrl(CompositeWebCtrl object) {
				return createCompositeWebCtrlAdapter();
			}
			@Override
			public Adapter caseCompositeMobCtrl(CompositeMobCtrl object) {
				return createCompositeMobCtrlAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseOptionInstance(OptionInstance object) {
				return createOptionInstanceAdapter();
			}
			@Override
			public Adapter caseSimpleControl(SimpleControl object) {
				return createSimpleControlAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeParameter(TypeParameter object) {
				return createTypeParameterAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseBOType(BOType object) {
				return createBOTypeAdapter();
			}
			@Override
			public Adapter casePageType(PageType object) {
				return createPageTypeAdapter();
			}
			@Override
			public Adapter caseBOCtrl(BOCtrl object) {
				return createBOCtrlAdapter();
			}
			@Override
			public Adapter casePageCtrl(PageCtrl object) {
				return createPageCtrlAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.ControlDef <em>Control Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.ControlDef
	 * @generated
	 */
	public Adapter createControlDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.PageInfo <em>Page Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.PageInfo
	 * @generated
	 */
	public Adapter createPageInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.ControlManager <em>Control Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.ControlManager
	 * @generated
	 */
	public Adapter createControlManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.ControlGroup
	 * @generated
	 */
	public Adapter createControlGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.ValuePlaceHolder <em>Value Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.ValuePlaceHolder
	 * @generated
	 */
	public Adapter createValuePlaceHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.CompositeWebCtrl <em>Composite Web Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.CompositeWebCtrl
	 * @generated
	 */
	public Adapter createCompositeWebCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.CompositeMobCtrl <em>Composite Mob Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.CompositeMobCtrl
	 * @generated
	 */
	public Adapter createCompositeMobCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.OptionInstance <em>Option Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.OptionInstance
	 * @generated
	 */
	public Adapter createOptionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.SimpleControl <em>Simple Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.SimpleControl
	 * @generated
	 */
	public Adapter createSimpleControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.BOType <em>BO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.BOType
	 * @generated
	 */
	public Adapter createBOTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.PageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.PageType
	 * @generated
	 */
	public Adapter createPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.BOCtrl <em>BO Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.BOCtrl
	 * @generated
	 */
	public Adapter createBOCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.models.Controls.PageCtrl <em>Page Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.models.Controls.PageCtrl
	 * @generated
	 */
	public Adapter createPageCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ControlsAdapterFactory
