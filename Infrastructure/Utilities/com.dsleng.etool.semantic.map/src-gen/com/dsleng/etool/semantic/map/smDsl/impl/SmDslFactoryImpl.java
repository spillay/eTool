/**
 */
package com.dsleng.etool.semantic.map.smDsl.impl;

import com.dsleng.etool.semantic.map.smDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmDslFactoryImpl extends EFactoryImpl implements SmDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmDslFactory init()
  {
    try
    {
      SmDslFactory theSmDslFactory = (SmDslFactory)EPackage.Registry.INSTANCE.getEFactory(SmDslPackage.eNS_URI);
      if (theSmDslFactory != null)
      {
        return theSmDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmDslPackage.SEMANTIC_MAPPING: return createSemanticMapping();
      case SmDslPackage.MAPPINGS: return createMappings();
      case SmDslPackage.IMPORT: return createImport();
      case SmDslPackage.LCLASS: return createLClass();
      case SmDslPackage.ELEMENT: return createElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemanticMapping createSemanticMapping()
  {
    SemanticMappingImpl semanticMapping = new SemanticMappingImpl();
    return semanticMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappings createMappings()
  {
    MappingsImpl mappings = new MappingsImpl();
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LClass createLClass()
  {
    LClassImpl lClass = new LClassImpl();
    return lClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmDslPackage getSmDslPackage()
  {
    return (SmDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmDslPackage getPackage()
  {
    return SmDslPackage.eINSTANCE;
  }

} //SmDslFactoryImpl
