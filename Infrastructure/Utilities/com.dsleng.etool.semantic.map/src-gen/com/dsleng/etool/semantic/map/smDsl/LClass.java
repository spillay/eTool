/**
 */
package com.dsleng.etool.semantic.map.smDsl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.LClass#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.LClass#getValue <em>Value</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.LClass#getEcoreTypes <em>Ecore Types</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.LClass#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getLClass()
 * @model
 * @generated
 */
public interface LClass extends Mappings
{
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
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getLClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getLClass_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Ecore Types</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore Types</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore Types</em>' reference.
   * @see #setEcoreTypes(Import)
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getLClass_EcoreTypes()
   * @model
   * @generated
   */
  Import getEcoreTypes();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getEcoreTypes <em>Ecore Types</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore Types</em>' reference.
   * @see #getEcoreTypes()
   * @generated
   */
  void setEcoreTypes(Import value);

  /**
   * Returns the value of the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' reference.
   * @see #setObj(EClass)
   * @see com.dsleng.etool.semantic.map.smDsl.SmDslPackage#getLClass_Obj()
   * @model
   * @generated
   */
  EClass getObj();

  /**
   * Sets the value of the '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getObj <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' reference.
   * @see #getObj()
   * @generated
   */
  void setObj(EClass value);

} // LClass
