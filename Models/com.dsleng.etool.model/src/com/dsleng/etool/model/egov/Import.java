/**
 */
package com.dsleng.etool.model.egov;

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
 *   <li>{@link com.dsleng.etool.model.egov.Import#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.Import#getImportBOBPlugin <em>Import BOB Plugin</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.Import#getImportCtlPlugin <em>Import Ctl Plugin</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.egov.EgovPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getImport_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Import#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Import BOB Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import BOB Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import BOB Plugin</em>' attribute.
	 * @see #setImportBOBPlugin(String)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getImport_ImportBOBPlugin()
	 * @model
	 * @generated
	 */
	String getImportBOBPlugin();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Import#getImportBOBPlugin <em>Import BOB Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import BOB Plugin</em>' attribute.
	 * @see #getImportBOBPlugin()
	 * @generated
	 */
	void setImportBOBPlugin(String value);

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
	 * @see com.dsleng.etool.model.egov.EgovPackage#getImport_ImportCtlPlugin()
	 * @model
	 * @generated
	 */
	String getImportCtlPlugin();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.Import#getImportCtlPlugin <em>Import Ctl Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Ctl Plugin</em>' attribute.
	 * @see #getImportCtlPlugin()
	 * @generated
	 */
	void setImportCtlPlugin(String value);

} // Import
