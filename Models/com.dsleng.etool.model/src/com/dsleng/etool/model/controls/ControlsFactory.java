/**
 */
package com.dsleng.etool.model.controls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.model.controls.ControlsPackage
 * @generated
 */
public interface ControlsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlsFactory eINSTANCE = com.dsleng.etool.model.controls.impl.ControlsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Def</em>'.
	 * @generated
	 */
	ControlDef createControlDef();

	/**
	 * Returns a new object of class '<em>Page Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Info</em>'.
	 * @generated
	 */
	PageInfo createPageInfo();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Control Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Manager</em>'.
	 * @generated
	 */
	ControlManager createControlManager();

	/**
	 * Returns a new object of class '<em>Control Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Group</em>'.
	 * @generated
	 */
	ControlGroup createControlGroup();

	/**
	 * Returns a new object of class '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options</em>'.
	 * @generated
	 */
	Options createOptions();

	/**
	 * Returns a new object of class '<em>Value Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Place Holder</em>'.
	 * @generated
	 */
	ValuePlaceHolder createValuePlaceHolder();

	/**
	 * Returns a new object of class '<em>Composite Web Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Web Ctrl</em>'.
	 * @generated
	 */
	CompositeWebCtrl createCompositeWebCtrl();

	/**
	 * Returns a new object of class '<em>Composite Mob Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Mob Ctrl</em>'.
	 * @generated
	 */
	CompositeMobCtrl createCompositeMobCtrl();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

	/**
	 * Returns a new object of class '<em>Option Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Instance</em>'.
	 * @generated
	 */
	OptionInstance createOptionInstance();

	/**
	 * Returns a new object of class '<em>Simple Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Control</em>'.
	 * @generated
	 */
	SimpleControl createSimpleControl();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>BO Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BO Type</em>'.
	 * @generated
	 */
	BOType createBOType();

	/**
	 * Returns a new object of class '<em>Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Type</em>'.
	 * @generated
	 */
	PageType createPageType();

	/**
	 * Returns a new object of class '<em>BO Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BO Ctrl</em>'.
	 * @generated
	 */
	BOCtrl createBOCtrl();

	/**
	 * Returns a new object of class '<em>Page Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Ctrl</em>'.
	 * @generated
	 */
	PageCtrl createPageCtrl();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControlsPackage getControlsPackage();

} //ControlsFactory
