/**
 */
package com.dsleng.etool.presentation.view;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.Layout#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayout()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Layout extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.presentation.view.Layers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayout_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layers> getLayers();

} // Layout
