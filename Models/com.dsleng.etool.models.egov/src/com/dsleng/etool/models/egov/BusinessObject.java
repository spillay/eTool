/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.BusinessObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dsleng.etool.models.egov.BusinessObject#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getBusinessObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.References}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getBusinessObject_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<References> getReferences();

} // BusinessObject
