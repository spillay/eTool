/**
 */
package com.dsleng.etool.presentation.view;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.presentation.view.ViewFactory
 * @model kind="package"
 * @generated
 */
public interface ViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/dsleng/etool/presentation/view/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.dsleng.etool.presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewPackage eINSTANCE = com.dsleng.etool.presentation.view.impl.ViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.LayoutImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.LayersImpl <em>Layers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.LayersImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayers()
	 * @generated
	 */
	int LAYERS = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__RESIZABLE = 2;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__MIN_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__MAX_SIZE = 4;

	/**
	 * The number of structural features of the '<em>Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.HorizontalImpl <em>Horizontal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.HorizontalImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getHorizontal()
	 * @generated
	 */
	int HORIZONTAL = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__STYLE = LAYERS__STYLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__POSITION = LAYERS__POSITION;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__RESIZABLE = LAYERS__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__MIN_SIZE = LAYERS__MIN_SIZE;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__MAX_SIZE = LAYERS__MAX_SIZE;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__HEIGHT = LAYERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FEATURE_COUNT = LAYERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_OPERATION_COUNT = LAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.VerticalImpl <em>Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.VerticalImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getVertical()
	 * @generated
	 */
	int VERTICAL = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__STYLE = LAYERS__STYLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__POSITION = LAYERS__POSITION;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__RESIZABLE = LAYERS__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__MIN_SIZE = LAYERS__MIN_SIZE;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__MAX_SIZE = LAYERS__MAX_SIZE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__WIDTH = LAYERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FEATURE_COUNT = LAYERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_OPERATION_COUNT = LAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.ContentImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STYLE = LAYERS__STYLE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__POSITION = LAYERS__POSITION;

	/**
	 * The feature id for the '<em><b>Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__RESIZABLE = LAYERS__RESIZABLE;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__MIN_SIZE = LAYERS__MIN_SIZE;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__MAX_SIZE = LAYERS__MAX_SIZE;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__HEIGHT = LAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__WIDTH = LAYERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = LAYERS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = LAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.impl.PageImpl
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 5;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.presentation.view.LayoutPosition <em>Layout Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.presentation.view.LayoutPosition
	 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayoutPosition()
	 * @generated
	 */
	int LAYOUT_POSITION = 6;


	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see com.dsleng.etool.presentation.view.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.presentation.view.Layout#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see com.dsleng.etool.presentation.view.Layout#getLayers()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Layers();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Layers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layers</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers
	 * @generated
	 */
	EClass getLayers();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Layers#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers#getStyle()
	 * @see #getLayers()
	 * @generated
	 */
	EAttribute getLayers_Style();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Layers#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers#getPosition()
	 * @see #getLayers()
	 * @generated
	 */
	EAttribute getLayers_Position();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Layers#isResizable <em>Resizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resizable</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers#isResizable()
	 * @see #getLayers()
	 * @generated
	 */
	EAttribute getLayers_Resizable();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Layers#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers#getMinSize()
	 * @see #getLayers()
	 * @generated
	 */
	EAttribute getLayers_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Layers#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see com.dsleng.etool.presentation.view.Layers#getMaxSize()
	 * @see #getLayers()
	 * @generated
	 */
	EAttribute getLayers_MaxSize();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Horizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal</em>'.
	 * @see com.dsleng.etool.presentation.view.Horizontal
	 * @generated
	 */
	EClass getHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Horizontal#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.dsleng.etool.presentation.view.Horizontal#getHeight()
	 * @see #getHorizontal()
	 * @generated
	 */
	EAttribute getHorizontal_Height();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical</em>'.
	 * @see com.dsleng.etool.presentation.view.Vertical
	 * @generated
	 */
	EClass getVertical();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Vertical#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.dsleng.etool.presentation.view.Vertical#getWidth()
	 * @see #getVertical()
	 * @generated
	 */
	EAttribute getVertical_Width();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see com.dsleng.etool.presentation.view.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Content#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.dsleng.etool.presentation.view.Content#getHeight()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.presentation.view.Content#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.dsleng.etool.presentation.view.Content#getWidth()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Width();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.presentation.view.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see com.dsleng.etool.presentation.view.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link com.dsleng.etool.presentation.view.Page#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see com.dsleng.etool.presentation.view.Page#getLayout()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Layout();

	/**
	 * Returns the meta object for enum '{@link com.dsleng.etool.presentation.view.LayoutPosition <em>Layout Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Position</em>'.
	 * @see com.dsleng.etool.presentation.view.LayoutPosition
	 * @generated
	 */
	EEnum getLayoutPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewFactory getViewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.LayoutImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__LAYERS = eINSTANCE.getLayout_Layers();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.LayersImpl <em>Layers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.LayersImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayers()
		 * @generated
		 */
		EClass LAYERS = eINSTANCE.getLayers();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYERS__STYLE = eINSTANCE.getLayers_Style();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYERS__POSITION = eINSTANCE.getLayers_Position();

		/**
		 * The meta object literal for the '<em><b>Resizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYERS__RESIZABLE = eINSTANCE.getLayers_Resizable();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYERS__MIN_SIZE = eINSTANCE.getLayers_MinSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYERS__MAX_SIZE = eINSTANCE.getLayers_MaxSize();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.HorizontalImpl <em>Horizontal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.HorizontalImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getHorizontal()
		 * @generated
		 */
		EClass HORIZONTAL = eINSTANCE.getHorizontal();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL__HEIGHT = eINSTANCE.getHorizontal_Height();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.VerticalImpl <em>Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.VerticalImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getVertical()
		 * @generated
		 */
		EClass VERTICAL = eINSTANCE.getVertical();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL__WIDTH = eINSTANCE.getVertical_Width();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.ContentImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__HEIGHT = eINSTANCE.getContent_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__WIDTH = eINSTANCE.getContent_Width();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.impl.PageImpl
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LAYOUT = eINSTANCE.getPage_Layout();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.presentation.view.LayoutPosition <em>Layout Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.presentation.view.LayoutPosition
		 * @see com.dsleng.etool.presentation.view.impl.ViewPackageImpl#getLayoutPosition()
		 * @generated
		 */
		EEnum LAYOUT_POSITION = eINSTANCE.getLayoutPosition();

	}

} //ViewPackage
