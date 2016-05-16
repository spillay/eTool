/**
 */
package com.dsleng.etool.model.bobjs.impl;

import com.dsleng.etool.model.bobjs.BobjsPackage;
import com.dsleng.etool.model.bobjs.BusinessObject;
import com.dsleng.etool.model.bobjs.Inclusions;
import com.dsleng.etool.model.bobjs.Multiplicity;
import com.dsleng.etool.model.bobjs.References;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.ReferencesImpl#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.ReferencesImpl#getInclusion <em>Inclusion</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.ReferencesImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencesImpl extends MinimalEObjectImpl.Container implements References {
	/**
	 * The cached value of the '{@link #getBusinessobject() <em>Businessobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessobject()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject businessobject;

	/**
	 * The default value of the '{@link #getInclusion() <em>Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusion()
	 * @generated
	 * @ordered
	 */
	protected static final Inclusions INCLUSION_EDEFAULT = Inclusions.MANDATORY;

	/**
	 * The cached value of the '{@link #getInclusion() <em>Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusion()
	 * @generated
	 * @ordered
	 */
	protected Inclusions inclusion = INCLUSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity.ONE_TOONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.REFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessobject() {
		if (businessobject != null && businessobject.eIsProxy()) {
			InternalEObject oldBusinessobject = (InternalEObject)businessobject;
			businessobject = (BusinessObject)eResolveProxy(oldBusinessobject);
			if (businessobject != oldBusinessobject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BobjsPackage.REFERENCES__BUSINESSOBJECT, oldBusinessobject, businessobject));
			}
		}
		return businessobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessobject() {
		return businessobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessobject(BusinessObject newBusinessobject) {
		BusinessObject oldBusinessobject = businessobject;
		businessobject = newBusinessobject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.REFERENCES__BUSINESSOBJECT, oldBusinessobject, businessobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusions getInclusion() {
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusion(Inclusions newInclusion) {
		Inclusions oldInclusion = inclusion;
		inclusion = newInclusion == null ? INCLUSION_EDEFAULT : newInclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.REFERENCES__INCLUSION, oldInclusion, inclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.REFERENCES__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.REFERENCES__BUSINESSOBJECT:
				if (resolve) return getBusinessobject();
				return basicGetBusinessobject();
			case BobjsPackage.REFERENCES__INCLUSION:
				return getInclusion();
			case BobjsPackage.REFERENCES__MULTIPLICITY:
				return getMultiplicity();
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
			case BobjsPackage.REFERENCES__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)newValue);
				return;
			case BobjsPackage.REFERENCES__INCLUSION:
				setInclusion((Inclusions)newValue);
				return;
			case BobjsPackage.REFERENCES__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
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
			case BobjsPackage.REFERENCES__BUSINESSOBJECT:
				setBusinessobject((BusinessObject)null);
				return;
			case BobjsPackage.REFERENCES__INCLUSION:
				setInclusion(INCLUSION_EDEFAULT);
				return;
			case BobjsPackage.REFERENCES__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case BobjsPackage.REFERENCES__BUSINESSOBJECT:
				return businessobject != null;
			case BobjsPackage.REFERENCES__INCLUSION:
				return inclusion != INCLUSION_EDEFAULT;
			case BobjsPackage.REFERENCES__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(" (Inclusion: ");
		result.append(inclusion);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //ReferencesImpl
