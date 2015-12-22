/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.bobjs.BusinessType;

import com.dsleng.etool.models.egov.Admin;
import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.Menu;
import com.dsleng.etool.models.egov.Page;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AdminImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AdminImpl#getBusinesstypes <em>Businesstypes</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AdminImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminImpl extends MinimalEObjectImpl.Container implements Admin {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getBusinesstypes() <em>Businesstypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinesstypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessType> businesstypes;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, EgovPackage.ADMIN__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessType> getBusinesstypes() {
		if (businesstypes == null) {
			businesstypes = new EObjectResolvingEList<BusinessType>(BusinessType.class, this, EgovPackage.ADMIN__BUSINESSTYPES);
		}
		return businesstypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList<Menu>(Menu.class, this, EgovPackage.ADMIN__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.ADMIN__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case EgovPackage.ADMIN__MENU:
				return ((InternalEList<?>)getMenu()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.ADMIN__PAGES:
				return getPages();
			case EgovPackage.ADMIN__BUSINESSTYPES:
				return getBusinesstypes();
			case EgovPackage.ADMIN__MENU:
				return getMenu();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EgovPackage.ADMIN__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case EgovPackage.ADMIN__BUSINESSTYPES:
				getBusinesstypes().clear();
				getBusinesstypes().addAll((Collection<? extends BusinessType>)newValue);
				return;
			case EgovPackage.ADMIN__MENU:
				getMenu().clear();
				getMenu().addAll((Collection<? extends Menu>)newValue);
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
			case EgovPackage.ADMIN__PAGES:
				getPages().clear();
				return;
			case EgovPackage.ADMIN__BUSINESSTYPES:
				getBusinesstypes().clear();
				return;
			case EgovPackage.ADMIN__MENU:
				getMenu().clear();
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
			case EgovPackage.ADMIN__PAGES:
				return pages != null && !pages.isEmpty();
			case EgovPackage.ADMIN__BUSINESSTYPES:
				return businesstypes != null && !businesstypes.isEmpty();
			case EgovPackage.ADMIN__MENU:
				return menu != null && !menu.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdminImpl
