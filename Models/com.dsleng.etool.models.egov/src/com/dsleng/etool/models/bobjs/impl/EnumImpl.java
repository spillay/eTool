/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.BOEnum;
import com.dsleng.etool.models.bobjs.BobjsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.EnumImpl#getBoenum <em>Boenum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumImpl extends NamedElementImpl implements com.dsleng.etool.models.bobjs.Enum {
	/**
	 * The cached value of the '{@link #getBoenum() <em>Boenum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoenum()
	 * @generated
	 * @ordered
	 */
	protected BOEnum boenum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOEnum getBoenum() {
		if (boenum != null && boenum.eIsProxy()) {
			InternalEObject oldBoenum = (InternalEObject)boenum;
			boenum = (BOEnum)eResolveProxy(oldBoenum);
			if (boenum != oldBoenum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BobjsPackage.ENUM__BOENUM, oldBoenum, boenum));
			}
		}
		return boenum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOEnum basicGetBoenum() {
		return boenum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoenum(BOEnum newBoenum) {
		BOEnum oldBoenum = boenum;
		boenum = newBoenum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ENUM__BOENUM, oldBoenum, boenum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.ENUM__BOENUM:
				if (resolve) return getBoenum();
				return basicGetBoenum();
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
			case BobjsPackage.ENUM__BOENUM:
				setBoenum((BOEnum)newValue);
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
			case BobjsPackage.ENUM__BOENUM:
				setBoenum((BOEnum)null);
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
			case BobjsPackage.ENUM__BOENUM:
				return boenum != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumImpl
