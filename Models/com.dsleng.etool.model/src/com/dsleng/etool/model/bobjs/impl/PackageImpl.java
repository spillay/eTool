/**
 */
package com.dsleng.etool.model.bobjs.impl;

import com.dsleng.etool.model.bobjs.BOEnum;
import com.dsleng.etool.model.bobjs.BOImport;
import com.dsleng.etool.model.bobjs.BobjsPackage;
import com.dsleng.etool.model.bobjs.BusinessObject;
import com.dsleng.etool.model.bobjs.BusinessType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.PackageImpl#getBusinesstypes <em>Businesstypes</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.PackageImpl#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.PackageImpl#getBoenums <em>Boenums</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.PackageImpl#getBoimport <em>Boimport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements com.dsleng.etool.model.bobjs.Package {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<com.dsleng.etool.model.bobjs.Package> packages;

	/**
	 * The cached value of the '{@link #getBusinesstypes() <em>Businesstypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinesstypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessType> businesstypes;

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
	 * The cached value of the '{@link #getBoenums() <em>Boenums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoenums()
	 * @generated
	 * @ordered
	 */
	protected EList<BOEnum> boenums;

	/**
	 * The cached value of the '{@link #getBoimport() <em>Boimport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoimport()
	 * @generated
	 * @ordered
	 */
	protected EList<BOImport> boimport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.dsleng.etool.model.bobjs.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<com.dsleng.etool.model.bobjs.Package>(com.dsleng.etool.model.bobjs.Package.class, this, BobjsPackage.PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessType> getBusinesstypes() {
		if (businesstypes == null) {
			businesstypes = new EObjectContainmentEList<BusinessType>(BusinessType.class, this, BobjsPackage.PACKAGE__BUSINESSTYPES);
		}
		return businesstypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObject> getBusinessobjects() {
		if (businessobjects == null) {
			businessobjects = new EObjectContainmentEList<BusinessObject>(BusinessObject.class, this, BobjsPackage.PACKAGE__BUSINESSOBJECTS);
		}
		return businessobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOEnum> getBoenums() {
		if (boenums == null) {
			boenums = new EObjectContainmentEList<BOEnum>(BOEnum.class, this, BobjsPackage.PACKAGE__BOENUMS);
		}
		return boenums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOImport> getBoimport() {
		if (boimport == null) {
			boimport = new EObjectContainmentEList<BOImport>(BOImport.class, this, BobjsPackage.PACKAGE__BOIMPORT);
		}
		return boimport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BobjsPackage.PACKAGE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case BobjsPackage.PACKAGE__BUSINESSTYPES:
				return ((InternalEList<?>)getBusinesstypes()).basicRemove(otherEnd, msgs);
			case BobjsPackage.PACKAGE__BUSINESSOBJECTS:
				return ((InternalEList<?>)getBusinessobjects()).basicRemove(otherEnd, msgs);
			case BobjsPackage.PACKAGE__BOENUMS:
				return ((InternalEList<?>)getBoenums()).basicRemove(otherEnd, msgs);
			case BobjsPackage.PACKAGE__BOIMPORT:
				return ((InternalEList<?>)getBoimport()).basicRemove(otherEnd, msgs);
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
			case BobjsPackage.PACKAGE__PACKAGES:
				return getPackages();
			case BobjsPackage.PACKAGE__BUSINESSTYPES:
				return getBusinesstypes();
			case BobjsPackage.PACKAGE__BUSINESSOBJECTS:
				return getBusinessobjects();
			case BobjsPackage.PACKAGE__BOENUMS:
				return getBoenums();
			case BobjsPackage.PACKAGE__BOIMPORT:
				return getBoimport();
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
			case BobjsPackage.PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends com.dsleng.etool.model.bobjs.Package>)newValue);
				return;
			case BobjsPackage.PACKAGE__BUSINESSTYPES:
				getBusinesstypes().clear();
				getBusinesstypes().addAll((Collection<? extends BusinessType>)newValue);
				return;
			case BobjsPackage.PACKAGE__BUSINESSOBJECTS:
				getBusinessobjects().clear();
				getBusinessobjects().addAll((Collection<? extends BusinessObject>)newValue);
				return;
			case BobjsPackage.PACKAGE__BOENUMS:
				getBoenums().clear();
				getBoenums().addAll((Collection<? extends BOEnum>)newValue);
				return;
			case BobjsPackage.PACKAGE__BOIMPORT:
				getBoimport().clear();
				getBoimport().addAll((Collection<? extends BOImport>)newValue);
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
			case BobjsPackage.PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case BobjsPackage.PACKAGE__BUSINESSTYPES:
				getBusinesstypes().clear();
				return;
			case BobjsPackage.PACKAGE__BUSINESSOBJECTS:
				getBusinessobjects().clear();
				return;
			case BobjsPackage.PACKAGE__BOENUMS:
				getBoenums().clear();
				return;
			case BobjsPackage.PACKAGE__BOIMPORT:
				getBoimport().clear();
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
			case BobjsPackage.PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case BobjsPackage.PACKAGE__BUSINESSTYPES:
				return businesstypes != null && !businesstypes.isEmpty();
			case BobjsPackage.PACKAGE__BUSINESSOBJECTS:
				return businessobjects != null && !businessobjects.isEmpty();
			case BobjsPackage.PACKAGE__BOENUMS:
				return boenums != null && !boenums.isEmpty();
			case BobjsPackage.PACKAGE__BOIMPORT:
				return boimport != null && !boimport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
