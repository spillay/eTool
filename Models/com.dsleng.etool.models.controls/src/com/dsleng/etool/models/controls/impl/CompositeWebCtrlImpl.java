/**
 */
package com.dsleng.etool.models.controls.impl;

import com.dsleng.etool.models.controls.CompositeWebCtrl;
import com.dsleng.etool.models.controls.ControlsPackage;
import com.dsleng.etool.models.controls.WControl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Web Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.impl.CompositeWebCtrlImpl#getWcontrols <em>Wcontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeWebCtrlImpl extends CompositeImpl implements CompositeWebCtrl {
	/**
	 * The cached value of the '{@link #getWcontrols() <em>Wcontrols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcontrols()
	 * @generated
	 * @ordered
	 */
	protected EList<WControl> wcontrols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeWebCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.COMPOSITE_WEB_CTRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WControl> getWcontrols() {
		if (wcontrols == null) {
			wcontrols = new EObjectResolvingEList<WControl>(WControl.class, this, ControlsPackage.COMPOSITE_WEB_CTRL__WCONTROLS);
		}
		return wcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.COMPOSITE_WEB_CTRL__WCONTROLS:
				return getWcontrols();
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
			case ControlsPackage.COMPOSITE_WEB_CTRL__WCONTROLS:
				getWcontrols().clear();
				getWcontrols().addAll((Collection<? extends WControl>)newValue);
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
			case ControlsPackage.COMPOSITE_WEB_CTRL__WCONTROLS:
				getWcontrols().clear();
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
			case ControlsPackage.COMPOSITE_WEB_CTRL__WCONTROLS:
				return wcontrols != null && !wcontrols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeWebCtrlImpl
