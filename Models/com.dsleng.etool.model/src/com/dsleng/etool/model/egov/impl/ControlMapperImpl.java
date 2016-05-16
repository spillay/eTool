/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.bobjs.Attribute;

import com.dsleng.etool.model.controls.Options;

import com.dsleng.etool.model.egov.ControlMapper;
import com.dsleng.etool.model.egov.EgovPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ControlMapperImpl#getOption <em>Option</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ControlMapperImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ControlMapperImpl#getMappedTo <em>Mapped To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlMapperImpl extends MinimalEObjectImpl.Container implements ControlMapper {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Options option;

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
	 * The default value of the '{@link #getMappedTo() <em>Mapped To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedTo() <em>Mapped To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedTo()
	 * @generated
	 * @ordered
	 */
	protected String mappedTo = MAPPED_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.CONTROL_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (Options)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.CONTROL_MAPPER__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(Options newOption) {
		Options oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.CONTROL_MAPPER__OPTION, oldOption, option));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.CONTROL_MAPPER__ATTRIBUTE, oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.CONTROL_MAPPER__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedTo() {
		return mappedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedTo(String newMappedTo) {
		String oldMappedTo = mappedTo;
		mappedTo = newMappedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.CONTROL_MAPPER__MAPPED_TO, oldMappedTo, mappedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.CONTROL_MAPPER__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case EgovPackage.CONTROL_MAPPER__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case EgovPackage.CONTROL_MAPPER__MAPPED_TO:
				return getMappedTo();
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
			case EgovPackage.CONTROL_MAPPER__OPTION:
				setOption((Options)newValue);
				return;
			case EgovPackage.CONTROL_MAPPER__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case EgovPackage.CONTROL_MAPPER__MAPPED_TO:
				setMappedTo((String)newValue);
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
			case EgovPackage.CONTROL_MAPPER__OPTION:
				setOption((Options)null);
				return;
			case EgovPackage.CONTROL_MAPPER__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case EgovPackage.CONTROL_MAPPER__MAPPED_TO:
				setMappedTo(MAPPED_TO_EDEFAULT);
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
			case EgovPackage.CONTROL_MAPPER__OPTION:
				return option != null;
			case EgovPackage.CONTROL_MAPPER__ATTRIBUTE:
				return attribute != null;
			case EgovPackage.CONTROL_MAPPER__MAPPED_TO:
				return MAPPED_TO_EDEFAULT == null ? mappedTo != null : !MAPPED_TO_EDEFAULT.equals(mappedTo);
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
		result.append(" (mappedTo: ");
		result.append(mappedTo);
		result.append(')');
		return result.toString();
	}

} //ControlMapperImpl
