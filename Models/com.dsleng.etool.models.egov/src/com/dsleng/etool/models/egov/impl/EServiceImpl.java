/**
 */
package com.dsleng.etool.models.egov.impl;



import com.dsleng.etool.models.bobjs.OrgUnit;
import com.dsleng.etool.models.egov.EService;
import com.dsleng.etool.models.egov.EgovPackage;
import com.dsleng.etool.models.egov.Page;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.EServiceImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.EServiceImpl#getIndexPage <em>Index Page</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.EServiceImpl#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.EServiceImpl#getBusinessUnit <em>Business Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EServiceImpl extends NamedElementImpl implements EService {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getIndexPage() <em>Index Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexPage()
	 * @generated
	 * @ordered
	 */
	protected Page indexPage;

	/**
	 * The default value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected String dirLocation = DIR_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessUnit() <em>Business Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessUnit()
	 * @generated
	 * @ordered
	 */
	protected OrgUnit businessUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.ESERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, EgovPackage.ESERVICE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getIndexPage() {
		if (indexPage != null && indexPage.eIsProxy()) {
			InternalEObject oldIndexPage = (InternalEObject)indexPage;
			indexPage = (Page)eResolveProxy(oldIndexPage);
			if (indexPage != oldIndexPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.ESERVICE__INDEX_PAGE, oldIndexPage, indexPage));
			}
		}
		return indexPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetIndexPage() {
		return indexPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexPage(Page newIndexPage) {
		Page oldIndexPage = indexPage;
		indexPage = newIndexPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ESERVICE__INDEX_PAGE, oldIndexPage, indexPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirLocation() {
		return dirLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirLocation(String newDirLocation) {
		String oldDirLocation = dirLocation;
		dirLocation = newDirLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ESERVICE__DIR_LOCATION, oldDirLocation, dirLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit getBusinessUnit() {
		if (businessUnit != null && businessUnit.eIsProxy()) {
			InternalEObject oldBusinessUnit = (InternalEObject)businessUnit;
			businessUnit = (OrgUnit)eResolveProxy(oldBusinessUnit);
			if (businessUnit != oldBusinessUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.ESERVICE__BUSINESS_UNIT, oldBusinessUnit, businessUnit));
			}
		}
		return businessUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit basicGetBusinessUnit() {
		return businessUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessUnit(OrgUnit newBusinessUnit) {
		OrgUnit oldBusinessUnit = businessUnit;
		businessUnit = newBusinessUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.ESERVICE__BUSINESS_UNIT, oldBusinessUnit, businessUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.ESERVICE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.ESERVICE__PAGES:
				return getPages();
			case EgovPackage.ESERVICE__INDEX_PAGE:
				if (resolve) return getIndexPage();
				return basicGetIndexPage();
			case EgovPackage.ESERVICE__DIR_LOCATION:
				return getDirLocation();
			case EgovPackage.ESERVICE__BUSINESS_UNIT:
				if (resolve) return getBusinessUnit();
				return basicGetBusinessUnit();
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
			case EgovPackage.ESERVICE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case EgovPackage.ESERVICE__INDEX_PAGE:
				setIndexPage((Page)newValue);
				return;
			case EgovPackage.ESERVICE__DIR_LOCATION:
				setDirLocation((String)newValue);
				return;
			case EgovPackage.ESERVICE__BUSINESS_UNIT:
				setBusinessUnit((OrgUnit)newValue);
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
			case EgovPackage.ESERVICE__PAGES:
				getPages().clear();
				return;
			case EgovPackage.ESERVICE__INDEX_PAGE:
				setIndexPage((Page)null);
				return;
			case EgovPackage.ESERVICE__DIR_LOCATION:
				setDirLocation(DIR_LOCATION_EDEFAULT);
				return;
			case EgovPackage.ESERVICE__BUSINESS_UNIT:
				setBusinessUnit((OrgUnit)null);
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
			case EgovPackage.ESERVICE__PAGES:
				return pages != null && !pages.isEmpty();
			case EgovPackage.ESERVICE__INDEX_PAGE:
				return indexPage != null;
			case EgovPackage.ESERVICE__DIR_LOCATION:
				return DIR_LOCATION_EDEFAULT == null ? dirLocation != null : !DIR_LOCATION_EDEFAULT.equals(dirLocation);
			case EgovPackage.ESERVICE__BUSINESS_UNIT:
				return businessUnit != null;
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
		result.append(" (dirLocation: ");
		result.append(dirLocation);
		result.append(')');
		return result.toString();
	}

} //EServiceImpl
