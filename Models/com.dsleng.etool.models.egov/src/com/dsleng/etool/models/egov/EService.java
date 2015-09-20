/**
 */
package com.dsleng.etool.models.egov;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.egov.EService#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.egov.EgovPackage#getEService()
 * @model
 * @generated
 */
public interface EService extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.egov.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see com.dsleng.etool.models.egov.EgovPackage#getEService_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();
} // EService
