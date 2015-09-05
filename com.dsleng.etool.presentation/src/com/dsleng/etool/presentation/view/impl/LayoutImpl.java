/**
 */
package com.dsleng.etool.presentation.view.impl;

import com.dsleng.etool.presentation.view.Layers;
import com.dsleng.etool.presentation.view.Layout;
import com.dsleng.etool.presentation.view.ViewPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayoutImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends CDOObjectImpl implements Layout {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Layers> getLayers() {
		return (EList<Layers>)eGet(ViewPackage.Literals.LAYOUT__LAYERS, true);
	}

} //LayoutImpl
