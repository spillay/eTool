/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Annotation;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.DataTypes;
import com.dsleng.etool.models.bobjs.OpParameter;
import com.dsleng.etool.models.bobjs.Operation;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.OperationImpl#getOpparameters <em>Opparameters</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.OperationImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.OperationImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
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
	 * The cached value of the '{@link #getOpparameters() <em>Opparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OpParameter> opparameters;

	/**
	 * The default value of the '{@link #getSyntax() <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected String syntax = SYNTAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.OPERATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpParameter> getOpparameters() {
		if (opparameters == null) {
			opparameters = new EObjectContainmentEList<OpParameter>(OpParameter.class, this, BobjsPackage.OPERATION__OPPARAMETERS);
		}
		return opparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntax() {
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntax(String newSyntax) {
		String oldSyntax = syntax;
		syntax = newSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.OPERATION__SYNTAX, oldSyntax, syntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, BobjsPackage.OPERATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BobjsPackage.OPERATION__OPPARAMETERS:
				return ((InternalEList<?>)getOpparameters()).basicRemove(otherEnd, msgs);
			case BobjsPackage.OPERATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case BobjsPackage.OPERATION__NAME:
				return getName();
			case BobjsPackage.OPERATION__TYPE:
				return getType();
			case BobjsPackage.OPERATION__OPPARAMETERS:
				return getOpparameters();
			case BobjsPackage.OPERATION__SYNTAX:
				return getSyntax();
			case BobjsPackage.OPERATION__ANNOTATIONS:
				return getAnnotations();
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
			case BobjsPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case BobjsPackage.OPERATION__TYPE:
				setType((DataTypes)newValue);
				return;
			case BobjsPackage.OPERATION__OPPARAMETERS:
				getOpparameters().clear();
				getOpparameters().addAll((Collection<? extends OpParameter>)newValue);
				return;
			case BobjsPackage.OPERATION__SYNTAX:
				setSyntax((String)newValue);
				return;
			case BobjsPackage.OPERATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case BobjsPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BobjsPackage.OPERATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BobjsPackage.OPERATION__OPPARAMETERS:
				getOpparameters().clear();
				return;
			case BobjsPackage.OPERATION__SYNTAX:
				setSyntax(SYNTAX_EDEFAULT);
				return;
			case BobjsPackage.OPERATION__ANNOTATIONS:
				getAnnotations().clear();
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
			case BobjsPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BobjsPackage.OPERATION__TYPE:
				return type != TYPE_EDEFAULT;
			case BobjsPackage.OPERATION__OPPARAMETERS:
				return opparameters != null && !opparameters.isEmpty();
			case BobjsPackage.OPERATION__SYNTAX:
				return SYNTAX_EDEFAULT == null ? syntax != null : !SYNTAX_EDEFAULT.equals(syntax);
			case BobjsPackage.OPERATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", syntax: ");
		result.append(syntax);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
