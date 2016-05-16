/**
 */
package com.dsleng.etool.model.egov;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.Menu#getParentMenu <em>Parent Menu</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.Menu#getDescription <em>Description</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.Menu#getPage <em>Page</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.Menu#getMenuType <em>Menu Type</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.egov.EgovPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends WebElement {
	/**
	 * Returns the value of the '<em><b>Parent Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Menu</em>' reference.
	 * @see #setParentMenu(Menu)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getMenu_ParentMenu()
	 * @model
	 * @generated
	 */
	Menu getParentMenu();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Menu#getParentMenu <em>Parent Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Menu</em>' reference.
	 * @see #getParentMenu()
	 * @generated
	 */
	void setParentMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getMenu_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Menu#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getMenu_Page()
	 * @model
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Menu#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Menu Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.model.egov.MenuType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Type</em>' attribute.
	 * @see com.dsleng.etool.model.egov.MenuType
	 * @see #setMenuType(MenuType)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getMenu_MenuType()
	 * @model
	 * @generated
	 */
	MenuType getMenuType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Menu#getMenuType <em>Menu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Type</em>' attribute.
	 * @see com.dsleng.etool.model.egov.MenuType
	 * @see #getMenuType()
	 * @generated
	 */
	void setMenuType(MenuType value);

} // Menu
