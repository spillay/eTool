/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.bobjs.BasedOn;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.BusinessObject;
import com.dsleng.etool.models.bobjs.References;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.impl.BusinessObjectImpl#getBasedon <em>Basedon</em>}</li>
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
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObject> superTypes;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<com.dsleng.etool.models.bobjs.Enum> enums;

	/**
	 * The cached value of the '{@link #getBasedon() <em>Basedon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedon()
	 * @generated
	 * @ordered
	 */
	protected EList<BasedOn> basedon;

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
	public EList<BusinessObject> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<BusinessObject>(BusinessObject.class, this, BobjsPackage.BUSINESS_OBJECT__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.dsleng.etool.models.bobjs.Enum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<com.dsleng.etool.models.bobjs.Enum>(com.dsleng.etool.models.bobjs.Enum.class, this, BobjsPackage.BUSINESS_OBJECT__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasedOn> getBasedon() {
		if (basedon == null) {
			basedon = new EObjectContainmentEList<BasedOn>(BasedOn.class, this, BobjsPackage.BUSINESS_OBJECT__BASEDON);
		}
		return basedon;
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
			case BobjsPackage.BUSINESS_OBJECT__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
			case BobjsPackage.BUSINESS_OBJECT__BASEDON:
				return ((InternalEList<?>)getBasedon()).basicRemove(otherEnd, msgs);
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
			case BobjsPackage.BUSINESS_OBJECT__SUPER_TYPES:
				return getSuperTypes();
			case BobjsPackage.BUSINESS_OBJECT__ENUMS:
				return getEnums();
			case BobjsPackage.BUSINESS_OBJECT__BASEDON:
				return getBasedon();
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
			case BobjsPackage.BUSINESS_OBJECT__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends BusinessObject>)newValue);
				return;
			case BobjsPackage.BUSINESS_OBJECT__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends com.dsleng.etool.models.bobjs.Enum>)newValue);
				return;
			case BobjsPackage.BUSINESS_OBJECT__BASEDON:
				getBasedon().clear();
				getBasedon().addAll((Collection<? extends BasedOn>)newValue);
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
			case BobjsPackage.BUSINESS_OBJECT__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case BobjsPackage.BUSINESS_OBJECT__ENUMS:
				getEnums().clear();
				return;
			case BobjsPackage.BUSINESS_OBJECT__BASEDON:
				getBasedon().clear();
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
			case BobjsPackage.BUSINESS_OBJECT__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case BobjsPackage.BUSINESS_OBJECT__ENUMS:
				return enums != null && !enums.isEmpty();
			case BobjsPackage.BUSINESS_OBJECT__BASEDON:
				return basedon != null && !basedon.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessObjectImpl
