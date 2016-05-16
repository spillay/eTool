/**
 */
package com.dsleng.etool.model.bobjs.impl;

import com.dsleng.etool.model.bobjs.Attribute;
import com.dsleng.etool.model.bobjs.BobjsPackage;
import com.dsleng.etool.model.bobjs.BusinessType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.BusinessTypeImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.BusinessTypeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessTypeImpl extends NamedElementImpl implements BusinessType {
	/**
	 * The cached value of the '{@link #getLookup() <em>Lookup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookup()
	 * @generated
	 * @ordered
	 */
	protected Attribute lookup;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.BUSINESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getLookup() {
		if (lookup != null && lookup.eIsProxy()) {
			InternalEObject oldLookup = (InternalEObject)lookup;
			lookup = (Attribute)eResolveProxy(oldLookup);
			if (lookup != oldLookup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BobjsPackage.BUSINESS_TYPE__LOOKUP, oldLookup, lookup));
			}
		}
		return lookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetLookup() {
		return lookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookup(Attribute newLookup) {
		Attribute oldLookup = lookup;
		lookup = newLookup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.BUSINESS_TYPE__LOOKUP, oldLookup, lookup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BobjsPackage.BUSINESS_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BobjsPackage.BUSINESS_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case BobjsPackage.BUSINESS_TYPE__LOOKUP:
				if (resolve) return getLookup();
				return basicGetLookup();
			case BobjsPackage.BUSINESS_TYPE__ATTRIBUTES:
				return getAttributes();
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
			case BobjsPackage.BUSINESS_TYPE__LOOKUP:
				setLookup((Attribute)newValue);
				return;
			case BobjsPackage.BUSINESS_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case BobjsPackage.BUSINESS_TYPE__LOOKUP:
				setLookup((Attribute)null);
				return;
			case BobjsPackage.BUSINESS_TYPE__ATTRIBUTES:
				getAttributes().clear();
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
			case BobjsPackage.BUSINESS_TYPE__LOOKUP:
				return lookup != null;
			case BobjsPackage.BUSINESS_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessTypeImpl
