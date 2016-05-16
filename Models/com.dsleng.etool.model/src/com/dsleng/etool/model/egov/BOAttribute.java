/**
 */
package com.dsleng.etool.model.egov;

import com.dsleng.etool.model.bobjs.Attribute;

import com.dsleng.etool.model.controls.AttributeType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.BOAttribute#getControltype <em>Controltype</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.BOAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.BOAttribute#getControlparameters <em>Controlparameters</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.BOAttribute#getPredefinedcontainers <em>Predefinedcontainers</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.egov.EgovPackage#getBOAttribute()
 * @model
 * @generated
 */
public interface BOAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Controltype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controltype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controltype</em>' reference.
	 * @see #setControltype(AttributeType)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOAttribute_Controltype()
	 * @model
	 * @generated
	 */
	AttributeType getControltype();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.BOAttribute#getControltype <em>Controltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controltype</em>' reference.
	 * @see #getControltype()
	 * @generated
	 */
	void setControltype(AttributeType value);

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
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOAttribute_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.BOAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Controlparameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.egov.ControlMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlparameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlparameters</em>' containment reference list.
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOAttribute_Controlparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlMapper> getControlparameters();

	/**
	 * Returns the value of the '<em><b>Predefinedcontainers</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.egov.PreDefinedContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefinedcontainers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefinedcontainers</em>' containment reference list.
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOAttribute_Predefinedcontainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreDefinedContainer> getPredefinedcontainers();

} // BOAttribute
