/**
 */
package com.dsleng.etool.models.egov;



import org.eclipse.emf.ecore.EObject;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.controls.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.BOAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.BOAttribute#getControlType <em>Control Type</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getBOAttribute()
 * @model
 * @generated
 */
public interface BOAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getBOAttribute_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.BOAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Type</em>' reference.
	 * @see #setControlType(Type)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getBOAttribute_ControlType()
	 * @model
	 * @generated
	 */
	Type getControlType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.BOAttribute#getControlType <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Type</em>' reference.
	 * @see #getControlType()
	 * @generated
	 */
	void setControlType(Type value);

} // BOAttribute
