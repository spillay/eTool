/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.Menu;
import com.dsleng.etool.models.egov.MenuType;
import com.dsleng.etool.models.egov.Page;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.MenuImpl#getParentMenu <em>Parent Menu</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.MenuImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.MenuImpl#getPage <em>Page</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.MenuImpl#getMenuType <em>Menu Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuImpl extends WebElementImpl implements Menu {
	/**
	 * The cached value of the '{@link #getParentMenu() <em>Parent Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu parentMenu;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Page page;

	/**
	 * The default value of the '{@link #getMenuType() <em>Menu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuType()
	 * @generated
	 * @ordered
	 */
	protected static final MenuType MENU_TYPE_EDEFAULT = MenuType.STANDARD;

	/**
	 * The cached value of the '{@link #getMenuType() <em>Menu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuType()
	 * @generated
	 * @ordered
	 */
	protected MenuType menuType = MENU_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getParentMenu() {
		if (parentMenu != null && parentMenu.eIsProxy()) {
			InternalEObject oldParentMenu = (InternalEObject)parentMenu;
			parentMenu = (Menu)eResolveProxy(oldParentMenu);
			if (parentMenu != oldParentMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.MENU__PARENT_MENU, oldParentMenu, parentMenu));
			}
		}
		return parentMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetParentMenu() {
		return parentMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMenu(Menu newParentMenu) {
		Menu oldParentMenu = parentMenu;
		parentMenu = newParentMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.MENU__PARENT_MENU, oldParentMenu, parentMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.MENU__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject)page;
			page = (Page)eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.MENU__PAGE, oldPage, page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		Page oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.MENU__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuType getMenuType() {
		return menuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuType(MenuType newMenuType) {
		MenuType oldMenuType = menuType;
		menuType = newMenuType == null ? MENU_TYPE_EDEFAULT : newMenuType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.MENU__MENU_TYPE, oldMenuType, menuType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.MENU__PARENT_MENU:
				if (resolve) return getParentMenu();
				return basicGetParentMenu();
			case EgovPackage.MENU__DESCRIPTION:
				return getDescription();
			case EgovPackage.MENU__PAGE:
				if (resolve) return getPage();
				return basicGetPage();
			case EgovPackage.MENU__MENU_TYPE:
				return getMenuType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EgovPackage.MENU__PARENT_MENU:
				setParentMenu((Menu)newValue);
				return;
			case EgovPackage.MENU__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EgovPackage.MENU__PAGE:
				setPage((Page)newValue);
				return;
			case EgovPackage.MENU__MENU_TYPE:
				setMenuType((MenuType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EgovPackage.MENU__PARENT_MENU:
				setParentMenu((Menu)null);
				return;
			case EgovPackage.MENU__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EgovPackage.MENU__PAGE:
				setPage((Page)null);
				return;
			case EgovPackage.MENU__MENU_TYPE:
				setMenuType(MENU_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EgovPackage.MENU__PARENT_MENU:
				return parentMenu != null;
			case EgovPackage.MENU__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EgovPackage.MENU__PAGE:
				return page != null;
			case EgovPackage.MENU__MENU_TYPE:
				return menuType != MENU_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", menuType: ");
		result.append(menuType);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
