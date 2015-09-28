/**
 */
package com.dsleng.etool.models.controls.impl;

import com.dsleng.etool.models.controls.ControlDef;
import com.dsleng.etool.models.controls.ControlsPackage;
import com.dsleng.etool.models.controls.OptionInstance;
import com.dsleng.etool.models.controls.SimpleControl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.models.controls.impl.SimpleControlImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.SimpleControlImpl#getOptionInstance <em>Option Instance</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.SimpleControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.SimpleControlImpl#getNestedControls <em>Nested Controls</em>}</li>
 *   <li>{@link com.dsleng.etool.models.controls.impl.SimpleControlImpl#getSibling <em>Sibling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleControlImpl extends MinimalEObjectImpl.Container implements SimpleControl {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected ControlDef uses;

	/**
	 * The cached value of the '{@link #getOptionInstance() <em>Option Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionInstance> optionInstance;

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
	 * The cached value of the '{@link #getNestedControls() <em>Nested Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedControls()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleControl> nestedControls;

	/**
	 * The cached value of the '{@link #getSibling() <em>Sibling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSibling()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleControl> sibling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.SIMPLE_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlDef getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (ControlDef)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlsPackage.SIMPLE_CONTROL__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlDef basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(ControlDef newUses) {
		ControlDef oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlsPackage.SIMPLE_CONTROL__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionInstance> getOptionInstance() {
		if (optionInstance == null) {
			optionInstance = new EObjectContainmentEList<OptionInstance>(OptionInstance.class, this, ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE);
		}
		return optionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlsPackage.SIMPLE_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleControl> getNestedControls() {
		if (nestedControls == null) {
			nestedControls = new EObjectResolvingEList<SimpleControl>(SimpleControl.class, this, ControlsPackage.SIMPLE_CONTROL__NESTED_CONTROLS);
		}
		return nestedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleControl> getSibling() {
		if (sibling == null) {
			sibling = new EObjectResolvingEList<SimpleControl>(SimpleControl.class, this, ControlsPackage.SIMPLE_CONTROL__SIBLING);
		}
		return sibling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE:
				return ((InternalEList<?>)getOptionInstance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.SIMPLE_CONTROL__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE:
				return getOptionInstance();
			case ControlsPackage.SIMPLE_CONTROL__NAME:
				return getName();
			case ControlsPackage.SIMPLE_CONTROL__NESTED_CONTROLS:
				return getNestedControls();
			case ControlsPackage.SIMPLE_CONTROL__SIBLING:
				return getSibling();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlsPackage.SIMPLE_CONTROL__USES:
				setUses((ControlDef)newValue);
				return;
			case ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE:
				getOptionInstance().clear();
				getOptionInstance().addAll((Collection<? extends OptionInstance>)newValue);
				return;
			case ControlsPackage.SIMPLE_CONTROL__NAME:
				setName((String)newValue);
				return;
			case ControlsPackage.SIMPLE_CONTROL__NESTED_CONTROLS:
				getNestedControls().clear();
				getNestedControls().addAll((Collection<? extends SimpleControl>)newValue);
				return;
			case ControlsPackage.SIMPLE_CONTROL__SIBLING:
				getSibling().clear();
				getSibling().addAll((Collection<? extends SimpleControl>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ControlsPackage.SIMPLE_CONTROL__USES:
				setUses((ControlDef)null);
				return;
			case ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE:
				getOptionInstance().clear();
				return;
			case ControlsPackage.SIMPLE_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ControlsPackage.SIMPLE_CONTROL__NESTED_CONTROLS:
				getNestedControls().clear();
				return;
			case ControlsPackage.SIMPLE_CONTROL__SIBLING:
				getSibling().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ControlsPackage.SIMPLE_CONTROL__USES:
				return uses != null;
			case ControlsPackage.SIMPLE_CONTROL__OPTION_INSTANCE:
				return optionInstance != null && !optionInstance.isEmpty();
			case ControlsPackage.SIMPLE_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ControlsPackage.SIMPLE_CONTROL__NESTED_CONTROLS:
				return nestedControls != null && !nestedControls.isEmpty();
			case ControlsPackage.SIMPLE_CONTROL__SIBLING:
				return sibling != null && !sibling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SimpleControlImpl
