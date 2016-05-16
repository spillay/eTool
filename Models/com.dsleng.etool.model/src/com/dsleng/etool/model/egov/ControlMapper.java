/**
 */
package com.dsleng.etool.model.egov;

import com.dsleng.etool.model.bobjs.Attribute;

import com.dsleng.etool.model.controls.Options;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.egov.ControlMapper#getOption <em>Option</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.ControlMapper#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.dsleng.etool.model.egov.ControlMapper#getMappedTo <em>Mapped To</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.egov.EgovPackage#getControlMapper()
 * @model
 * @generated
 */
public interface ControlMapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Options)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getControlMapper_Option()
	 * @model
	 * @generated
	 */
	Options getOption();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.ControlMapper#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Options value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getControlMapper_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.ControlMapper#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Mapped To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped To</em>' attribute.
	 * @see #setMappedTo(String)
	 * @see com.dsleng.etool.model.egov.EgovPackage#getControlMapper_MappedTo()
	 * @model
	 * @generated
	 */
	String getMappedTo();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.egov.ControlMapper#getMappedTo <em>Mapped To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped To</em>' attribute.
	 * @see #getMappedTo()
	 * @generated
	 */
	void setMappedTo(String value);

} // ControlMapper
