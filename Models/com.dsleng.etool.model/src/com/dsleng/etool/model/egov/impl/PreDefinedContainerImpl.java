/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.egov.EgovPackage;
import com.dsleng.etool.model.egov.PreDefinedContainer;
import com.dsleng.etool.model.egov.PreDefinedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Defined Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.impl.PreDefinedContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.PreDefinedContainerImpl#getPredefinedvalues <em>Predefinedvalues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreDefinedContainerImpl extends MinimalEObjectImpl.Container implements PreDefinedContainer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredefinedvalues() <em>Predefinedvalues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedvalues()
	 * @generated
	 * @ordered
	 */
	protected EList<PreDefinedValue> predefinedvalues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreDefinedContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.PRE_DEFINED_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PRE_DEFINED_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreDefinedValue> getPredefinedvalues() {
		if (predefinedvalues == null) {
			predefinedvalues = new EObjectContainmentEList<PreDefinedValue>(PreDefinedValue.class, this, EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES);
		}
		return predefinedvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES:
				return ((InternalEList<?>)getPredefinedvalues()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.PRE_DEFINED_CONTAINER__NAME:
				return getName();
			case EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES:
				return getPredefinedvalues();
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
			case EgovPackage.PRE_DEFINED_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES:
				getPredefinedvalues().clear();
				getPredefinedvalues().addAll((Collection<? extends PreDefinedValue>)newValue);
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
			case EgovPackage.PRE_DEFINED_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES:
				getPredefinedvalues().clear();
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
			case EgovPackage.PRE_DEFINED_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EgovPackage.PRE_DEFINED_CONTAINER__PREDEFINEDVALUES:
				return predefinedvalues != null && !predefinedvalues.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PreDefinedContainerImpl
