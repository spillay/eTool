/**
 */
package com.dsleng.etool.models.egov;

import com.dsleng.etool.models.Controls.AttributeType;
import com.dsleng.etool.models.Controls.PageType;

import com.dsleng.etool.models.bobjs.BusinessType;
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
 *   <li>{@link com.dsleng.etool.models.egov.Page#getExtraControls <em>Extra Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getNorth <em>North</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getSouth <em>South</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getWest <em>West</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getEast <em>East</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Page#getBusinesstype <em>Businesstype</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends WebElement {
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

	/**
	 * Returns the value of the '<em><b>Extra Controls</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.Controls.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Controls</em>' reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_ExtraControls()
	 * @model
	 * @generated
	 */
	EList<AttributeType> getExtraControls();

	/**
	 * Returns the value of the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>North</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' attribute.
	 * @see #setNorth(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_North()
	 * @model
	 * @generated
	 */
	String getNorth();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' attribute.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(String value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>South</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' attribute.
	 * @see #setSouth(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_South()
	 * @model
	 * @generated
	 */
	String getSouth();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' attribute.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(String value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>West</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' attribute.
	 * @see #setWest(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_West()
	 * @model
	 * @generated
	 */
	String getWest();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' attribute.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(String value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>East</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' attribute.
	 * @see #setEast(String)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_East()
	 * @model
	 * @generated
	 */
	String getEast();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' attribute.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(String value);

	/**
	 * Returns the value of the '<em><b>Businesstype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businesstype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesstype</em>' reference.
	 * @see #setBusinesstype(BusinessType)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getPage_Businesstype()
	 * @model
	 * @generated
	 */
	BusinessType getBusinesstype();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Page#getBusinesstype <em>Businesstype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Businesstype</em>' reference.
	 * @see #getBusinesstype()
	 * @generated
	 */
	void setBusinesstype(BusinessType value);

} // Page
