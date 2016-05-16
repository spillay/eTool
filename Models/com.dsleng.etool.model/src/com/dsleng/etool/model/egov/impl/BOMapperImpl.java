/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.bobjs.BusinessObject;

import com.dsleng.etool.model.controls.BOType;

import com.dsleng.etool.model.egov.BOAttribute;
import com.dsleng.etool.model.egov.BOMapper;
import com.dsleng.etool.model.egov.EgovPackage;

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
 * An implementation of the model object '<em><b>BO Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOMapperImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOMapperImpl#getBusinessObject <em>Business Object</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.BOMapperImpl#getBotype <em>Botype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOMapperImpl extends MinimalEObjectImpl.Container implements BOMapper {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<BOAttribute> attributes;

	/**
	 * The cached value of the '{@link #getBusinessObject() <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessObject()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject businessObject;

	/**
	 * The cached value of the '{@link #getBotype() <em>Botype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotype()
	 * @generated
	 * @ordered
	 */
	protected BOType botype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.BO_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<BOAttribute>(BOAttribute.class, this, EgovPackage.BO_MAPPER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessObject() {
		if (businessObject != null && businessObject.eIsProxy()) {
			InternalEObject oldBusinessObject = (InternalEObject)businessObject;
			businessObject = (BusinessObject)eResolveProxy(oldBusinessObject);
			if (businessObject != oldBusinessObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.BO_MAPPER__BUSINESS_OBJECT, oldBusinessObject, businessObject));
			}
		}
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessObject() {
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessObject(BusinessObject newBusinessObject) {
		BusinessObject oldBusinessObject = businessObject;
		businessObject = newBusinessObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.BO_MAPPER__BUSINESS_OBJECT, oldBusinessObject, businessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOType getBotype() {
		if (botype != null && botype.eIsProxy()) {
			InternalEObject oldBotype = (InternalEObject)botype;
			botype = (BOType)eResolveProxy(oldBotype);
			if (botype != oldBotype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.BO_MAPPER__BOTYPE, oldBotype, botype));
			}
		}
		return botype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOType basicGetBotype() {
		return botype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBotype(BOType newBotype) {
		BOType oldBotype = botype;
		botype = newBotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.BO_MAPPER__BOTYPE, oldBotype, botype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.BO_MAPPER__ATTRIBUTES:
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
			case EgovPackage.BO_MAPPER__ATTRIBUTES:
				return getAttributes();
			case EgovPackage.BO_MAPPER__BUSINESS_OBJECT:
				if (resolve) return getBusinessObject();
				return basicGetBusinessObject();
			case EgovPackage.BO_MAPPER__BOTYPE:
				if (resolve) return getBotype();
				return basicGetBotype();
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
			case EgovPackage.BO_MAPPER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends BOAttribute>)newValue);
				return;
			case EgovPackage.BO_MAPPER__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)newValue);
				return;
			case EgovPackage.BO_MAPPER__BOTYPE:
				setBotype((BOType)newValue);
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
			case EgovPackage.BO_MAPPER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EgovPackage.BO_MAPPER__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)null);
				return;
			case EgovPackage.BO_MAPPER__BOTYPE:
				setBotype((BOType)null);
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
			case EgovPackage.BO_MAPPER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EgovPackage.BO_MAPPER__BUSINESS_OBJECT:
				return businessObject != null;
			case EgovPackage.BO_MAPPER__BOTYPE:
				return botype != null;
		}
		return super.eIsSet(featureID);
	}

} //BOMapperImpl
