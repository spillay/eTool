/**
 */
package com.dsleng.etool.models.Controls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.dsleng.etool.models.Controls.ControlsFactory
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
	String eNAME = "Controls";

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
	ControlsPackage eINSTANCE = com.dsleng.etool.models.Controls.impl.ControlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.ControlDefImpl <em>Control Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.ControlDefImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlDef()
	 * @generated
	 */
	int CONTROL_DEF = 0;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF__NS = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF__NAME = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF__SYNTAX = 4;

	/**
	 * The number of structural features of the '<em>Control Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.PageInfoImpl <em>Page Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.PageInfoImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getPageInfo()
	 * @generated
	 */
	int PAGE_INFO = 1;

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
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.ResourceImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

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
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.ControlManagerImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlManager()
	 * @generated
	 */
	int CONTROL_MANAGER = 3;

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
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER__TYPES = 3;

	/**
	 * The number of structural features of the '<em>Control Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.ControlGroupImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlGroup()
	 * @generated
	 */
	int CONTROL_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Pageinfos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__PAGEINFOS = 0;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__COMPOSITES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GROUP__NAME = 2;

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
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.OptionsImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 5;

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
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.ValuePlaceHolderImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getValuePlaceHolder()
	 * @generated
	 */
	int VALUE_PLACE_HOLDER = 6;

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
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.SimpleControlImpl <em>Simple Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.SimpleControlImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getSimpleControl()
	 * @generated
	 */
	int SIMPLE_CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL__USES = 0;

	/**
	 * The feature id for the '<em><b>Option Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL__OPTION_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nested Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL__NESTED_CONTROLS = 3;

	/**
	 * The feature id for the '<em><b>Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL__SIBLING = 4;

	/**
	 * The number of structural features of the '<em>Simple Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Simple Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.CompositeImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 9;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__USES = SIMPLE_CONTROL__USES;

	/**
	 * The feature id for the '<em><b>Option Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OPTION_INSTANCE = SIMPLE_CONTROL__OPTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = SIMPLE_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Nested Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NESTED_CONTROLS = SIMPLE_CONTROL__NESTED_CONTROLS;

	/**
	 * The feature id for the '<em><b>Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SIBLING = SIMPLE_CONTROL__SIBLING;

	/**
	 * The feature id for the '<em><b>Uses Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__USES_CONTROL = SIMPLE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = SIMPLE_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___GET_CODE = SIMPLE_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = SIMPLE_CONTROL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.CompositeWebCtrlImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
	 * @generated
	 */
	int COMPOSITE_WEB_CTRL = 7;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__USES = COMPOSITE__USES;

	/**
	 * The feature id for the '<em><b>Option Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__OPTION_INSTANCE = COMPOSITE__OPTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__NAME = COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Nested Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__NESTED_CONTROLS = COMPOSITE__NESTED_CONTROLS;

	/**
	 * The feature id for the '<em><b>Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__SIBLING = COMPOSITE__SIBLING;

	/**
	 * The feature id for the '<em><b>Uses Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL__USES_CONTROL = COMPOSITE__USES_CONTROL;

	/**
	 * The number of structural features of the '<em>Composite Web Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL___GET_CODE = COMPOSITE___GET_CODE;

	/**
	 * The number of operations of the '<em>Composite Web Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WEB_CTRL_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.CompositeMobCtrlImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
	 * @generated
	 */
	int COMPOSITE_MOB_CTRL = 8;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__USES = COMPOSITE__USES;

	/**
	 * The feature id for the '<em><b>Option Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__OPTION_INSTANCE = COMPOSITE__OPTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__NAME = COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Nested Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__NESTED_CONTROLS = COMPOSITE__NESTED_CONTROLS;

	/**
	 * The feature id for the '<em><b>Sibling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__SIBLING = COMPOSITE__SIBLING;

	/**
	 * The feature id for the '<em><b>Uses Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL__USES_CONTROL = COMPOSITE__USES_CONTROL;

	/**
	 * The number of structural features of the '<em>Composite Mob Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL___GET_CODE = COMPOSITE___GET_CODE;

	/**
	 * The number of operations of the '<em>Composite Mob Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MOB_CTRL_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.OptionInstanceImpl <em>Option Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.OptionInstanceImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getOptionInstance()
	 * @generated
	 */
	int OPTION_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_INSTANCE__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.TypeImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.dsleng.etool.models.Controls.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dsleng.etool.models.Controls.impl.TypeParameterImpl
	 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.ControlDef <em>Control Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Def</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef
	 * @generated
	 */
	EClass getControlDef();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ControlDef#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef#getNs()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ControlDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef#getPrefix()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ControlDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef#getName()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.ControlDef#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef#getOptions()
	 * @see #getControlDef()
	 * @generated
	 */
	EReference getControlDef_Options();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ControlDef#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlDef#getSyntax()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Syntax();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.PageInfo <em>Page Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Info</em>'.
	 * @see com.dsleng.etool.models.Controls.PageInfo
	 * @generated
	 */
	EClass getPageInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.PageInfo#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.dsleng.etool.models.Controls.PageInfo#getResources()
	 * @see #getPageInfo()
	 * @generated
	 */
	EReference getPageInfo_Resources();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.PageInfo#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see com.dsleng.etool.models.Controls.PageInfo#getDir()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Dir();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.PageInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.dsleng.etool.models.Controls.PageInfo#getTitle()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Title();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.dsleng.etool.models.Controls.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.Resource#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see com.dsleng.etool.models.Controls.Resource#getNs()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Ns();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.Resource#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.dsleng.etool.models.Controls.Resource#getPrefix()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Prefix();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.ControlManager <em>Control Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Manager</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlManager
	 * @generated
	 */
	EClass getControlManager();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.ControlManager#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlManager#getControls()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.ControlManager#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pageinfos</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlManager#getPageinfos()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Pageinfos();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.ControlManager#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlManager#getComposites()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.ControlManager#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlManager#getTypes()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Types();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Group</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlGroup
	 * @generated
	 */
	EClass getControlGroup();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.Controls.ControlGroup#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pageinfos</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlGroup#getPageinfos()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Pageinfos();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.Controls.ControlGroup#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composites</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlGroup#getComposites()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Composites();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ControlGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.ControlGroup#getName()
	 * @see #getControlGroup()
	 * @generated
	 */
	EAttribute getControlGroup_Name();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see com.dsleng.etool.models.Controls.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.Options#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.Options#getName()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.Options#getValueplaceholder <em>Valueplaceholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueplaceholder</em>'.
	 * @see com.dsleng.etool.models.Controls.Options#getValueplaceholder()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Valueplaceholder();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.ValuePlaceHolder <em>Value Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Place Holder</em>'.
	 * @see com.dsleng.etool.models.Controls.ValuePlaceHolder
	 * @generated
	 */
	EClass getValuePlaceHolder();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ValuePlaceHolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.ValuePlaceHolder#getName()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.ValuePlaceHolder#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see com.dsleng.etool.models.Controls.ValuePlaceHolder#getSyntax()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Syntax();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.CompositeWebCtrl <em>Composite Web Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Web Ctrl</em>'.
	 * @see com.dsleng.etool.models.Controls.CompositeWebCtrl
	 * @generated
	 */
	EClass getCompositeWebCtrl();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.CompositeMobCtrl <em>Composite Mob Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Mob Ctrl</em>'.
	 * @see com.dsleng.etool.models.Controls.CompositeMobCtrl
	 * @generated
	 */
	EClass getCompositeMobCtrl();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see com.dsleng.etool.models.Controls.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.Controls.Composite#getUsesControl <em>Uses Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Control</em>'.
	 * @see com.dsleng.etool.models.Controls.Composite#getUsesControl()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_UsesControl();

	/**
	 * Returns the meta object for the '{@link com.dsleng.etool.models.Controls.Composite#getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Code</em>' operation.
	 * @see com.dsleng.etool.models.Controls.Composite#getCode()
	 * @generated
	 */
	EOperation getComposite__GetCode();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.OptionInstance <em>Option Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Instance</em>'.
	 * @see com.dsleng.etool.models.Controls.OptionInstance
	 * @generated
	 */
	EClass getOptionInstance();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.Controls.OptionInstance#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see com.dsleng.etool.models.Controls.OptionInstance#getOption()
	 * @see #getOptionInstance()
	 * @generated
	 */
	EReference getOptionInstance_Option();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.Controls.OptionInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see com.dsleng.etool.models.Controls.OptionInstance#getValue()
	 * @see #getOptionInstance()
	 * @generated
	 */
	EReference getOptionInstance_Value();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.SimpleControl <em>Simple Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Control</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl
	 * @generated
	 */
	EClass getSimpleControl();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.Controls.SimpleControl#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl#getUses()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.SimpleControl#getOptionInstance <em>Option Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Instance</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl#getOptionInstance()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_OptionInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.SimpleControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl#getName()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EAttribute getSimpleControl_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.Controls.SimpleControl#getNestedControls <em>Nested Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Controls</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl#getNestedControls()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_NestedControls();

	/**
	 * Returns the meta object for the reference list '{@link com.dsleng.etool.models.Controls.SimpleControl#getSibling <em>Sibling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sibling</em>'.
	 * @see com.dsleng.etool.models.Controls.SimpleControl#getSibling()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_Sibling();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.dsleng.etool.models.Controls.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.dsleng.etool.models.Controls.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.Controls.Type#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see com.dsleng.etool.models.Controls.Type#getControl()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dsleng.etool.models.Controls.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.dsleng.etool.models.Controls.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link com.dsleng.etool.models.Controls.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see com.dsleng.etool.models.Controls.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the reference '{@link com.dsleng.etool.models.Controls.TypeParameter#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see com.dsleng.etool.models.Controls.TypeParameter#getOption()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Option();

	/**
	 * Returns the meta object for the attribute '{@link com.dsleng.etool.models.Controls.TypeParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.dsleng.etool.models.Controls.TypeParameter#getValue()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EAttribute getTypeParameter_Value();

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
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.ControlDefImpl <em>Control Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.ControlDefImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlDef()
		 * @generated
		 */
		EClass CONTROL_DEF = eINSTANCE.getControlDef();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEF__NS = eINSTANCE.getControlDef_Ns();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEF__PREFIX = eINSTANCE.getControlDef_Prefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEF__NAME = eINSTANCE.getControlDef_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_DEF__OPTIONS = eINSTANCE.getControlDef_Options();

		/**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEF__SYNTAX = eINSTANCE.getControlDef_Syntax();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.PageInfoImpl <em>Page Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.PageInfoImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getPageInfo()
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
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.ResourceImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getResource()
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
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.ControlManagerImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlManager()
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
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MANAGER__TYPES = eINSTANCE.getControlManager_Types();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.ControlGroupImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getControlGroup()
		 * @generated
		 */
		EClass CONTROL_GROUP = eINSTANCE.getControlGroup();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GROUP__NAME = eINSTANCE.getControlGroup_Name();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.OptionsImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getOptions()
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
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.ValuePlaceHolderImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getValuePlaceHolder()
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
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.CompositeWebCtrlImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
		 * @generated
		 */
		EClass COMPOSITE_WEB_CTRL = eINSTANCE.getCompositeWebCtrl();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.CompositeMobCtrlImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
		 * @generated
		 */
		EClass COMPOSITE_MOB_CTRL = eINSTANCE.getCompositeMobCtrl();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.CompositeImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Uses Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__USES_CONTROL = eINSTANCE.getComposite_UsesControl();

		/**
		 * The meta object literal for the '<em><b>Get Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE___GET_CODE = eINSTANCE.getComposite__GetCode();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.OptionInstanceImpl <em>Option Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.OptionInstanceImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getOptionInstance()
		 * @generated
		 */
		EClass OPTION_INSTANCE = eINSTANCE.getOptionInstance();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_INSTANCE__OPTION = eINSTANCE.getOptionInstance_Option();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_INSTANCE__VALUE = eINSTANCE.getOptionInstance_Value();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.SimpleControlImpl <em>Simple Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.SimpleControlImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getSimpleControl()
		 * @generated
		 */
		EClass SIMPLE_CONTROL = eINSTANCE.getSimpleControl();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTROL__USES = eINSTANCE.getSimpleControl_Uses();

		/**
		 * The meta object literal for the '<em><b>Option Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTROL__OPTION_INSTANCE = eINSTANCE.getSimpleControl_OptionInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONTROL__NAME = eINSTANCE.getSimpleControl_Name();

		/**
		 * The meta object literal for the '<em><b>Nested Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTROL__NESTED_CONTROLS = eINSTANCE.getSimpleControl_NestedControls();

		/**
		 * The meta object literal for the '<em><b>Sibling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CONTROL__SIBLING = eINSTANCE.getSimpleControl_Sibling();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.TypeImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__CONTROL = eINSTANCE.getType_Control();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link com.dsleng.etool.models.Controls.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dsleng.etool.models.Controls.impl.TypeParameterImpl
		 * @see com.dsleng.etool.models.Controls.impl.ControlsPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__OPTION = eINSTANCE.getTypeParameter_Option();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_PARAMETER__VALUE = eINSTANCE.getTypeParameter_Value();

	}

} //ControlsPackage
