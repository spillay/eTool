/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getBOMaps <em>BO Maps</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(Page)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_NextPage()
	 * @model
	 * @generated
	 */
	Page getNextPage();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(Page value);

	/**
	 * Returns the value of the '<em><b>BO Maps</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.BOMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BO Maps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BO Maps</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_BOMaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOMapper> getBOMaps();

} // Page
