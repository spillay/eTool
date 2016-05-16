/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.bobjs.Attribute;

import com.dsleng.etool.model.controls.AttributeType;

import com.dsleng.etool.model.egov.BOAttribute;
import com.dsleng.etool.model.egov.ControlMapper;
import com.dsleng.etool.model.egov.EgovPackage;
import com.dsleng.etool.model.egov.PreDefinedContainer;

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
 * An implementation of the model object '<em><b>BO Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOAttributeImpl#getControltype <em>Controltype</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOAttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOAttributeImpl#getControlparameters <em>Controlparameters</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOAttributeImpl#getPredefinedcontainers <em>Predefinedcontainers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOAttributeImpl extends MinimalEObjectImpl.Container implements BOAttribute {
	/**
	 * The cached value of the '{@link #getControltype() <em>Controltype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControltype()
	 * @generated
	 * @ordered
	 */
	protected AttributeType controltype;

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
	 * The cached value of the '{@link #getControlparameters() <em>Controlparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlMapper> controlparameters;

	/**
	 * The cached value of the '{@link #getPredefinedcontainers() <em>Predefinedcontainers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedcontainers()
	 * @generated
	 * @ordered
	 */
	protected EList<PreDefinedContainer> predefinedcontainers;

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
	public AttributeType getControltype() {
		if (controltype != null && controltype.eIsProxy()) {
			InternalEObject oldControltype = (InternalEObject)controltype;
			controltype = (AttributeType)eResolveProxy(oldControltype);
			if (controltype != oldControltype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.BO_ATTRIBUTE__CONTROLTYPE, oldControltype, controltype));
			}
		}
		return controltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType basicGetControltype() {
		return controltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControltype(AttributeType newControltype) {
		AttributeType oldControltype = controltype;
		controltype = newControltype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.BO_ATTRIBUTE__CONTROLTYPE, oldControltype, controltype));
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
	public EList<ControlMapper> getControlparameters() {
		if (controlparameters == null) {
			controlparameters = new EObjectContainmentEList<ControlMapper>(ControlMapper.class, this, EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS);
		}
		return controlparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreDefinedContainer> getPredefinedcontainers() {
		if (predefinedcontainers == null) {
			predefinedcontainers = new EObjectContainmentEList<PreDefinedContainer>(PreDefinedContainer.class, this, EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS);
		}
		return predefinedcontainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS:
				return ((InternalEList<?>)getControlparameters()).basicRemove(otherEnd, msgs);
			case EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS:
				return ((InternalEList<?>)getPredefinedcontainers()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.BO_ATTRIBUTE__CONTROLTYPE:
				if (resolve) return getControltype();
				return basicGetControltype();
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS:
				return getControlparameters();
			case EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS:
				return getPredefinedcontainers();
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
			case EgovPackage.BO_ATTRIBUTE__CONTROLTYPE:
				setControltype((AttributeType)newValue);
				return;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS:
				getControlparameters().clear();
				getControlparameters().addAll((Collection<? extends ControlMapper>)newValue);
				return;
			case EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS:
				getPredefinedcontainers().clear();
				getPredefinedcontainers().addAll((Collection<? extends PreDefinedContainer>)newValue);
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
			case EgovPackage.BO_ATTRIBUTE__CONTROLTYPE:
				setControltype((AttributeType)null);
				return;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS:
				getControlparameters().clear();
				return;
			case EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS:
				getPredefinedcontainers().clear();
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
			case EgovPackage.BO_ATTRIBUTE__CONTROLTYPE:
				return controltype != null;
			case EgovPackage.BO_ATTRIBUTE__ATTRIBUTE:
				return attribute != null;
			case EgovPackage.BO_ATTRIBUTE__CONTROLPARAMETERS:
				return controlparameters != null && !controlparameters.isEmpty();
			case EgovPackage.BO_ATTRIBUTE__PREDEFINEDCONTAINERS:
				return predefinedcontainers != null && !predefinedcontainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BOAttributeImpl
