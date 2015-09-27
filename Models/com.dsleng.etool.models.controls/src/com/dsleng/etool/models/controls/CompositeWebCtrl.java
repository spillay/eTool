/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Web Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.CompositeWebCtrl#getWcontrols <em>Wcontrols</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.controls.ControlsPackage#getCompositeWebCtrl()
 * @model
 * @generated
 */
public interface CompositeWebCtrl extends Composite {
	/**
	 * Returns the value of the '<em><b>Wcontrols</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.controls.WControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcontrols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcontrols</em>' reference list.
	 * @see com.dsleng.etool.models.controls.ControlsPackage#getCompositeWebCtrl_Wcontrols()
	 * @model
	 * @generated
	 */
	EList<WControl> getWcontrols();

} // CompositeWebCtrl
