/**
 */
package com.dsleng.etool.model.controls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.controls.SimpleControl#getUses <em>Uses</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.SimpleControl#getOptionInstance <em>Option Instance</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.SimpleControl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.SimpleControl#getNestedControls <em>Nested Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.SimpleControl#getSibling <em>Sibling</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl()
 * @model
 * @generated
 */
public interface SimpleControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(ControlDef)
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl_Uses()
	 * @model
	 * @generated
	 */
	ControlDef getUses();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.controls.SimpleControl#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(ControlDef value);

	/**
	 * Returns the value of the '<em><b>Option Instance</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.OptionInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Instance</em>' containment reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl_OptionInstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionInstance> getOptionInstance();

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
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.controls.SimpleControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nested Controls</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.SimpleControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Controls</em>' reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl_NestedControls()
	 * @model
	 * @generated
	 */
	EList<SimpleControl> getNestedControls();

	/**
	 * Returns the value of the '<em><b>Sibling</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.controls.SimpleControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sibling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sibling</em>' reference list.
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getSimpleControl_Sibling()
	 * @model
	 * @generated
	 */
	EList<SimpleControl> getSibling();

} // SimpleControl
