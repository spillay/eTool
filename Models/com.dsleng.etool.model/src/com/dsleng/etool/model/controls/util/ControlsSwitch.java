/**
 */
package com.dsleng.etool.model.controls.util;

import com.dsleng.etool.model.controls.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.model.controls.ControlsPackage
 * @generated
 */
public class ControlsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlsSwitch() {
		if (modelPackage == null) {
			modelPackage = ControlsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ControlsPackage.CONTROL_DEF: {
				ControlDef controlDef = (ControlDef)theEObject;
				T result = caseControlDef(controlDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.PAGE_INFO: {
				PageInfo pageInfo = (PageInfo)theEObject;
				T result = casePageInfo(pageInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.CONTROL_MANAGER: {
				ControlManager controlManager = (ControlManager)theEObject;
				T result = caseControlManager(controlManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.CONTROL_GROUP: {
				ControlGroup controlGroup = (ControlGroup)theEObject;
				T result = caseControlGroup(controlGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.VALUE_PLACE_HOLDER: {
				ValuePlaceHolder valuePlaceHolder = (ValuePlaceHolder)theEObject;
				T result = caseValuePlaceHolder(valuePlaceHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.COMPOSITE_WEB_CTRL: {
				CompositeWebCtrl compositeWebCtrl = (CompositeWebCtrl)theEObject;
				T result = caseCompositeWebCtrl(compositeWebCtrl);
				if (result == null) result = caseComposite(compositeWebCtrl);
				if (result == null) result = caseSimpleControl(compositeWebCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.COMPOSITE_MOB_CTRL: {
				CompositeMobCtrl compositeMobCtrl = (CompositeMobCtrl)theEObject;
				T result = caseCompositeMobCtrl(compositeMobCtrl);
				if (result == null) result = caseComposite(compositeMobCtrl);
				if (result == null) result = caseSimpleControl(compositeMobCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseSimpleControl(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.OPTION_INSTANCE: {
				OptionInstance optionInstance = (OptionInstance)theEObject;
				T result = caseOptionInstance(optionInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.SIMPLE_CONTROL: {
				SimpleControl simpleControl = (SimpleControl)theEObject;
				T result = caseSimpleControl(simpleControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = caseType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.BO_TYPE: {
				BOType boType = (BOType)theEObject;
				T result = caseBOType(boType);
				if (result == null) result = caseType(boType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.PAGE_TYPE: {
				PageType pageType = (PageType)theEObject;
				T result = casePageType(pageType);
				if (result == null) result = caseType(pageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.BO_CTRL: {
				BOCtrl boCtrl = (BOCtrl)theEObject;
				T result = caseBOCtrl(boCtrl);
				if (result == null) result = caseComposite(boCtrl);
				if (result == null) result = caseSimpleControl(boCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlsPackage.PAGE_CTRL: {
				PageCtrl pageCtrl = (PageCtrl)theEObject;
				T result = casePageCtrl(pageCtrl);
				if (result == null) result = caseComposite(pageCtrl);
				if (result == null) result = caseSimpleControl(pageCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlDef(ControlDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageInfo(PageInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlManager(ControlManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlGroup(ControlGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Place Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePlaceHolder(ValuePlaceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Web Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Web Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeWebCtrl(CompositeWebCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Mob Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Mob Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMobCtrl(CompositeMobCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionInstance(OptionInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleControl(SimpleControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BO Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOType(BOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageType(PageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BO Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BO Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOCtrl(BOCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageCtrl(PageCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ControlsSwitch
