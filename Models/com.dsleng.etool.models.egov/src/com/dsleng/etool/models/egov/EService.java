/**
 */
package com.dsleng.etool.models.egov;



import org.eclipse.emf.common.util.EList;

import com.dsleng.etool.models.bobjs.OrgUnit;

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
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getEService()
 * @model
 * @generated
 */
public interface EService extends NamedElement {
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

} // EService
