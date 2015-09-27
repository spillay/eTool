/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getControls <em>Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup()
 * @model
 * @generated
 */
public interface ControlGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup_Controls()
	 * @model
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Pageinfos</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.PageInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pageinfos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageinfos</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup_Pageinfos()
	 * @model
	 * @generated
	 */
	EList<PageInfo> getPageinfos();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.Composite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup_Composites()
	 * @model
	 * @generated
	 */
	EList<Composite> getComposites();

} // ControlGroup
