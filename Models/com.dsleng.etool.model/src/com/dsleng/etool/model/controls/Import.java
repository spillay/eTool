/**
 */
package com.dsleng.etool.model.controls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.controls.Import#getImportCtlPlugin <em>Import Ctl Plugin</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.controls.ControlsPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Import Ctl Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Ctl Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Ctl Plugin</em>' attribute.
	 * @see #setImportCtlPlugin(String)
	 * @see com.dsleng.etool.model.controls.ControlsPackage#getImport_ImportCtlPlugin()
	 * @model
	 * @generated
	 */
	String getImportCtlPlugin();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.controls.Import#getImportCtlPlugin <em>Import Ctl Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Ctl Plugin</em>' attribute.
	 * @see #getImportCtlPlugin()
	 * @generated
	 */
	void setImportCtlPlugin(String value);

} // Import
