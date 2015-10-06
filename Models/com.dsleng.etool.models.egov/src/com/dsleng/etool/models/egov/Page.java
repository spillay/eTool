/**
 */
package com.dsleng.etool.models.egov;

import com.dsleng.etool.models.Controls.PageType;
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
 *   <li>{@link com.dsleng.etool.models.egov.Page#getPagetype <em>Pagetype</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getTitle <em>Title</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Pagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagetype</em>' reference.
	 * @see #setPagetype(PageType)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_Pagetype()
	 * @model
	 * @generated
	 */
	PageType getPagetype();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getPagetype <em>Pagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagetype</em>' reference.
	 * @see #getPagetype()
	 * @generated
	 */
	void setPagetype(PageType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Page
