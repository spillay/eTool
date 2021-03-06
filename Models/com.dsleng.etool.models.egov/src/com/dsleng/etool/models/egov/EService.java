/**
 */
package com.dsleng.etool.models.egov;

import com.dsleng.etool.models.bobjs.OrgUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getPages <em>Pages</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getIndexPage <em>Index Page</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getBusinessUnit <em>Business Unit</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getImports <em>Imports</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getAdminPages <em>Admin Pages</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getEService()
 * @model
 * @generated
 */
public interface EService extends WebElement {
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Index Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Page</em>' reference.
	 * @see #setIndexPage(Page)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_IndexPage()
	 * @model required="true"
	 * @generated
	 */
	Page getIndexPage();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.EService#getIndexPage <em>Index Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Page</em>' reference.
	 * @see #getIndexPage()
	 * @generated
	 */
	void setIndexPage(Page value);

	/**
	 * Returns the value of the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Location</em>' attribute.
	 * @see #setDirLocation(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_DirLocation()
	 * @model
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.EService#getDirLocation <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Location</em>' attribute.
	 * @see #getDirLocation()
	 * @generated
	 */
	void setDirLocation(String value);

	/**
	 * Returns the value of the '<em><b>Business Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Unit</em>' reference.
	 * @see #setBusinessUnit(OrgUnit)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_BusinessUnit()
	 * @model
	 * @generated
	 */
	OrgUnit getBusinessUnit();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.EService#getBusinessUnit <em>Business Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Unit</em>' reference.
	 * @see #getBusinessUnit()
	 * @generated
	 */
	void setBusinessUnit(OrgUnit value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Admin Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Pages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Pages</em>' containment reference.
	 * @see #setAdminPages(Admin)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_AdminPages()
	 * @model containment="true"
	 * @generated
	 */
	Admin getAdminPages();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.EService#getAdminPages <em>Admin Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Pages</em>' containment reference.
	 * @see #getAdminPages()
	 * @generated
	 */
	void setAdminPages(Admin value);

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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenu();

} // EService
