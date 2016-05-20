/**
 */
package com.dsleng.etool.model.bobjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.Package#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.Package#getBusinesstypes <em>Businesstypes</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.Package#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.Package#getBoenums <em>Boenums</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.Package#getBoimport <em>Boimport</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Businesstypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BusinessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businesstypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesstypes</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage_Businesstypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessType> getBusinesstypes();

	/**
	 * Returns the value of the '<em><b>Businessobjects</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessobjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobjects</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage_Businessobjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessObject> getBusinessobjects();

	/**
	 * Returns the value of the '<em><b>Boenums</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BOEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boenums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boenums</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage_Boenums()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOEnum> getBoenums();

	/**
	 * Returns the value of the '<em><b>Boimport</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BOImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boimport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boimport</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getPackage_Boimport()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOImport> getBoimport();

} // Package
