/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.Attribute;
import com.dsleng.etool.models.egov.DataTypes;
import com.dsleng.etool.models.egov.EgovPackage;
import controls.SimpleControl;
import controls.Type;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AttributeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AttributeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.AttributeImpl#getUIType <em>UI Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes TYPE_EDEFAULT = DataTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected SimpleControl control;

	/**
	 * The cached value of the '{@link #getUIType() <em>UI Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIType()
	 * @generated
	 * @ordered
	 */
	protected Type uiType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ATTRIBUTE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypes newType) {
		DataTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleControl getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject)control;
			control = (SimpleControl)eResolveProxy(oldControl);
			if (control != oldControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.ATTRIBUTE__CONTROL, oldControl, control));
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleControl basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(SimpleControl newControl) {
		SimpleControl oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ATTRIBUTE__CONTROL, oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getUIType() {
		if (uiType != null && uiType.eIsProxy()) {
			InternalEObject oldUIType = (InternalEObject)uiType;
			uiType = (Type)eResolveProxy(oldUIType);
			if (uiType != oldUIType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.ATTRIBUTE__UI_TYPE, oldUIType, uiType));
			}
		}
		return uiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetUIType() {
		return uiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUIType(Type newUIType) {
		Type oldUIType = uiType;
		uiType = newUIType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ATTRIBUTE__UI_TYPE, oldUIType, uiType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.ATTRIBUTE__LABEL:
				return getLabel();
			case EgovPackage.ATTRIBUTE__TYPE:
				return getType();
			case EgovPackage.ATTRIBUTE__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case EgovPackage.ATTRIBUTE__UI_TYPE:
				if (resolve) return getUIType();
				return basicGetUIType();
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
			case EgovPackage.ATTRIBUTE__LABEL:
				setLabel((String)newValue);
				return;
			case EgovPackage.ATTRIBUTE__TYPE:
				setType((DataTypes)newValue);
				return;
			case EgovPackage.ATTRIBUTE__CONTROL:
				setControl((SimpleControl)newValue);
				return;
			case EgovPackage.ATTRIBUTE__UI_TYPE:
				setUIType((Type)newValue);
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
			case EgovPackage.ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case EgovPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EgovPackage.ATTRIBUTE__CONTROL:
				setControl((SimpleControl)null);
				return;
			case EgovPackage.ATTRIBUTE__UI_TYPE:
				setUIType((Type)null);
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
			case EgovPackage.ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case EgovPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case EgovPackage.ATTRIBUTE__CONTROL:
				return control != null;
			case EgovPackage.ATTRIBUTE__UI_TYPE:
				return uiType != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
