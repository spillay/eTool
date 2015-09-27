/**
 */
package com.dsleng.etool.models.controls.impl;

import com.dsleng.etool.models.controls.CompositeMobCtrl;
import com.dsleng.etool.models.controls.ControlsPackage;
import com.dsleng.etool.models.controls.MControl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Mob Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.impl.CompositeMobCtrlImpl#getMcontrols <em>Mcontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeMobCtrlImpl extends CompositeImpl implements CompositeMobCtrl {
	/**
	 * The cached value of the '{@link #getMcontrols() <em>Mcontrols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcontrols()
	 * @generated
	 * @ordered
	 */
	protected EList<MControl> mcontrols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMobCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.COMPOSITE_MOB_CTRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MControl> getMcontrols() {
		if (mcontrols == null) {
			mcontrols = new EObjectResolvingEList<MControl>(MControl.class, this, ControlsPackage.COMPOSITE_MOB_CTRL__MCONTROLS);
		}
		return mcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.COMPOSITE_MOB_CTRL__MCONTROLS:
				return getMcontrols();
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
			case ControlsPackage.COMPOSITE_MOB_CTRL__MCONTROLS:
				getMcontrols().clear();
				getMcontrols().addAll((Collection<? extends MControl>)newValue);
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
			case ControlsPackage.COMPOSITE_MOB_CTRL__MCONTROLS:
				getMcontrols().clear();
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
			case ControlsPackage.COMPOSITE_MOB_CTRL__MCONTROLS:
				return mcontrols != null && !mcontrols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeMobCtrlImpl
