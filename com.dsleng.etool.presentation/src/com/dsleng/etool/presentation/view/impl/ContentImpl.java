/**
 */
package com.dsleng.etool.presentation.view.impl;

import com.dsleng.etool.presentation.view.Content;
import com.dsleng.etool.presentation.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.ContentImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.impl.ContentImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends LayersImpl implements Content {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(ViewPackage.Literals.CONTENT__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(ViewPackage.Literals.CONTENT__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(ViewPackage.Literals.CONTENT__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(ViewPackage.Literals.CONTENT__WIDTH, newWidth);
	}

} //ContentImpl
