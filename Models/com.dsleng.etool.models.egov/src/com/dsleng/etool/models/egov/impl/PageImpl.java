/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.BusinessObject;
import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.Page;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getNextPage <em>Next Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getBusinessobject() <em>Businessobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessobject()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject businessobject;

	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected Page nextPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessobject() {
		if (businessobject != null && businessobject.eIsProxy()) {
			InternalEObject oldBusinessobject = (InternalEObject)businessobject;
			businessobject = (BusinessObject)eResolveProxy(oldBusinessobject);
			if (businessobject != oldBusinessobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.PAGE__BUSINESSOBJECT, oldBusinessobject, businessobject));
			}
		}
		return businessobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessobject() {
		return businessobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessobject(BusinessObject newBusinessobject) {
		BusinessObject oldBusinessobject = businessobject;
		businessobject = newBusinessobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PAGE__BUSINESSOBJECT, oldBusinessobject, businessobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (Page)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.PAGE__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(Page newNextPage) {
		Page oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PAGE__NEXT_PAGE, oldNextPage, nextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.PAGE__BUSINESSOBJECT:
				if (resolve) return getBusinessobject();
				return basicGetBusinessobject();
			case EgovPackage.PAGE__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
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
			case EgovPackage.PAGE__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)newValue);
				return;
			case EgovPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)newValue);
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
			case EgovPackage.PAGE__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)null);
				return;
			case EgovPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)null);
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
			case EgovPackage.PAGE__BUSINESSOBJECT:
				return businessobject != null;
			case EgovPackage.PAGE__NEXT_PAGE:
				return nextPage != null;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
