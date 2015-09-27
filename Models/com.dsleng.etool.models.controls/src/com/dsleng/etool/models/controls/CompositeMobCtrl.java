/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Mob Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.CompositeMobCtrl#getMcontrols <em>Mcontrols</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getCompositeMobCtrl()
 * @model
 * @generated
 */
public interface CompositeMobCtrl extends Composite {
	/**
	 * Returns the value of the '<em><b>Mcontrols</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.MControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcontrols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcontrols</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getCompositeMobCtrl_Mcontrols()
	 * @model
	 * @generated
	 */
	EList<MControl> getMcontrols();

} // CompositeMobCtrl
