/**
 */
package com.dsleng.etool.semantic.map.smDsl.impl;

import com.dsleng.etool.semantic.map.smDsl.Import;
import com.dsleng.etool.semantic.map.smDsl.LClass;
import com.dsleng.etool.semantic.map.smDsl.SmDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl#getEcoreTypes <em>Ecore Types</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.LClassImpl#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LClassImpl extends MappingsImpl implements LClass
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEcoreTypes() <em>Ecore Types</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreTypes()
   * @generated
   * @ordered
   */
  protected Import ecoreTypes;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected EClass obj;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmDslPackage.Literals.LCLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.LCLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.LCLASS__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getEcoreTypes()
  {
    if (ecoreTypes != null && ecoreTypes.eIsProxy())
    {
      InternalEObject oldEcoreTypes = (InternalEObject)ecoreTypes;
      ecoreTypes = (Import)eResolveProxy(oldEcoreTypes);
      if (ecoreTypes != oldEcoreTypes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmDslPackage.LCLASS__ECORE_TYPES, oldEcoreTypes, ecoreTypes));
      }
    }
    return ecoreTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetEcoreTypes()
  {
    return ecoreTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcoreTypes(Import newEcoreTypes)
  {
    Import oldEcoreTypes = ecoreTypes;
    ecoreTypes = newEcoreTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.LCLASS__ECORE_TYPES, oldEcoreTypes, ecoreTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObj()
  {
    if (obj != null && obj.eIsProxy())
    {
      InternalEObject oldObj = (InternalEObject)obj;
      obj = (EClass)eResolveProxy(oldObj);
      if (obj != oldObj)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmDslPackage.LCLASS__OBJ, oldObj, obj));
      }
    }
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(EClass newObj)
  {
    EClass oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.LCLASS__OBJ, oldObj, obj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmDslPackage.LCLASS__NAME:
        return getName();
      case SmDslPackage.LCLASS__VALUE:
        return getValue();
      case SmDslPackage.LCLASS__ECORE_TYPES:
        if (resolve) return getEcoreTypes();
        return basicGetEcoreTypes();
      case SmDslPackage.LCLASS__OBJ:
        if (resolve) return getObj();
        return basicGetObj();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmDslPackage.LCLASS__NAME:
        setName((String)newValue);
        return;
      case SmDslPackage.LCLASS__VALUE:
        setValue((String)newValue);
        return;
      case SmDslPackage.LCLASS__ECORE_TYPES:
        setEcoreTypes((Import)newValue);
        return;
      case SmDslPackage.LCLASS__OBJ:
        setObj((EClass)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmDslPackage.LCLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmDslPackage.LCLASS__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SmDslPackage.LCLASS__ECORE_TYPES:
        setEcoreTypes((Import)null);
        return;
      case SmDslPackage.LCLASS__OBJ:
        setObj((EClass)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmDslPackage.LCLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmDslPackage.LCLASS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SmDslPackage.LCLASS__ECORE_TYPES:
        return ecoreTypes != null;
      case SmDslPackage.LCLASS__OBJ:
        return obj != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //LClassImpl
