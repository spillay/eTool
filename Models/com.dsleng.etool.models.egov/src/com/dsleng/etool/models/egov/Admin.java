/**
 */
package com.dsleng.etool.models.egov;

import com.dsleng.etool.models.bobjs.BusinessType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.Admin#getPages <em>Pages</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Admin#getBusinesstypes <em>Businesstypes</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Admin#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getAdmin_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Businesstypes</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.BusinessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businesstypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesstypes</em>' reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getAdmin_Businesstypes()
	 * @model
	 * @generated
	 */
	EList<BusinessType> getBusinesstypes();

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getAdmin_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenu();

} // Admin
