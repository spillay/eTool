/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.BusinessObject;
import com.dsleng.etool.models.egov.Dept;
import com.dsleng.etool.models.egov.EService;
import com.dsleng.etool.models.egov.EgovPackage;

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
 * An implementation of the model object '<em><b>Dept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getEservices <em>Eservices</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getLangFile <em>Lang File</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.impl.DeptImpl#getDirLocation <em>Dir Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeptImpl extends NamedElementImpl implements Dept {
	/**
	 * The cached value of the '{@link #getEservices() <em>Eservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEservices()
	 * @generated
	 * @ordered
	 */
	protected EList<EService> eservices;

	/**
	 * The cached value of the '{@link #getBusinessobjects() <em>Businessobjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObject> businessobjects;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgovPackage.Literals.DEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EService> getEservices() {
		if (eservices == null) {
			eservices = new EObjectContainmentEList<EService>(EService.class, this, EgovPackage.DEPT__ESERVICES);
		}
		return eservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObject> getBusinessobjects() {
		if (businessobjects == null) {
			businessobjects = new EObjectContainmentEList<BusinessObject>(BusinessObject.class, this, EgovPackage.DEPT__BUSINESSOBJECTS);
		}
		return businessobjects;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.DEPT__ARTIFACT_ID, oldArtifactId, artifactId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.DEPT__GROUP_ID, oldGroupId, groupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.DEPT__LANG_FILE, oldLangFile, langFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.DEPT__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EgovPackage.DEPT__DIR_LOCATION, oldDirLocation, dirLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EgovPackage.DEPT__ESERVICES:
				return ((InternalEList<?>)getEservices()).basicRemove(otherEnd, msgs);
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return ((InternalEList<?>)getBusinessobjects()).basicRemove(otherEnd, msgs);
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
			case EgovPackage.DEPT__ESERVICES:
				return getEservices();
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return getBusinessobjects();
			case EgovPackage.DEPT__ARTIFACT_ID:
				return getArtifactId();
			case EgovPackage.DEPT__GROUP_ID:
				return getGroupId();
			case EgovPackage.DEPT__LANG_FILE:
				return getLangFile();
			case EgovPackage.DEPT__VERSION:
				return getVersion();
			case EgovPackage.DEPT__DIR_LOCATION:
				return getDirLocation();
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
			case EgovPackage.DEPT__ESERVICES:
				getEservices().clear();
				getEservices().addAll((Collection<? extends EService>)newValue);
				return;
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				getBusinessobjects().clear();
				getBusinessobjects().addAll((Collection<? extends BusinessObject>)newValue);
				return;
			case EgovPackage.DEPT__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case EgovPackage.DEPT__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case EgovPackage.DEPT__LANG_FILE:
				setLangFile((String)newValue);
				return;
			case EgovPackage.DEPT__VERSION:
				setVersion((String)newValue);
				return;
			case EgovPackage.DEPT__DIR_LOCATION:
				setDirLocation((String)newValue);
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
			case EgovPackage.DEPT__ESERVICES:
				getEservices().clear();
				return;
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				getBusinessobjects().clear();
				return;
			case EgovPackage.DEPT__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case EgovPackage.DEPT__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case EgovPackage.DEPT__LANG_FILE:
				setLangFile(LANG_FILE_EDEFAULT);
				return;
			case EgovPackage.DEPT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EgovPackage.DEPT__DIR_LOCATION:
				setDirLocation(DIR_LOCATION_EDEFAULT);
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
			case EgovPackage.DEPT__ESERVICES:
				return eservices != null && !eservices.isEmpty();
			case EgovPackage.DEPT__BUSINESSOBJECTS:
				return businessobjects != null && !businessobjects.isEmpty();
			case EgovPackage.DEPT__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case EgovPackage.DEPT__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case EgovPackage.DEPT__LANG_FILE:
				return LANG_FILE_EDEFAULT == null ? langFile != null : !LANG_FILE_EDEFAULT.equals(langFile);
			case EgovPackage.DEPT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EgovPackage.DEPT__DIR_LOCATION:
				return DIR_LOCATION_EDEFAULT == null ? dirLocation != null : !DIR_LOCATION_EDEFAULT.equals(dirLocation);
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
		result.append(')');
		return result.toString();
	}

} //DeptImpl
