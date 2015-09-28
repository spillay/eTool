/**
 */
package controls.impl;

import controls.Composite;
import controls.ControlsPackage;
import controls.SimpleControl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link controls.impl.CompositeImpl#getUsesControl <em>Uses Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends SimpleControlImpl implements Composite {
	/**
	 * The cached value of the '{@link #getUsesControl() <em>Uses Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesControl()
	 * @generated
	 * @ordered
	 */
	protected SimpleControl usesControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlsPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleControl getUsesControl() {
		if (usesControl != null && usesControl.eIsProxy()) {
			InternalEObject oldUsesControl = (InternalEObject)usesControl;
			usesControl = (SimpleControl)eResolveProxy(oldUsesControl);
			if (usesControl != oldUsesControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlsPackage.COMPOSITE__USES_CONTROL, oldUsesControl, usesControl));
			}
		}
		return usesControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleControl basicGetUsesControl() {
		return usesControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesControl(SimpleControl newUsesControl) {
		SimpleControl oldUsesControl = usesControl;
		usesControl = newUsesControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlsPackage.COMPOSITE__USES_CONTROL, oldUsesControl, usesControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlsPackage.COMPOSITE__USES_CONTROL:
				if (resolve) return getUsesControl();
				return basicGetUsesControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlsPackage.COMPOSITE__USES_CONTROL:
				setUsesControl((SimpleControl)newValue);
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
			case ControlsPackage.COMPOSITE__USES_CONTROL:
				setUsesControl((SimpleControl)null);
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
			case ControlsPackage.COMPOSITE__USES_CONTROL:
				return usesControl != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ControlsPackage.COMPOSITE___GET_CODE:
				getCode();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeImpl
