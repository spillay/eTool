/**
 */
package com.dsleng.etool.semantic.map.smDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.semantic.map.smDsl.SmDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsleng.com/etool/semantic/map/SMDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmDslPackage eINSTANCE = com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl <em>Semantic Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getSemanticMapping()
   * @generated
   */
  int SEMANTIC_MAPPING = 0;

  /**
   * The feature id for the '<em><b>Ename</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_MAPPING__ENAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_MAPPING__NAME = 1;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_MAPPING__MAPPING = 2;

  /**
   * The feature id for the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_MAPPING__EL = 3;

  /**
   * The number of structural features of the '<em>Semantic Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMANTIC_MAPPING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.MappingsImpl <em>Mappings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsleng.etool.semantic.map.smDsl.impl.MappingsImpl
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getMappings()
   * @generated
   */
  int MAPPINGS = 1;

  /**
   * The number of structural features of the '<em>Mappings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPINGS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsleng.etool.semantic.map.smDsl.impl.ImportImpl
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl <em>LClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getLClass()
   * @generated
   */
  int LCLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCLASS__NAME = MAPPINGS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCLASS__VALUE = MAPPINGS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ecore Types</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCLASS__ECORE_TYPES = MAPPINGS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCLASS__OBJ = MAPPINGS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>LClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCLASS_FEATURE_COUNT = MAPPINGS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsleng.etool.semantic.map.smDsl.impl.ElementImpl
   * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__REF = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping <em>Semantic Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semantic Mapping</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.SemanticMapping
   * @generated
   */
  EClass getSemanticMapping();

  /**
   * Returns the meta object for the containment reference '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEname <em>Ename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ename</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEname()
   * @see #getSemanticMapping()
   * @generated
   */
  EReference getSemanticMapping_Ename();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getName()
   * @see #getSemanticMapping()
   * @generated
   */
  EAttribute getSemanticMapping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getMapping()
   * @see #getSemanticMapping()
   * @generated
   */
  EReference getSemanticMapping_Mapping();

  /**
   * Returns the meta object for the containment reference '{@link com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEl <em>El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.SemanticMapping#getEl()
   * @see #getSemanticMapping()
   * @generated
   */
  EReference getSemanticMapping_El();

  /**
   * Returns the meta object for class '{@link com.dsleng.etool.semantic.map.smDsl.Mappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mappings</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Mappings
   * @generated
   */
  EClass getMappings();

  /**
   * Returns the meta object for class '{@link com.dsleng.etool.semantic.map.smDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for class '{@link com.dsleng.etool.semantic.map.smDsl.LClass <em>LClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LClass</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.LClass
   * @generated
   */
  EClass getLClass();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.LClass#getName()
   * @see #getLClass()
   * @generated
   */
  EAttribute getLClass_Name();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.LClass#getValue()
   * @see #getLClass()
   * @generated
   */
  EAttribute getLClass_Value();

  /**
   * Returns the meta object for the reference '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getEcoreTypes <em>Ecore Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ecore Types</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.LClass#getEcoreTypes()
   * @see #getLClass()
   * @generated
   */
  EReference getLClass_EcoreTypes();

  /**
   * Returns the meta object for the reference '{@link com.dsleng.etool.semantic.map.smDsl.LClass#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.LClass#getObj()
   * @see #getLClass()
   * @generated
   */
  EReference getLClass_Obj();

  /**
   * Returns the meta object for class '{@link com.dsleng.etool.semantic.map.smDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link com.dsleng.etool.semantic.map.smDsl.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the reference '{@link com.dsleng.etool.semantic.map.smDsl.Element#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.dsleng.etool.semantic.map.smDsl.Element#getRef()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmDslFactory getSmDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl <em>Semantic Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getSemanticMapping()
     * @generated
     */
    EClass SEMANTIC_MAPPING = eINSTANCE.getSemanticMapping();

    /**
     * The meta object literal for the '<em><b>Ename</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMANTIC_MAPPING__ENAME = eINSTANCE.getSemanticMapping_Ename();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMANTIC_MAPPING__NAME = eINSTANCE.getSemanticMapping_Name();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMANTIC_MAPPING__MAPPING = eINSTANCE.getSemanticMapping_Mapping();

    /**
     * The meta object literal for the '<em><b>El</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMANTIC_MAPPING__EL = eINSTANCE.getSemanticMapping_El();

    /**
     * The meta object literal for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.MappingsImpl <em>Mappings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsleng.etool.semantic.map.smDsl.impl.MappingsImpl
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getMappings()
     * @generated
     */
    EClass MAPPINGS = eINSTANCE.getMappings();

    /**
     * The meta object literal for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsleng.etool.semantic.map.smDsl.impl.ImportImpl
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl <em>LClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getLClass()
     * @generated
     */
    EClass LCLASS = eINSTANCE.getLClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LCLASS__NAME = eINSTANCE.getLClass_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LCLASS__VALUE = eINSTANCE.getLClass_Value();

    /**
     * The meta object literal for the '<em><b>Ecore Types</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCLASS__ECORE_TYPES = eINSTANCE.getLClass_EcoreTypes();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCLASS__OBJ = eINSTANCE.getLClass_Obj();

    /**
     * The meta object literal for the '{@link com.dsleng.etool.semantic.map.smDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsleng.etool.semantic.map.smDsl.impl.ElementImpl
     * @see com.dsleng.etool.semantic.map.smDsl.impl.SmDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__REF = eINSTANCE.getElement_Ref();

  }

} //SmDslPackage
