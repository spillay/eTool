/**
 */
package com.dsleng.etool.models.bobjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.BusinessType#getLookup <em>Lookup</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.BusinessType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBusinessType()
 * @model
 * @generated
 */
public interface BusinessType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Lookup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup</em>' reference.
	 * @see #setLookup(Attribute)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBusinessType_Lookup()
	 * @model
	 * @generated
	 */
	Attribute getLookup();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.BusinessType#getLookup <em>Lookup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup</em>' reference.
	 * @see #getLookup()
	 * @generated
	 */
	void setLookup(Attribute value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBusinessType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // BusinessType
