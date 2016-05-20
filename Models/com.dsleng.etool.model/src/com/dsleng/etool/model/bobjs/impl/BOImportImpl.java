/**
 */
package com.dsleng.etool.model.bobjs.impl;

import com.dsleng.etool.model.bobjs.BOImport;
import com.dsleng.etool.model.bobjs.BobjsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BO Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.BOImportImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.BOImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.BOImportImpl#getImportPlugin <em>Import Plugin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOImportImpl extends MinimalEObjectImpl.Container implements BOImport {
	/**
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportPlugin() <em>Import Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_PLUGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportPlugin() <em>Import Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportPlugin()
	 * @generated
	 * @ordered
	 */
	protected String importPlugin = IMPORT_PLUGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.BO_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI() {
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI) {
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.BO_IMPORT__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedNamespace() {
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedNamespace(String newImportedNamespace) {
		String oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.BO_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportPlugin() {
		return importPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportPlugin(String newImportPlugin) {
		String oldImportPlugin = importPlugin;
		importPlugin = newImportPlugin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.BO_IMPORT__IMPORT_PLUGIN, oldImportPlugin, importPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.BO_IMPORT__IMPORT_URI:
				return getImportURI();
			case BobjsPackage.BO_IMPORT__IMPORTED_NAMESPACE:
				return getImportedNamespace();
			case BobjsPackage.BO_IMPORT__IMPORT_PLUGIN:
				return getImportPlugin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BobjsPackage.BO_IMPORT__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case BobjsPackage.BO_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((String)newValue);
				return;
			case BobjsPackage.BO_IMPORT__IMPORT_PLUGIN:
				setImportPlugin((String)newValue);
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
			case BobjsPackage.BO_IMPORT__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case BobjsPackage.BO_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
				return;
			case BobjsPackage.BO_IMPORT__IMPORT_PLUGIN:
				setImportPlugin(IMPORT_PLUGIN_EDEFAULT);
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
			case BobjsPackage.BO_IMPORT__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case BobjsPackage.BO_IMPORT__IMPORTED_NAMESPACE:
				return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
			case BobjsPackage.BO_IMPORT__IMPORT_PLUGIN:
				return IMPORT_PLUGIN_EDEFAULT == null ? importPlugin != null : !IMPORT_PLUGIN_EDEFAULT.equals(importPlugin);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (importURI: ");
		result.append(importURI);
		result.append(", importedNamespace: ");
		result.append(importedNamespace);
		result.append(", importPlugin: ");
		result.append(importPlugin);
		result.append(')');
		return result.toString();
	}

} //BOImportImpl
