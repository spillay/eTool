/**
 */
package com.dsleng.etool.model.bobjs.impl;

import com.dsleng.etool.model.bobjs.BobjsPackage;
import com.dsleng.etool.model.bobjs.OrgUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getLangFile <em>Lang File</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getWebDirectory <em>Web Directory</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.impl.OrgUnitImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgUnitImpl extends NamedElementImpl implements OrgUnit {
	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangFile() <em>Lang File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangFile()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangFile() <em>Lang File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangFile()
	 * @generated
	 * @ordered
	 */
	protected String langFile = LANG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected String dirLocation = DIR_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebDirectory() <em>Web Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebDirectory() <em>Web Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebDirectory()
	 * @generated
	 * @ordered
	 */
	protected String webDirectory = WEB_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<com.dsleng.etool.model.bobjs.Package> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BobjsPackage.Literals.ORG_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangFile() {
		return langFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangFile(String newLangFile) {
		String oldLangFile = langFile;
		langFile = newLangFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__LANG_FILE, oldLangFile, langFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirLocation() {
		return dirLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirLocation(String newDirLocation) {
		String oldDirLocation = dirLocation;
		dirLocation = newDirLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__DIR_LOCATION, oldDirLocation, dirLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebDirectory() {
		return webDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebDirectory(String newWebDirectory) {
		String oldWebDirectory = webDirectory;
		webDirectory = newWebDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__WEB_DIRECTORY, oldWebDirectory, webDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BobjsPackage.ORG_UNIT__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.dsleng.etool.model.bobjs.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<com.dsleng.etool.model.bobjs.Package>(com.dsleng.etool.model.bobjs.Package.class, this, BobjsPackage.ORG_UNIT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BobjsPackage.ORG_UNIT__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BobjsPackage.ORG_UNIT__ARTIFACT_ID:
				return getArtifactId();
			case BobjsPackage.ORG_UNIT__GROUP_ID:
				return getGroupId();
			case BobjsPackage.ORG_UNIT__LANG_FILE:
				return getLangFile();
			case BobjsPackage.ORG_UNIT__VERSION:
				return getVersion();
			case BobjsPackage.ORG_UNIT__DIR_LOCATION:
				return getDirLocation();
			case BobjsPackage.ORG_UNIT__WEB_DIRECTORY:
				return getWebDirectory();
			case BobjsPackage.ORG_UNIT__PACKAGE:
				return getPackage();
			case BobjsPackage.ORG_UNIT__PACKAGES:
				return getPackages();
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
			case BobjsPackage.ORG_UNIT__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__LANG_FILE:
				setLangFile((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__VERSION:
				setVersion((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__DIR_LOCATION:
				setDirLocation((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__WEB_DIRECTORY:
				setWebDirectory((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__PACKAGE:
				setPackage((String)newValue);
				return;
			case BobjsPackage.ORG_UNIT__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends com.dsleng.etool.model.bobjs.Package>)newValue);
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
			case BobjsPackage.ORG_UNIT__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__LANG_FILE:
				setLangFile(LANG_FILE_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__DIR_LOCATION:
				setDirLocation(DIR_LOCATION_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__WEB_DIRECTORY:
				setWebDirectory(WEB_DIRECTORY_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case BobjsPackage.ORG_UNIT__PACKAGES:
				getPackages().clear();
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
			case BobjsPackage.ORG_UNIT__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case BobjsPackage.ORG_UNIT__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case BobjsPackage.ORG_UNIT__LANG_FILE:
				return LANG_FILE_EDEFAULT == null ? langFile != null : !LANG_FILE_EDEFAULT.equals(langFile);
			case BobjsPackage.ORG_UNIT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BobjsPackage.ORG_UNIT__DIR_LOCATION:
				return DIR_LOCATION_EDEFAULT == null ? dirLocation != null : !DIR_LOCATION_EDEFAULT.equals(dirLocation);
			case BobjsPackage.ORG_UNIT__WEB_DIRECTORY:
				return WEB_DIRECTORY_EDEFAULT == null ? webDirectory != null : !WEB_DIRECTORY_EDEFAULT.equals(webDirectory);
			case BobjsPackage.ORG_UNIT__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case BobjsPackage.ORG_UNIT__PACKAGES:
				return packages != null && !packages.isEmpty();
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
		result.append(" (artifactId: ");
		result.append(artifactId);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", langFile: ");
		result.append(langFile);
		result.append(", version: ");
		result.append(version);
		result.append(", dirLocation: ");
		result.append(dirLocation);
		result.append(", webDirectory: ");
		result.append(webDirectory);
		result.append(", package: ");
		result.append(package_);
		result.append(')');
		return result.toString();
	}

} //OrgUnitImpl
