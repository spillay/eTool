/**
 */
package com.dsleng.etool.model.controls.impl;

import com.dsleng.etool.model.controls.Composite;
import com.dsleng.etool.model.controls.ControlGroup;
import com.dsleng.etool.model.controls.ControlsPackage;
import com.dsleng.etool.model.controls.PageInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.controls.impl.ControlGroupImpl#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.impl.ControlGroupImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link com.dsleng.etool.model.controls.impl.ControlGroupImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlGroupImpl extends MinimalEObjectImpl.Container implements ControlGroup {
	/**
	 * The cached value of the '{@link #getPageinfos() <em>Pageinfos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageinfos()
	 * @generated
	 * @ordered
	 */
	protected EList<PageInfo> pageinfos;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> composites;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.CONTROL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageInfo> getPageinfos() {
		if (pageinfos == null) {
			pageinfos = new EObjectResolvingEList<PageInfo>(PageInfo.class, this, ControlsPackage.CONTROL_GROUP__PAGEINFOS);
		}
		return pageinfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getComposites() {
		if (composites == null) {
			composites = new EObjectResolvingEList<Composite>(Composite.class, this, ControlsPackage.CONTROL_GROUP__COMPOSITES);
		}
		return composites;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlsPackage.CONTROL_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				return getPageinfos();
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
				return getComposites();
			case ControlsPackage.CONTROL_GROUP__NAME:
				return getName();
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
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				getPageinfos().clear();
				getPageinfos().addAll((Collection<? extends PageInfo>)newValue);
				return;
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends Composite>)newValue);
				return;
			case ControlsPackage.CONTROL_GROUP__NAME:
				setName((String)newValue);
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
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				getPageinfos().clear();
				return;
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
				getComposites().clear();
				return;
			case ControlsPackage.CONTROL_GROUP__NAME:
				setName(NAME_EDEFAULT);
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
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				return pageinfos != null && !pageinfos.isEmpty();
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case ControlsPackage.CONTROL_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ControlGroupImpl
