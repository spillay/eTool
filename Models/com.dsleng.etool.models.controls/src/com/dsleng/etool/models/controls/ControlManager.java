/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.ControlManager#getControls <em>Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlManager#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlManager#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlManager()
 * @model
 * @generated
 */
public interface ControlManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.ControlDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlManager_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDef> getControls();

	/**
	 * Returns the value of the '<em><b>Pageinfos</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.PageInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pageinfos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageinfos</em>' containment reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlManager_Pageinfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageInfo> getPageinfos();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.SimpleControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlManager_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleControl> getComposites();

} // ControlManager
