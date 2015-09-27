/**
 */
package com.dsleng.etool.models.controls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.dsleng.etool.models.controls.ControlsFactory
 * @model kind="package"
 * @generated
 */
public interface ControlsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/dsleng/etool/models/controls";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.dsleng.etool.models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlsPackage eINSTANCE = com.dsleng.etool.models.controls.impl.ControlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.ControlImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NS = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SYNTAX = 4;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.MControlImpl <em>MControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.MControlImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getMControl()
	 * @generated
	 */
	int MCONTROL = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL__NS = CONTROL__NS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL__PREFIX = CONTROL__PREFIX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL__OPTIONS = CONTROL__OPTIONS;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL__SYNTAX = CONTROL__SYNTAX;

	/**
	 * The number of structural features of the '<em>MControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.WControlImpl <em>WControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.WControlImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getWControl()
	 * @generated
	 */
	int WCONTROL = 2;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL__NS = CONTROL__NS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL__PREFIX = CONTROL__PREFIX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL__OPTIONS = CONTROL__OPTIONS;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL__SYNTAX = CONTROL__SYNTAX;

	/**
	 * The number of structural features of the '<em>WControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.PageInfoImpl <em>Page Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.PageInfoImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getPageInfo()
	 * @generated
	 */
	int PAGE_INFO = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INFO__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INFO__DIR = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INFO__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Page Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.ResourceImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NS = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.ControlManagerImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControlManager()
	 * @generated
	 */
	int CONTROL_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Pageinfos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER__PAGEINFOS = 1;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER__COMPOSITES = 2;

	/**
	 * The number of structural features of the '<em>Control Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.ControlGroupImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControlGroup()
	 * @generated
	 */
	int CONTROL_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Pageinfos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__PAGEINFOS = 1;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__COMPOSITES = 2;

	/**
	 * The number of structural features of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.OptionsImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valueplaceholder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__VALUEPLACEHOLDER = 1;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.ValuePlaceHolderImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getValuePlaceHolder()
	 * @generated
	 */
	int VALUE_PLACE_HOLDER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PLACE_HOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PLACE_HOLDER__SYNTAX = 1;

	/**
	 * The number of structural features of the '<em>Value Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PLACE_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PLACE_HOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.CompositeImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 11;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SYNTAX = 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.CompositeWebCtrlImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
	 * @generated
	 */
	int COMPOSITE_WEB_CTRL = 9;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__SYNTAX = COMPOSITE__SYNTAX;

	/**
	 * The feature id for the '<em><b>Wcontrols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__WCONTROLS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Web Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Web Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.controls.impl.CompositeMobCtrlImpl
	 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
	 * @generated
	 */
	int COMPOSITE_MOB_CTRL = 10;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__SYNTAX = COMPOSITE__SYNTAX;

	/**
	 * The feature id for the '<em><b>Mcontrols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__MCONTROLS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Mob Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Mob Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see com.dsleng.etool.models.controls.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Control#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.dsleng.etool.models.controls.Control#getNs()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Control#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.dsleng.etool.models.controls.Control#getPrefix()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.controls.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.Control#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see com.dsleng.etool.models.controls.Control#getOptions()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Options();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Control#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.controls.Control#getSyntax()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Syntax();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.MControl <em>MControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MControl</em>'.
	 * @see com.dsleng.etool.models.controls.MControl
	 * @generated
	 */
	EClass getMControl();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.WControl <em>WControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WControl</em>'.
	 * @see com.dsleng.etool.models.controls.WControl
	 * @generated
	 */
	EClass getWControl();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.PageInfo <em>Page Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Info</em>'.
	 * @see com.dsleng.etool.models.controls.PageInfo
	 * @generated
	 */
	EClass getPageInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.PageInfo#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.dsleng.etool.models.controls.PageInfo#getResources()
	 * @see #getPageInfo()
	 * @generated
	 */
	EReference getPageInfo_Resources();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.PageInfo#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see com.dsleng.etool.models.controls.PageInfo#getDir()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Dir();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.PageInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.dsleng.etool.models.controls.PageInfo#getTitle()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Title();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.dsleng.etool.models.controls.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Resource#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.dsleng.etool.models.controls.Resource#getNs()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Resource#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.dsleng.etool.models.controls.Resource#getPrefix()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Prefix();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.ControlManager <em>Control Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Manager</em>'.
	 * @see com.dsleng.etool.models.controls.ControlManager
	 * @generated
	 */
	EClass getControlManager();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.ControlManager#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see com.dsleng.etool.models.controls.ControlManager#getControls()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.ControlManager#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pageinfos</em>'.
	 * @see com.dsleng.etool.models.controls.ControlManager#getPageinfos()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Pageinfos();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.ControlManager#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see com.dsleng.etool.models.controls.ControlManager#getComposites()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Composites();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Group</em>'.
	 * @see com.dsleng.etool.models.controls.ControlGroup
	 * @generated
	 */
	EClass getControlGroup();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.controls.ControlGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see com.dsleng.etool.models.controls.ControlGroup#getControls()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Controls();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.controls.ControlGroup#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pageinfos</em>'.
	 * @see com.dsleng.etool.models.controls.ControlGroup#getPageinfos()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Pageinfos();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.controls.ControlGroup#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composites</em>'.
	 * @see com.dsleng.etool.models.controls.ControlGroup#getComposites()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Composites();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see com.dsleng.etool.models.controls.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Options#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.controls.Options#getName()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.controls.Options#getValueplaceholder <em>Valueplaceholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueplaceholder</em>'.
	 * @see com.dsleng.etool.models.controls.Options#getValueplaceholder()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Valueplaceholder();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.ValuePlaceHolder <em>Value Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Place Holder</em>'.
	 * @see com.dsleng.etool.models.controls.ValuePlaceHolder
	 * @generated
	 */
	EClass getValuePlaceHolder();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.controls.ValuePlaceHolder#getName()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.ValuePlaceHolder#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.controls.ValuePlaceHolder#getSyntax()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Syntax();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.CompositeWebCtrl <em>Composite Web Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Web Ctrl</em>'.
	 * @see com.dsleng.etool.models.controls.CompositeWebCtrl
	 * @generated
	 */
	EClass getCompositeWebCtrl();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.controls.CompositeWebCtrl#getWcontrols <em>Wcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wcontrols</em>'.
	 * @see com.dsleng.etool.models.controls.CompositeWebCtrl#getWcontrols()
	 * @see #getCompositeWebCtrl()
	 * @generated
	 */
	EReference getCompositeWebCtrl_Wcontrols();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.CompositeMobCtrl <em>Composite Mob Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Mob Ctrl</em>'.
	 * @see com.dsleng.etool.models.controls.CompositeMobCtrl
	 * @generated
	 */
	EClass getCompositeMobCtrl();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.controls.CompositeMobCtrl#getMcontrols <em>Mcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mcontrols</em>'.
	 * @see com.dsleng.etool.models.controls.CompositeMobCtrl#getMcontrols()
	 * @see #getCompositeMobCtrl()
	 * @generated
	 */
	EReference getCompositeMobCtrl_Mcontrols();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.controls.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see com.dsleng.etool.models.controls.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.controls.Composite#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.controls.Composite#getSyntax()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Syntax();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlsFactory getControlsFactory();

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
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.ControlImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NS = eINSTANCE.getControl_Ns();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__PREFIX = eINSTANCE.getControl_Prefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__OPTIONS = eINSTANCE.getControl_Options();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SYNTAX = eINSTANCE.getControl_Syntax();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.MControlImpl <em>MControl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.MControlImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getMControl()
		 * @generated
		 */
		EClass MCONTROL = eINSTANCE.getMControl();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.WControlImpl <em>WControl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.WControlImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getWControl()
		 * @generated
		 */
		EClass WCONTROL = eINSTANCE.getWControl();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.PageInfoImpl <em>Page Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.PageInfoImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getPageInfo()
		 * @generated
		 */
		EClass PAGE_INFO = eINSTANCE.getPageInfo();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_INFO__RESOURCES = eINSTANCE.getPageInfo_Resources();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_INFO__DIR = eINSTANCE.getPageInfo_Dir();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_INFO__TITLE = eINSTANCE.getPageInfo_Title();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.ResourceImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NS = eINSTANCE.getResource_Ns();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PREFIX = eINSTANCE.getResource_Prefix();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.ControlManagerImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControlManager()
		 * @generated
		 */
		EClass CONTROL_MANAGER = eINSTANCE.getControlManager();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MANAGER__CONTROLS = eINSTANCE.getControlManager_Controls();

		/**
		 * The meta object literal for the '<em><b>Pageinfos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MANAGER__PAGEINFOS = eINSTANCE.getControlManager_Pageinfos();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MANAGER__COMPOSITES = eINSTANCE.getControlManager_Composites();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.ControlGroupImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getControlGroup()
		 * @generated
		 */
		EClass CONTROL_GROUP = eINSTANCE.getControlGroup();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__CONTROLS = eINSTANCE.getControlGroup_Controls();

		/**
		 * The meta object literal for the '<em><b>Pageinfos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__PAGEINFOS = eINSTANCE.getControlGroup_Pageinfos();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_GROUP__COMPOSITES = eINSTANCE.getControlGroup_Composites();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.OptionsImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__NAME = eINSTANCE.getOptions_Name();

		/**
		 * The meta object literal for the '<em><b>Valueplaceholder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS__VALUEPLACEHOLDER = eINSTANCE.getOptions_Valueplaceholder();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.ValuePlaceHolderImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getValuePlaceHolder()
		 * @generated
		 */
		EClass VALUE_PLACE_HOLDER = eINSTANCE.getValuePlaceHolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PLACE_HOLDER__NAME = eINSTANCE.getValuePlaceHolder_Name();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PLACE_HOLDER__SYNTAX = eINSTANCE.getValuePlaceHolder_Syntax();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.CompositeWebCtrlImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
		 * @generated
		 */
		EClass COMPOSITE_WEB_CTRL = eINSTANCE.getCompositeWebCtrl();

		/**
		 * The meta object literal for the '<em><b>Wcontrols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WEB_CTRL__WCONTROLS = eINSTANCE.getCompositeWebCtrl_Wcontrols();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.CompositeMobCtrlImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
		 * @generated
		 */
		EClass COMPOSITE_MOB_CTRL = eINSTANCE.getCompositeMobCtrl();

		/**
		 * The meta object literal for the '<em><b>Mcontrols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MOB_CTRL__MCONTROLS = eINSTANCE.getCompositeMobCtrl_Mcontrols();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.controls.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.controls.impl.CompositeImpl
		 * @see com.dsleng.etool.models.controls.impl.ControlsPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__SYNTAX = eINSTANCE.getComposite_Syntax();

	}

} //ControlsPackage
