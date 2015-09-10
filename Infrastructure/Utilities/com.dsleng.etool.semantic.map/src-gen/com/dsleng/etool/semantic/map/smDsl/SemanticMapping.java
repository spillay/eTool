/**
 */
package com.dsleng.etool.semantic.map.smDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEname <em>Ename</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEl <em>El</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getSemanticMapping()
 * @model
 * @generated
 */
public interface SemanticMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Ename</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ename</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ename</em>' containment reference.
   * @see #setEname(Import)
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getSemanticMapping_Ename()
   * @model containment="true"
   * @generated
   */
  Import getEname();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEname <em>Ename</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ename</em>' containment reference.
   * @see #getEname()
   * @generated
   */
  void setEname(Import value);

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
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getSemanticMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
   * The list contents are of type {@link com.dsleng.etool.semantic.map.smDsl.Mappings}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference list.
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getSemanticMapping_Mapping()
   * @model containment="true"
   * @generated
   */
  EList<Mappings> getMapping();

  /**
   * Returns the value of the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' containment reference.
   * @see #setEl(Element)
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getSemanticMapping_El()
   * @model containment="true"
   * @generated
   */
  Element getEl();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEl <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' containment reference.
   * @see #getEl()
   * @generated
   */
  void setEl(Element value);

} // SemanticMapping
