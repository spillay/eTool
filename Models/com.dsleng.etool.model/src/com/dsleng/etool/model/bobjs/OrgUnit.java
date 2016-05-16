/**
 */
package com.dsleng.etool.model.bobjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getLangFile <em>Lang File</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getVersion <em>Version</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getWebDirectory <em>Web Directory</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getBoenums <em>Boenums</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getBoimport <em>Boimport</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.OrgUnit#getBusinesstypes <em>Businesstypes</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit()
 * @model
 * @generated
 */
public interface OrgUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Businessobjects</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessobjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobjects</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Businessobjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessObject> getBusinessobjects();

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Lang File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang File</em>' attribute.
	 * @see #setLangFile(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_LangFile()
	 * @model
	 * @generated
	 */
	String getLangFile();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getLangFile <em>Lang File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang File</em>' attribute.
	 * @see #getLangFile()
	 * @generated
	 */
	void setLangFile(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Dir Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Location</em>' attribute.
	 * @see #setDirLocation(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_DirLocation()
	 * @model
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getDirLocation <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Location</em>' attribute.
	 * @see #getDirLocation()
	 * @generated
	 */
	void setDirLocation(String value);

	/**
	 * Returns the value of the '<em><b>Web Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Directory</em>' attribute.
	 * @see #setWebDirectory(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_WebDirectory()
	 * @model
	 * @generated
	 */
	String getWebDirectory();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getWebDirectory <em>Web Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Directory</em>' attribute.
	 * @see #getWebDirectory()
	 * @generated
	 */
	void setWebDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.OrgUnit#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Boenums</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BOEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boenums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boenums</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Boenums()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOEnum> getBoenums();

	/**
	 * Returns the value of the '<em><b>Boimport</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BOImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boimport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boimport</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Boimport()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOImport> getBoimport();

	/**
	 * Returns the value of the '<em><b>Businesstypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BusinessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businesstypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesstypes</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getOrgUnit_Businesstypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessType> getBusinesstypes();

} // OrgUnit
