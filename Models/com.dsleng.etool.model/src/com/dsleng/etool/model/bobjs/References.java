/**
 */
package com.dsleng.etool.model.bobjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.model.bobjs.References#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.References#getInclusion <em>Inclusion</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.References#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends EObject {
	/**
	 * Returns the value of the '<em><b>Businessobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessobject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobject</em>' reference.
	 * @see #setBusinessobject(BusinessObject)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getReferences_Businessobject()
	 * @model
	 * @generated
	 */
	BusinessObject getBusinessobject();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.References#getBusinessobject <em>Businessobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Businessobject</em>' reference.
	 * @see #getBusinessobject()
	 * @generated
	 */
	void setBusinessobject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Inclusion</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.model.bobjs.Inclusions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion</em>' attribute.
	 * @see com.dsleng.etool.model.bobjs.Inclusions
	 * @see #setInclusion(Inclusions)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getReferences_Inclusion()
	 * @model
	 * @generated
	 */
	Inclusions getInclusion();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.References#getInclusion <em>Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion</em>' attribute.
	 * @see com.dsleng.etool.model.bobjs.Inclusions
	 * @see #getInclusion()
	 * @generated
	 */
	void setInclusion(Inclusions value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.model.bobjs.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see com.dsleng.etool.model.bobjs.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getReferences_Multiplicity()
	 * @model
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.model.bobjs.References#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see com.dsleng.etool.model.bobjs.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // References
