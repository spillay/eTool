/**
 */
package com.dsleng.etool.model.controls.impl;

import com.dsleng.etool.model.controls.ControlsPackage;
import com.dsleng.etool.model.controls.Import;

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
 *   <li>{@link com.dsleng.etool.model.controls.impl.ImportImpl#getImportCtlPlugin <em>Import Ctl Plugin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
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
		return ControlsPackage.Literals.IMPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlsPackage.IMPORT__IMPORT_CTL_PLUGIN, oldImportCtlPlugin, importCtlPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.IMPORT__IMPORT_CTL_PLUGIN:
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
			case ControlsPackage.IMPORT__IMPORT_CTL_PLUGIN:
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
			case ControlsPackage.IMPORT__IMPORT_CTL_PLUGIN:
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
			case ControlsPackage.IMPORT__IMPORT_CTL_PLUGIN:
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
		result.append(" (importCtlPlugin: ");
		result.append(importCtlPlugin);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
