/**
 */
package com.dsleng.etool.presentation.view.impl;

import com.dsleng.etool.presentation.view.Vertical;
import com.dsleng.etool.presentation.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.VerticalImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalImpl extends LayersImpl implements Vertical {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VERTICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(ViewPackage.Literals.VERTICAL__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(ViewPackage.Literals.VERTICAL__WIDTH, newWidth);
	}

} //VerticalImpl
