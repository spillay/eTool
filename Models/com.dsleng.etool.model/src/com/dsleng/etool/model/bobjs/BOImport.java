/**
 */
package com.dsleng.etool.model.bobjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.BOImport#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BOImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BOImport#getImportPlugin <em>Import Plugin</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBOImport()
 * @model
 * @generated
 */
public interface BOImport extends EObject {
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
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBOImport_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.BOImport#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBOImport_ImportedNamespace()
	 * @model
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.BOImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Import Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Plugin</em>' attribute.
	 * @see #setImportPlugin(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBOImport_ImportPlugin()
	 * @model
	 * @generated
	 */
	String getImportPlugin();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.BOImport#getImportPlugin <em>Import Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Plugin</em>' attribute.
	 * @see #getImportPlugin()
	 * @generated
	 */
	void setImportPlugin(String value);

} // BOImport
