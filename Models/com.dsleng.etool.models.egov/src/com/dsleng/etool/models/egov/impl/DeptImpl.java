/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.BusinessObject;
import com.dsleng.etool.models.egov.Dept;
import com.dsleng.etool.models.egov.EService;
import com.dsleng.etool.models.egov.EgovPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getEservices <em>Eservices</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getBusinessobjects <em>Businessobjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeptImpl extends NamedElementImpl implements Dept {
	/**
	 * The cached value of the '{@link #getEservices() <em>Eservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEservices()
	 * @generated
	 * @ordered
	 */
	protected EList<EService> eservices;

	/**
	 * The cached value of the '{@link #getBusinessobjects() <em>Businessobjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObject> businessobjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.DEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EService> getEservices() {
		if (eservices == null) {
			eservices = new EObjectContainmentEList<EService>(EService.class, this, EgovPackage.DEPT__ESERVICES);
		}
		return eservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObject> getBusinessobjects() {
		if (businessobjects == null) {
			businessobjects = new EObjectContainmentEList<BusinessObject>(BusinessObject.class, this, EgovPackage.DEPT__BUSINESSOBJECTS);
		}
		return businessobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.DEPT__ESERVICES:
				return ((InternalEList<?>)getEservices()).basicRemove(otherEnd, msgs);
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return ((InternalEList<?>)getBusinessobjects()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.DEPT__ESERVICES:
				return getEservices();
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return getBusinessobjects();
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
			case EgovPackage.DEPT__ESERVICES:
				getEservices().clear();
				getEservices().addAll((Collection<? extends EService>)newValue);
				return;
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				getBusinessobjects().clear();
				getBusinessobjects().addAll((Collection<? extends BusinessObject>)newValue);
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
			case EgovPackage.DEPT__ESERVICES:
				getEservices().clear();
				return;
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				getBusinessobjects().clear();
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
			case EgovPackage.DEPT__ESERVICES:
				return eservices != null && !eservices.isEmpty();
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return businessobjects != null && !businessobjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeptImpl
