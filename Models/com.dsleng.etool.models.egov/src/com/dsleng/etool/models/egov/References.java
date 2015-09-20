/**
 */
package com.dsleng.etool.models.egov;

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
 *   <li>{@link com.dsleng.etool.models.egov.References#getBusinessobject <em>Businessobject</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.References#getInclusion <em>Inclusion</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.References#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getReferences()
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
	 * @see com.dsleng.etool.models.egov.EgovPackage#getReferences_Businessobject()
	 * @model
	 * @generated
	 */
	BusinessObject getBusinessobject();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.References#getBusinessobject <em>Businessobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Businessobject</em>' reference.
	 * @see #getBusinessobject()
	 * @generated
	 */
	void setBusinessobject(BusinessObject value);

	/**
	 * Returns the value of the '<em><b>Inclusion</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.models.egov.Inclusions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion</em>' attribute.
	 * @see com.dsleng.etool.models.egov.Inclusions
	 * @see #setInclusion(Inclusions)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getReferences_Inclusion()
	 * @model
	 * @generated
	 */
	Inclusions getInclusion();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.References#getInclusion <em>Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion</em>' attribute.
	 * @see com.dsleng.etool.models.egov.Inclusions
	 * @see #getInclusion()
	 * @generated
	 */
	void setInclusion(Inclusions value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.dsleng.etool.models.egov.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see com.dsleng.etool.models.egov.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see com.dsleng.etool.models.egov.EgovPackage#getReferences_Multiplicity()
	 * @model
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.models.egov.References#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see com.dsleng.etool.models.egov.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // References
