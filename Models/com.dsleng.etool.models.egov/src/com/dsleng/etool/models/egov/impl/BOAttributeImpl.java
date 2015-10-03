/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.Controls.Type;

import com.dsleng.etool.models.bobjs.Attribute;

import com.dsleng.etool.models.egov.BOAttribute;
import com.dsleng.etool.models.egov.EgovPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BO Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.BOAttributeImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.BOAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOAttributeImpl extends MinimalEObjectImpl.Container implements BOAttribute {
	/**
	 * The cached value of the '{@link #getControlType() <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
	protected Type controlType;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.BO_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getControlType() {
		if (controlType != null && controlType.eIsProxy()) {
			InternalEObject oldControlType = (InternalEObject)controlType;
			controlType = (Type)eResolveProxy(oldControlType);
			if (controlType != oldControlType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE, oldControlType, controlType));
			}
		}
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetControlType() {
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlType(Type newControlType) {
		Type oldControlType = controlType;
		controlType = newControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE, oldControlType, controlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.BO_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.BO_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE:
				if (resolve) return getControlType();
				return basicGetControlType();
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE:
				setControlType((Type)newValue);
				return;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
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
			case EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE:
				setControlType((Type)null);
				return;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				setAttribute((Attribute)null);
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
			case EgovPackage.BO_ATTRIBUTE__CONTROL_TYPE:
				return controlType != null;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //BOAttributeImpl
