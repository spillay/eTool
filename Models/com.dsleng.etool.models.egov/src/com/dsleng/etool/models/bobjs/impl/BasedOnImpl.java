/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.bobjs.BasedOn;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.BusinessObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Based On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BasedOnImpl#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BasedOnImpl#getRemoves <em>Removes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasedOnImpl extends MinimalEObjectImpl.Container implements BasedOn {
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
	 * The cached value of the '{@link #getRemoves() <em>Removes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> removes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasedOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.BASED_ON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BobjsPackage.BASED_ON__BUSINESSOBJECT, oldBusinessobject, businessobject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.BASED_ON__BUSINESSOBJECT, oldBusinessobject, businessobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRemoves() {
		if (removes == null) {
			removes = new EObjectResolvingEList<Attribute>(Attribute.class, this, BobjsPackage.BASED_ON__REMOVES);
		}
		return removes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.BASED_ON__BUSINESSOBJECT:
				if (resolve) return getBusinessobject();
				return basicGetBusinessobject();
			case BobjsPackage.BASED_ON__REMOVES:
				return getRemoves();
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
			case BobjsPackage.BASED_ON__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)newValue);
				return;
			case BobjsPackage.BASED_ON__REMOVES:
				getRemoves().clear();
				getRemoves().addAll((Collection<? extends Attribute>)newValue);
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
			case BobjsPackage.BASED_ON__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)null);
				return;
			case BobjsPackage.BASED_ON__REMOVES:
				getRemoves().clear();
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
			case BobjsPackage.BASED_ON__BUSINESSOBJECT:
				return businessobject != null;
			case BobjsPackage.BASED_ON__REMOVES:
				return removes != null && !removes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasedOnImpl
