/**
 */
package com.dsleng.etool.semantic.map.smDsl.impl;

import com.dsleng.etool.semantic.map.smDsl.Element;
import com.dsleng.etool.semantic.map.smDsl.Import;
import com.dsleng.etool.semantic.map.smDsl.Mappings;
import com.dsleng.etool.semantic.map.smDsl.SemanticMapping;
import com.dsleng.etool.semantic.map.smDsl.SmDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl#getEname <em>Ename</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link com.dsleng.etool.semantic.map.smDsl.impl.SemanticMappingImpl#getEl <em>El</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticMappingImpl extends MinimalEObjectImpl.Container implements SemanticMapping
{
  /**
   * The cached value of the '{@link #getEname() <em>Ename</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected Import ename;

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
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected EList<Mappings> mapping;

  /**
   * The cached value of the '{@link #getEl() <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl()
   * @generated
   * @ordered
   */
  protected Element el;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SemanticMappingImpl()
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
    return SmDslPackage.Literals.SEMANTIC_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getEname()
  {
    return ename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEname(Import newEname, NotificationChain msgs)
  {
    Import oldEname = ename;
    ename = newEname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmDslPackage.SEMANTIC_MAPPING__ENAME, oldEname, newEname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEname(Import newEname)
  {
    if (newEname != ename)
    {
      NotificationChain msgs = null;
      if (ename != null)
        msgs = ((InternalEObject)ename).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmDslPackage.SEMANTIC_MAPPING__ENAME, null, msgs);
      if (newEname != null)
        msgs = ((InternalEObject)newEname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmDslPackage.SEMANTIC_MAPPING__ENAME, null, msgs);
      msgs = basicSetEname(newEname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.SEMANTIC_MAPPING__ENAME, newEname, newEname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.SEMANTIC_MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mappings> getMapping()
  {
    if (mapping == null)
    {
      mapping = new EObjectContainmentEList<Mappings>(Mappings.class, this, SmDslPackage.SEMANTIC_MAPPING__MAPPING);
    }
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getEl()
  {
    return el;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEl(Element newEl, NotificationChain msgs)
  {
    Element oldEl = el;
    el = newEl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmDslPackage.SEMANTIC_MAPPING__EL, oldEl, newEl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEl(Element newEl)
  {
    if (newEl != el)
    {
      NotificationChain msgs = null;
      if (el != null)
        msgs = ((InternalEObject)el).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmDslPackage.SEMANTIC_MAPPING__EL, null, msgs);
      if (newEl != null)
        msgs = ((InternalEObject)newEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmDslPackage.SEMANTIC_MAPPING__EL, null, msgs);
      msgs = basicSetEl(newEl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmDslPackage.SEMANTIC_MAPPING__EL, newEl, newEl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmDslPackage.SEMANTIC_MAPPING__ENAME:
        return basicSetEname(null, msgs);
      case SmDslPackage.SEMANTIC_MAPPING__MAPPING:
        return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
      case SmDslPackage.SEMANTIC_MAPPING__EL:
        return basicSetEl(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SmDslPackage.SEMANTIC_MAPPING__ENAME:
        return getEname();
      case SmDslPackage.SEMANTIC_MAPPING__NAME:
        return getName();
      case SmDslPackage.SEMANTIC_MAPPING__MAPPING:
        return getMapping();
      case SmDslPackage.SEMANTIC_MAPPING__EL:
        return getEl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmDslPackage.SEMANTIC_MAPPING__ENAME:
        setEname((Import)newValue);
        return;
      case SmDslPackage.SEMANTIC_MAPPING__NAME:
        setName((String)newValue);
        return;
      case SmDslPackage.SEMANTIC_MAPPING__MAPPING:
        getMapping().clear();
        getMapping().addAll((Collection<? extends Mappings>)newValue);
        return;
      case SmDslPackage.SEMANTIC_MAPPING__EL:
        setEl((Element)newValue);
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
      case SmDslPackage.SEMANTIC_MAPPING__ENAME:
        setEname((Import)null);
        return;
      case SmDslPackage.SEMANTIC_MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmDslPackage.SEMANTIC_MAPPING__MAPPING:
        getMapping().clear();
        return;
      case SmDslPackage.SEMANTIC_MAPPING__EL:
        setEl((Element)null);
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
      case SmDslPackage.SEMANTIC_MAPPING__ENAME:
        return ename != null;
      case SmDslPackage.SEMANTIC_MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmDslPackage.SEMANTIC_MAPPING__MAPPING:
        return mapping != null && !mapping.isEmpty();
      case SmDslPackage.SEMANTIC_MAPPING__EL:
        return el != null;
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
    result.append(')');
    return result.toString();
  }

} //SemanticMappingImpl
