/**
 */
package com.dsleng.etool.models.controls.impl;

import com.dsleng.etool.models.controls.Composite;
import com.dsleng.etool.models.controls.Control;
import com.dsleng.etool.models.controls.ControlGroup;
import com.dsleng.etool.models.controls.ControlsPackage;
import com.dsleng.etool.models.controls.PageInfo;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlGroupImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlGroupImpl#getPageinfos <em>Pageinfos</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.ControlGroupImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlGroupImpl extends MinimalEObjectImpl.Container implements ControlGroup {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

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
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectResolvingEList<Control>(Control.class, this, ControlsPackage.CONTROL_GROUP__CONTROLS);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.CONTROL_GROUP__CONTROLS:
				return getControls();
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				return getPageinfos();
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
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
			case ControlsPackage.CONTROL_GROUP__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				getPageinfos().clear();
				getPageinfos().addAll((Collection<? extends PageInfo>)newValue);
				return;
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
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
			case ControlsPackage.CONTROL_GROUP__CONTROLS:
				getControls().clear();
				return;
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				getPageinfos().clear();
				return;
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
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
			case ControlsPackage.CONTROL_GROUP__CONTROLS:
				return controls != null && !controls.isEmpty();
			case ControlsPackage.CONTROL_GROUP__PAGEINFOS:
				return pageinfos != null && !pageinfos.isEmpty();
			case ControlsPackage.CONTROL_GROUP__COMPOSITES:
				return composites != null && !composites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlGroupImpl
