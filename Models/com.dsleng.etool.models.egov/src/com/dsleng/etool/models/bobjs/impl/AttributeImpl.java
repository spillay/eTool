/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.BusinessType;
import com.dsleng.etool.models.bobjs.DataTypes;

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
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#isDataManagement <em>Data Management</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.AttributeImpl#getSpType <em>Sp Type</em>}</li>
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDataManagement() <em>Data Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataManagement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_MANAGEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataManagement() <em>Data Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataManagement()
	 * @generated
	 * @ordered
	 */
	protected boolean dataManagement = DATA_MANAGEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpType() <em>Sp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpType()
	 * @generated
	 * @ordered
	 */
	protected BusinessType spType;

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
		return BobjsPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataManagement() {
		return dataManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataManagement(boolean newDataManagement) {
		boolean oldDataManagement = dataManagement;
		dataManagement = newDataManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__DATA_MANAGEMENT, oldDataManagement, dataManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessType getSpType() {
		if (spType != null && spType.eIsProxy()) {
			InternalEObject oldSpType = (InternalEObject)spType;
			spType = (BusinessType)eResolveProxy(oldSpType);
			if (spType != oldSpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BobjsPackage.ATTRIBUTE__SP_TYPE, oldSpType, spType));
			}
		}
		return spType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessType basicGetSpType() {
		return spType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpType(BusinessType newSpType) {
		BusinessType oldSpType = spType;
		spType = newSpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ATTRIBUTE__SP_TYPE, oldSpType, spType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.ATTRIBUTE__LABEL:
				return getLabel();
			case BobjsPackage.ATTRIBUTE__TYPE:
				return getType();
			case BobjsPackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case BobjsPackage.ATTRIBUTE__MANDATORY:
				return isMandatory();
			case BobjsPackage.ATTRIBUTE__DATA_MANAGEMENT:
				return isDataManagement();
			case BobjsPackage.ATTRIBUTE__SP_TYPE:
				if (resolve) return getSpType();
				return basicGetSpType();
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
			case BobjsPackage.ATTRIBUTE__LABEL:
				setLabel((String)newValue);
				return;
			case BobjsPackage.ATTRIBUTE__TYPE:
				setType((DataTypes)newValue);
				return;
			case BobjsPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case BobjsPackage.ATTRIBUTE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case BobjsPackage.ATTRIBUTE__DATA_MANAGEMENT:
				setDataManagement((Boolean)newValue);
				return;
			case BobjsPackage.ATTRIBUTE__SP_TYPE:
				setSpType((BusinessType)newValue);
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
			case BobjsPackage.ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case BobjsPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BobjsPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case BobjsPackage.ATTRIBUTE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case BobjsPackage.ATTRIBUTE__DATA_MANAGEMENT:
				setDataManagement(DATA_MANAGEMENT_EDEFAULT);
				return;
			case BobjsPackage.ATTRIBUTE__SP_TYPE:
				setSpType((BusinessType)null);
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
			case BobjsPackage.ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case BobjsPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case BobjsPackage.ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case BobjsPackage.ATTRIBUTE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case BobjsPackage.ATTRIBUTE__DATA_MANAGEMENT:
				return dataManagement != DATA_MANAGEMENT_EDEFAULT;
			case BobjsPackage.ATTRIBUTE__SP_TYPE:
				return spType != null;
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", dataManagement: ");
		result.append(dataManagement);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
