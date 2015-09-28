/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Place Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getValuePlaceHolder()
 * @model
 * @generated
 */
public interface ValuePlaceHolder extends EObject {
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
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getValuePlaceHolder_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' attribute.
	 * @see #setSyntax(String)
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getValuePlaceHolder_Syntax()
	 * @model
	 * @generated
	 */
	String getSyntax();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getSyntax <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' attribute.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(String value);

} // ValuePlaceHolder
