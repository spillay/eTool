/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.OptionInstance#getOption <em>Option</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.OptionInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getOptionInstance()
 * @model
 * @generated
 */
public interface OptionInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Options)
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getOptionInstance_Option()
	 * @model required="true"
	 * @generated
	 */
	Options getOption();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.controls.OptionInstance#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Options value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.ValuePlaceHolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getOptionInstance_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<ValuePlaceHolder> getValue();

} // OptionInstance
