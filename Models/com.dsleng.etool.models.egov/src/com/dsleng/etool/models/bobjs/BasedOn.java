/**
 */
package com.dsleng.etool.models.bobjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Based On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.BasedOn#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.BasedOn#getRemoves <em>Removes</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBasedOn()
 * @model
 * @generated
 */
public interface BasedOn extends EObject {
	/**
	 * Returns the value of the '<em><b>Businessobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessobject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobject</em>' reference.
	 * @see #setBusinessobject(BusinessObject)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBasedOn_Businessobject()
	 * @model
	 * @generated
	 */
	BusinessObject getBusinessobject();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.BasedOn#getBusinessobject <em>Businessobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Businessobject</em>' reference.
	 * @see #getBusinessobject()
	 * @generated
	 */
	void setBusinessobject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Removes</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removes</em>' reference list.
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBasedOn_Removes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getRemoves();

} // BasedOn
