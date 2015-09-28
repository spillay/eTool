/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getEservices <em>Eservices</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getLangFile <em>Lang File</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getVersion <em>Version</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Dept#getWebDirectory <em>Web Directory</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getDept()
 * @model
 * @generated
 */
public interface Dept extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Eservices</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.EService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eservices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eservices</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_Eservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<EService> getEservices();

	/**
	 * Returns the value of the '<em><b>Businessobjects</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessobjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobjects</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_Businessobjects()
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_ArtifactId()
	 * @model required="true"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getArtifactId <em>Artifact Id</em>}' attribute.
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_GroupId()
	 * @model required="true"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getGroupId <em>Group Id</em>}' attribute.
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_LangFile()
	 * @model required="true"
	 * @generated
	 */
	String getLangFile();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getLangFile <em>Lang File</em>}' attribute.
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getVersion <em>Version</em>}' attribute.
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_DirLocation()
	 * @model required="true"
	 * @generated
	 */
	String getDirLocation();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getDirLocation <em>Dir Location</em>}' attribute.
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getDept_WebDirectory()
	 * @model
	 * @generated
	 */
	String getWebDirectory();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Dept#getWebDirectory <em>Web Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Directory</em>' attribute.
	 * @see #getWebDirectory()
	 * @generated
	 */
	void setWebDirectory(String value);

} // Dept
