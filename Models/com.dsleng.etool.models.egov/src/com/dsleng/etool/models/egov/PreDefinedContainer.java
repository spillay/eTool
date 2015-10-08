/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Defined Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.PreDefinedContainer#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.PreDefinedContainer#getPredefinedvalues <em>Predefinedvalues</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getPreDefinedContainer()
 * @model
 * @generated
 */
public interface PreDefinedContainer extends EObject {
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPreDefinedContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.PreDefinedContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predefinedvalues</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.PreDefinedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefinedvalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefinedvalues</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPreDefinedContainer_Predefinedvalues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreDefinedValue> getPredefinedvalues();

} // PreDefinedContainer
