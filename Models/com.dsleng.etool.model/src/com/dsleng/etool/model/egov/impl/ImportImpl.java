/**
 */
package com.dsleng.etool.model.egov.impl;

import com.dsleng.etool.model.egov.EgovPackage;
import com.dsleng.etool.model.egov.Import;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ImportImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ImportImpl#getImportBOBPlugin <em>Import BOB Plugin</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.impl.ImportImpl#getImportCtlPlugin <em>Import Ctl Plugin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
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
	 * The default value of the '{@link #getImportBOBPlugin() <em>Import BOB Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportBOBPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_BOB_PLUGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportBOBPlugin() <em>Import BOB Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportBOBPlugin()
	 * @generated
	 * @ordered
	 */
	protected String importBOBPlugin = IMPORT_BOB_PLUGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportCtlPlugin() <em>Import Ctl Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportCtlPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_CTL_PLUGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportCtlPlugin() <em>Import Ctl Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportCtlPlugin()
	 * @generated
	 * @ordered
	 */
	protected String importCtlPlugin = IMPORT_CTL_PLUGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.IMPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.IMPORT__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportBOBPlugin() {
		return importBOBPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportBOBPlugin(String newImportBOBPlugin) {
		String oldImportBOBPlugin = importBOBPlugin;
		importBOBPlugin = newImportBOBPlugin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.IMPORT__IMPORT_BOB_PLUGIN, oldImportBOBPlugin, importBOBPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportCtlPlugin() {
		return importCtlPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportCtlPlugin(String newImportCtlPlugin) {
		String oldImportCtlPlugin = importCtlPlugin;
		importCtlPlugin = newImportCtlPlugin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.IMPORT__IMPORT_CTL_PLUGIN, oldImportCtlPlugin, importCtlPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EgovPackage.IMPORT__IMPORT_URI:
				return getImportURI();
			case EgovPackage.IMPORT__IMPORT_BOB_PLUGIN:
				return getImportBOBPlugin();
			case EgovPackage.IMPORT__IMPORT_CTL_PLUGIN:
				return getImportCtlPlugin();
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
			case EgovPackage.IMPORT__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case EgovPackage.IMPORT__IMPORT_BOB_PLUGIN:
				setImportBOBPlugin((String)newValue);
				return;
			case EgovPackage.IMPORT__IMPORT_CTL_PLUGIN:
				setImportCtlPlugin((String)newValue);
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
			case EgovPackage.IMPORT__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case EgovPackage.IMPORT__IMPORT_BOB_PLUGIN:
				setImportBOBPlugin(IMPORT_BOB_PLUGIN_EDEFAULT);
				return;
			case EgovPackage.IMPORT__IMPORT_CTL_PLUGIN:
				setImportCtlPlugin(IMPORT_CTL_PLUGIN_EDEFAULT);
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
			case EgovPackage.IMPORT__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case EgovPackage.IMPORT__IMPORT_BOB_PLUGIN:
				return IMPORT_BOB_PLUGIN_EDEFAULT == null ? importBOBPlugin != null : !IMPORT_BOB_PLUGIN_EDEFAULT.equals(importBOBPlugin);
			case EgovPackage.IMPORT__IMPORT_CTL_PLUGIN:
				return IMPORT_CTL_PLUGIN_EDEFAULT == null ? importCtlPlugin != null : !IMPORT_CTL_PLUGIN_EDEFAULT.equals(importCtlPlugin);
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
		result.append(", importBOBPlugin: ");
		result.append(importBOBPlugin);
		result.append(", importCtlPlugin: ");
		result.append(importCtlPlugin);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
