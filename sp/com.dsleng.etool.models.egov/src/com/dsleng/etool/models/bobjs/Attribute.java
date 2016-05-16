/**
 */
package com.dsleng.etool.models.bobjs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#getLabel <em>Label</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#isDataManagement <em>Data Management</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Attribute#getSpType <em>Sp Type</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.models.bobjs.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @see #setType(DataTypes)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Management</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Management</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Management</em>' attribute.
	 * @see #setDataManagement(boolean)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_DataManagement()
	 * @model default="false"
	 * @generated
	 */
	boolean isDataManagement();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#isDataManagement <em>Data Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Management</em>' attribute.
	 * @see #isDataManagement()
	 * @generated
	 */
	void setDataManagement(boolean value);

	/**
	 * Returns the value of the '<em><b>Sp Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sp Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sp Type</em>' reference.
	 * @see #setSpType(BusinessType)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getAttribute_SpType()
	 * @model
	 * @generated
	 */
	BusinessType getSpType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Attribute#getSpType <em>Sp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp Type</em>' reference.
	 * @see #getSpType()
	 * @generated
	 */
	void setSpType(BusinessType value);

} // Attribute
