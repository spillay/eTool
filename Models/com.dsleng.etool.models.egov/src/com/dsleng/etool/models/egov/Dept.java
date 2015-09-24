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

} // Dept