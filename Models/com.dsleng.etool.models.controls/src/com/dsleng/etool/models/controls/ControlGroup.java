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
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getComposites <em>Composites</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ControlGroup#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup()
 * @model
 * @generated
 */
public interface ControlGroup extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getControlGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.controls.ControlGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ControlGroup
