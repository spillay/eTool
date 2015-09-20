/**
 */
package com.dsleng.etool.models.egov;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.Attribute#getLabel <em>Label</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getAttribute()
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Attribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.models.egov.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.dsleng.etool.models.egov.DataTypes
	 * @see #setType(DataTypes)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.dsleng.etool.models.egov.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

} // Attribute
