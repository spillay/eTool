/**
 */
package com.dsleng.etool.models.bobjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BO Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.bobjs.BOEnum#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBOEnum()
 * @model
 * @generated
 */
public interface BOEnum extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link com.dsleng.etool.models.bobjs.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getBOEnum_Literal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getLiteral();

} // BOEnum
