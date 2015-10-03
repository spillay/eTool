/**
 */
package com.dsleng.etool.models.Controls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.Controls.TypeParameter#getOption <em>Option</em>}</li>
 *   <li>{@link com.dsleng.etool.models.Controls.TypeParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.Controls.ControlsPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends EObject {
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
	 * @see com.dsleng.etool.models.Controls.ControlsPackage#getTypeParameter_Option()
	 * @model required="true"
	 * @generated
	 */
	Options getOption();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.Controls.TypeParameter#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Options value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.dsleng.etool.models.Controls.ControlsPackage#getTypeParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.Controls.TypeParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TypeParameter
