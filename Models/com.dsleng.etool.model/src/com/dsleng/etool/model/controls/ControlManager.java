/**
 */
package com.dsleng.etool.model.controls;

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
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getControls <em>Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getComposites <em>Composites</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getTypes <em>Types</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.ControlManager#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager()
 * @model
 * @generated
 */
public interface ControlManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.ControlDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDef> getControls();

	/**
	 * Returns the value of the '<em><b>Pageinfos</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.PageInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pageinfos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageinfos</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_Pageinfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageInfo> getPageinfos();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.SimpleControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleControl> getComposites();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.controls.ControlManager#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getControlManager_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // ControlManager
