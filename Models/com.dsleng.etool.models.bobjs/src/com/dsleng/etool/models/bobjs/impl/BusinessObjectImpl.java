/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.BusinessObject;
import com.dsleng.etool.models.bobjs.References;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessObjectImpl extends NamedElementImpl implements BusinessObject {
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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<References> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.BUSINESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<References> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<References>(References.class, this, BobjsPackage.BUSINESS_OBJECT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case BobjsPackage.BUSINESS_OBJECT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return getAttributes();
			case BobjsPackage.BUSINESS_OBJECT__REFERENCES:
				return getReferences();
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
			case BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case BobjsPackage.BUSINESS_OBJECT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends References>)newValue);
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
			case BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case BobjsPackage.BUSINESS_OBJECT__REFERENCES:
				getReferences().clear();
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
			case BobjsPackage.BUSINESS_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case BobjsPackage.BUSINESS_OBJECT__REFERENCES:
				return references != null && !references.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessObjectImpl
