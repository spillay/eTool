/**
 */
package com.dsleng.etool.presentation.view.impl;

import com.dsleng.etool.presentation.view.Horizontal;
import com.dsleng.etool.presentation.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.HorizontalImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalImpl extends LayersImpl implements Horizontal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.HORIZONTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(ViewPackage.Literals.HORIZONTAL__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(ViewPackage.Literals.HORIZONTAL__HEIGHT, newHeight);
	}

} //HorizontalImpl
