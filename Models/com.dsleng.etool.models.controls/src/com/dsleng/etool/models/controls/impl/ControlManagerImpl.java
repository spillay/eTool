/**
 */
package com.dsleng.etool.models.controls.impl;

import com.dsleng.etool.models.controls.Composite;
import com.dsleng.etool.models.controls.Control;
import com.dsleng.etool.models.controls.ControlManager;
import com.dsleng.etool.models.controls.ControlsPackage;
import com.dsleng.etool.models.controls.PageInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlManagerImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlManagerImpl#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlManagerImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlManagerImpl extends MinimalEObjectImpl.Container implements ControlManager {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getPageinfos() <em>Pageinfos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageinfos()
	 * @generated
	 * @ordered
	 */
	protected EList<PageInfo> pageinfos;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> composites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.CONTROL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, ControlsPackage.CONTROL_MANAGER__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageInfo> getPageinfos() {
		if (pageinfos == null) {
			pageinfos = new EObjectContainmentEList<PageInfo>(PageInfo.class, this, ControlsPackage.CONTROL_MANAGER__PAGEINFOS);
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
			composites = new EObjectContainmentEList<Composite>(Composite.class, this, ControlsPackage.CONTROL_MANAGER__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlsPackage.CONTROL_MANAGER__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case ControlsPackage.CONTROL_MANAGER__PAGEINFOS:
				return ((InternalEList<?>)getPageinfos()).basicRemove(otherEnd, msgs);
			case ControlsPackage.CONTROL_MANAGER__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
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
			case ControlsPackage.CONTROL_MANAGER__CONTROLS:
				return getControls();
			case ControlsPackage.CONTROL_MANAGER__PAGEINFOS:
				return getPageinfos();
			case ControlsPackage.CONTROL_MANAGER__COMPOSITES:
				return getComposites();
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
			case ControlsPackage.CONTROL_MANAGER__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case ControlsPackage.CONTROL_MANAGER__PAGEINFOS:
				getPageinfos().clear();
				getPageinfos().addAll((Collection<? extends PageInfo>)newValue);
				return;
			case ControlsPackage.CONTROL_MANAGER__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends Composite>)newValue);
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
			case ControlsPackage.CONTROL_MANAGER__CONTROLS:
				getControls().clear();
				return;
			case ControlsPackage.CONTROL_MANAGER__PAGEINFOS:
				getPageinfos().clear();
				return;
			case ControlsPackage.CONTROL_MANAGER__COMPOSITES:
				getComposites().clear();
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
			case ControlsPackage.CONTROL_MANAGER__CONTROLS:
				return controls != null && !controls.isEmpty();
			case ControlsPackage.CONTROL_MANAGER__PAGEINFOS:
				return pageinfos != null && !pageinfos.isEmpty();
			case ControlsPackage.CONTROL_MANAGER__COMPOSITES:
				return composites != null && !composites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlManagerImpl
