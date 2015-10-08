/**
 */
package com.dsleng.etool.models.bobjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Operation#getType <em>Type</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Operation#getOpparameters <em>Opparameters</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Operation#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link com.dsleng.etool.models.bobjs.Operation#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation_Type()
	 * @model
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.dsleng.etool.models.bobjs.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Opparameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.OpParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opparameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opparameters</em>' containment reference list.
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation_Opparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpParameter> getOpparameters();

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' attribute.
	 * @see #setSyntax(String)
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation_Syntax()
	 * @model
	 * @generated
	 */
	String getSyntax();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.bobjs.Operation#getSyntax <em>Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' attribute.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getOperation_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // Operation
