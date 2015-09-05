/**
 */
package com.dsleng.etool.presentation.view;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsleng.etool.presentation.view.Layers#getStyle <em>Style</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.Layers#getPosition <em>Position</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.Layers#isResizable <em>Resizable</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.Layers#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link com.dsleng.etool.presentation.view.Layers#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Layers extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.presentation.view.Layers#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * The literals are from the enumeration {@link com.dsleng.etool.presentation.view.LayoutPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see com.dsleng.etool.presentation.view.LayoutPosition
	 * @see #setPosition(LayoutPosition)
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers_Position()
	 * @model default="center"
	 * @generated
	 */
	LayoutPosition getPosition();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.presentation.view.Layers#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see com.dsleng.etool.presentation.view.LayoutPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(LayoutPosition value);

	/**
	 * Returns the value of the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resizable</em>' attribute.
	 * @see #setResizable(boolean)
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers_Resizable()
	 * @model
	 * @generated
	 */
	boolean isResizable();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.presentation.view.Layers#isResizable <em>Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resizable</em>' attribute.
	 * @see #isResizable()
	 * @generated
	 */
	void setResizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(int)
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers_MinSize()
	 * @model
	 * @generated
	 */
	int getMinSize();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.presentation.view.Layers#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #getMinSize()
	 * @generated
	 */
	void setMinSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see com.dsleng.etool.presentation.view.ViewPackage#getLayers_MaxSize()
	 * @model
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link com.dsleng.etool.presentation.view.Layers#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // Layers
