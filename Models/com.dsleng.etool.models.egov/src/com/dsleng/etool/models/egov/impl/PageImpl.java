/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.Controls.AttributeType;
import com.dsleng.etool.models.Controls.PageType;
import com.dsleng.etool.models.egov.BOMapper;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getBOMaps <em>BO Maps</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getPagetype <em>Pagetype</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.PageImpl#getExtraControls <em>Extra Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected Page nextPage;

	/**
	 * The cached value of the '{@link #getBOMaps() <em>BO Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<BOMapper> boMaps;

	/**
	 * The cached value of the '{@link #getPagetype() <em>Pagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagetype()
	 * @generated
	 * @ordered
	 */
	protected PageType pagetype;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtraControls() <em>Extra Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraControls()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeType> extraControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (Page)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.PAGE__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(Page newNextPage) {
		Page oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PAGE__NEXT_PAGE, oldNextPage, nextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOMapper> getBOMaps() {
		if (boMaps == null) {
			boMaps = new EObjectContainmentEList<BOMapper>(BOMapper.class, this, EgovPackage.PAGE__BO_MAPS);
		}
		return boMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType getPagetype() {
		if (pagetype != null && pagetype.eIsProxy()) {
			InternalEObject oldPagetype = (InternalEObject)pagetype;
			pagetype = (PageType)eResolveProxy(oldPagetype);
			if (pagetype != oldPagetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgovPackage.PAGE__PAGETYPE, oldPagetype, pagetype));
			}
		}
		return pagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType basicGetPagetype() {
		return pagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagetype(PageType newPagetype) {
		PageType oldPagetype = pagetype;
		pagetype = newPagetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PAGE__PAGETYPE, oldPagetype, pagetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeType> getExtraControls() {
		if (extraControls == null) {
			extraControls = new EObjectResolvingEList<AttributeType>(AttributeType.class, this, EgovPackage.PAGE__EXTRA_CONTROLS);
		}
		return extraControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.PAGE__BO_MAPS:
				return ((InternalEList<?>)getBOMaps()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.PAGE__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
			case EgovPackage.PAGE__BO_MAPS:
				return getBOMaps();
			case EgovPackage.PAGE__PAGETYPE:
				if (resolve) return getPagetype();
				return basicGetPagetype();
			case EgovPackage.PAGE__TITLE:
				return getTitle();
			case EgovPackage.PAGE__EXTRA_CONTROLS:
				return getExtraControls();
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
			case EgovPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)newValue);
				return;
			case EgovPackage.PAGE__BO_MAPS:
				getBOMaps().clear();
				getBOMaps().addAll((Collection<? extends BOMapper>)newValue);
				return;
			case EgovPackage.PAGE__PAGETYPE:
				setPagetype((PageType)newValue);
				return;
			case EgovPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case EgovPackage.PAGE__EXTRA_CONTROLS:
				getExtraControls().clear();
				getExtraControls().addAll((Collection<? extends AttributeType>)newValue);
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
			case EgovPackage.PAGE__NEXT_PAGE:
				setNextPage((Page)null);
				return;
			case EgovPackage.PAGE__BO_MAPS:
				getBOMaps().clear();
				return;
			case EgovPackage.PAGE__PAGETYPE:
				setPagetype((PageType)null);
				return;
			case EgovPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EgovPackage.PAGE__EXTRA_CONTROLS:
				getExtraControls().clear();
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
			case EgovPackage.PAGE__NEXT_PAGE:
				return nextPage != null;
			case EgovPackage.PAGE__BO_MAPS:
				return boMaps != null && !boMaps.isEmpty();
			case EgovPackage.PAGE__PAGETYPE:
				return pagetype != null;
			case EgovPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EgovPackage.PAGE__EXTRA_CONTROLS:
				return extraControls != null && !extraControls.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl
