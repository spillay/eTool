/**
 */
package com.dsleng.etool.model.bobjs;

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
 *   <li>{@link com.dsleng.etool.model.bobjs.BusinessObject#getReferences <em>References</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BusinessObject#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BusinessObject#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BusinessObject#getBasedon <em>Basedon</em>}</li>
 *   <li>{@link com.dsleng.etool.model.bobjs.BusinessObject#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends BusinessType {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.References}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<References> getReferences();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BusinessObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<BusinessObject> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<com.dsleng.etool.model.bobjs.Enum> getEnums();

	/**
	 * Returns the value of the '<em><b>Basedon</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.BasedOn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basedon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basedon</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject_Basedon()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasedOn> getBasedon();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.model.bobjs.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.dsleng.etool.model.bobjs.BobjsPackage#getBusinessObject_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // BusinessObject
