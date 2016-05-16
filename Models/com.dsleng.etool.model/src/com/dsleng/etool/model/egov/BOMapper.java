/**
 */
package com.dsleng.etool.model.egov;

import com.dsleng.etool.model.bobjs.BusinessObject;

import com.dsleng.etool.model.controls.BOType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.BOMapper#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.BOMapper#getBusinessObject <em>Business Object</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.BOMapper#getBotype <em>Botype</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.egov.EgovPackage#getBOMapper()
 * @model
 * @generated
 */
public interface BOMapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.egov.BOAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOMapper_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Object</em>' reference.
	 * @see #setBusinessObject(BusinessObject)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOMapper_BusinessObject()
	 * @model
	 * @generated
	 */
	BusinessObject getBusinessObject();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.BOMapper#getBusinessObject <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Object</em>' reference.
	 * @see #getBusinessObject()
	 * @generated
	 */
	void setBusinessObject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Botype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botype</em>' reference.
	 * @see #setBotype(BOType)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getBOMapper_Botype()
	 * @model
	 * @generated
	 */
	BOType getBotype();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.BOMapper#getBotype <em>Botype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Botype</em>' reference.
	 * @see #getBotype()
	 * @generated
	 */
	void setBotype(BOType value);

} // BOMapper
