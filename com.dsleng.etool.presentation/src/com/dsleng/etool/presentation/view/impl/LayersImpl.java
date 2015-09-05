/**
 */
package com.dsleng.etool.presentation.view.impl;

import com.dsleng.etool.presentation.view.Layers;
import com.dsleng.etool.presentation.view.LayoutPosition;
import com.dsleng.etool.presentation.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayersImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayersImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayersImpl#isResizable <em>Resizable</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayersImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.LayersImpl#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayersImpl extends CDOObjectImpl implements Layers {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.LAYERS;
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
	public String getStyle() {
		return (String)eGet(ViewPackage.Literals.LAYERS__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eSet(ViewPackage.Literals.LAYERS__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutPosition getPosition() {
		return (LayoutPosition)eGet(ViewPackage.Literals.LAYERS__POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(LayoutPosition newPosition) {
		eSet(ViewPackage.Literals.LAYERS__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResizable() {
		return (Boolean)eGet(ViewPackage.Literals.LAYERS__RESIZABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizable(boolean newResizable) {
		eSet(ViewPackage.Literals.LAYERS__RESIZABLE, newResizable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSize() {
		return (Integer)eGet(ViewPackage.Literals.LAYERS__MIN_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSize(int newMinSize) {
		eSet(ViewPackage.Literals.LAYERS__MIN_SIZE, newMinSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSize() {
		return (Integer)eGet(ViewPackage.Literals.LAYERS__MAX_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(int newMaxSize) {
		eSet(ViewPackage.Literals.LAYERS__MAX_SIZE, newMaxSize);
	}

} //LayersImpl
