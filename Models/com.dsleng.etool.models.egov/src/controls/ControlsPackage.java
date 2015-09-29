/**
 */
package controls;

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
 * @see controls.ControlsFactory
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
	ControlsPackage eINSTANCE = controls.impl.ControlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link controls.impl.ControlDefImpl <em>Control Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.ControlDefImpl
	 * @see controls.impl.ControlsPackageImpl#getControlDef()
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
	 * The meta object id for the '{@link controls.impl.PageInfoImpl <em>Page Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.PageInfoImpl
	 * @see controls.impl.ControlsPackageImpl#getPageInfo()
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
	 * The meta object id for the '{@link controls.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.ResourceImpl
	 * @see controls.impl.ControlsPackageImpl#getResource()
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
	 * The meta object id for the '{@link controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.ControlManagerImpl
	 * @see controls.impl.ControlsPackageImpl#getControlManager()
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
	 * The meta object id for the '{@link controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.ControlGroupImpl
	 * @see controls.impl.ControlsPackageImpl#getControlGroup()
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
	 * The meta object id for the '{@link controls.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.OptionsImpl
	 * @see controls.impl.ControlsPackageImpl#getOptions()
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
	 * The meta object id for the '{@link controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.ValuePlaceHolderImpl
	 * @see controls.impl.ControlsPackageImpl#getValuePlaceHolder()
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
	 * The meta object id for the '{@link controls.impl.SimpleControlImpl <em>Simple Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.SimpleControlImpl
	 * @see controls.impl.ControlsPackageImpl#getSimpleControl()
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
	 * The meta object id for the '{@link controls.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.CompositeImpl
	 * @see controls.impl.ControlsPackageImpl#getComposite()
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
	 * The meta object id for the '{@link controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.CompositeWebCtrlImpl
	 * @see controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
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
	 * The meta object id for the '{@link controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.CompositeMobCtrlImpl
	 * @see controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
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
	 * The meta object id for the '{@link controls.impl.OptionInstanceImpl <em>Option Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.OptionInstanceImpl
	 * @see controls.impl.ControlsPackageImpl#getOptionInstance()
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
	 * The meta object id for the '{@link controls.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see controls.impl.TypeImpl
	 * @see controls.impl.ControlsPackageImpl#getType()
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
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link controls.ControlDef <em>Control Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Def</em>'.
	 * @see controls.ControlDef
	 * @generated
	 */
	EClass getControlDef();

	/**
	 * Returns the meta object for the attribute '{@link controls.ControlDef#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see controls.ControlDef#getNs()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Ns();

	/**
	 * Returns the meta object for the attribute '{@link controls.ControlDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see controls.ControlDef#getPrefix()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link controls.ControlDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.ControlDef#getName()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.ControlDef#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see controls.ControlDef#getOptions()
	 * @see #getControlDef()
	 * @generated
	 */
	EReference getControlDef_Options();

	/**
	 * Returns the meta object for the attribute '{@link controls.ControlDef#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see controls.ControlDef#getSyntax()
	 * @see #getControlDef()
	 * @generated
	 */
	EAttribute getControlDef_Syntax();

	/**
	 * Returns the meta object for class '{@link controls.PageInfo <em>Page Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Info</em>'.
	 * @see controls.PageInfo
	 * @generated
	 */
	EClass getPageInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.PageInfo#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see controls.PageInfo#getResources()
	 * @see #getPageInfo()
	 * @generated
	 */
	EReference getPageInfo_Resources();

	/**
	 * Returns the meta object for the attribute '{@link controls.PageInfo#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see controls.PageInfo#getDir()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Dir();

	/**
	 * Returns the meta object for the attribute '{@link controls.PageInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see controls.PageInfo#getTitle()
	 * @see #getPageInfo()
	 * @generated
	 */
	EAttribute getPageInfo_Title();

	/**
	 * Returns the meta object for class '{@link controls.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see controls.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link controls.Resource#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see controls.Resource#getNs()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Ns();

	/**
	 * Returns the meta object for the attribute '{@link controls.Resource#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see controls.Resource#getPrefix()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Prefix();

	/**
	 * Returns the meta object for class '{@link controls.ControlManager <em>Control Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Manager</em>'.
	 * @see controls.ControlManager
	 * @generated
	 */
	EClass getControlManager();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.ControlManager#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see controls.ControlManager#getControls()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.ControlManager#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pageinfos</em>'.
	 * @see controls.ControlManager#getPageinfos()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Pageinfos();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.ControlManager#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see controls.ControlManager#getComposites()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.ControlManager#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see controls.ControlManager#getTypes()
	 * @see #getControlManager()
	 * @generated
	 */
	EReference getControlManager_Types();

	/**
	 * Returns the meta object for class '{@link controls.ControlGroup <em>Control Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Group</em>'.
	 * @see controls.ControlGroup
	 * @generated
	 */
	EClass getControlGroup();

	/**
	 * Returns the meta object for the reference list '{@link controls.ControlGroup#getPageinfos <em>Pageinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pageinfos</em>'.
	 * @see controls.ControlGroup#getPageinfos()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Pageinfos();

	/**
	 * Returns the meta object for the reference list '{@link controls.ControlGroup#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composites</em>'.
	 * @see controls.ControlGroup#getComposites()
	 * @see #getControlGroup()
	 * @generated
	 */
	EReference getControlGroup_Composites();

	/**
	 * Returns the meta object for the attribute '{@link controls.ControlGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.ControlGroup#getName()
	 * @see #getControlGroup()
	 * @generated
	 */
	EAttribute getControlGroup_Name();

	/**
	 * Returns the meta object for class '{@link controls.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see controls.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link controls.Options#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.Options#getName()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.Options#getValueplaceholder <em>Valueplaceholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueplaceholder</em>'.
	 * @see controls.Options#getValueplaceholder()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Valueplaceholder();

	/**
	 * Returns the meta object for class '{@link controls.ValuePlaceHolder <em>Value Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Place Holder</em>'.
	 * @see controls.ValuePlaceHolder
	 * @generated
	 */
	EClass getValuePlaceHolder();

	/**
	 * Returns the meta object for the attribute '{@link controls.ValuePlaceHolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.ValuePlaceHolder#getName()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link controls.ValuePlaceHolder#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntax</em>'.
	 * @see controls.ValuePlaceHolder#getSyntax()
	 * @see #getValuePlaceHolder()
	 * @generated
	 */
	EAttribute getValuePlaceHolder_Syntax();

	/**
	 * Returns the meta object for class '{@link controls.CompositeWebCtrl <em>Composite Web Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Web Ctrl</em>'.
	 * @see controls.CompositeWebCtrl
	 * @generated
	 */
	EClass getCompositeWebCtrl();

	/**
	 * Returns the meta object for class '{@link controls.CompositeMobCtrl <em>Composite Mob Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Mob Ctrl</em>'.
	 * @see controls.CompositeMobCtrl
	 * @generated
	 */
	EClass getCompositeMobCtrl();

	/**
	 * Returns the meta object for class '{@link controls.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see controls.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the reference '{@link controls.Composite#getUsesControl <em>Uses Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Control</em>'.
	 * @see controls.Composite#getUsesControl()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_UsesControl();

	/**
	 * Returns the meta object for the '{@link controls.Composite#getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Code</em>' operation.
	 * @see controls.Composite#getCode()
	 * @generated
	 */
	EOperation getComposite__GetCode();

	/**
	 * Returns the meta object for class '{@link controls.OptionInstance <em>Option Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Instance</em>'.
	 * @see controls.OptionInstance
	 * @generated
	 */
	EClass getOptionInstance();

	/**
	 * Returns the meta object for the reference '{@link controls.OptionInstance#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see controls.OptionInstance#getOption()
	 * @see #getOptionInstance()
	 * @generated
	 */
	EReference getOptionInstance_Option();

	/**
	 * Returns the meta object for the reference list '{@link controls.OptionInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see controls.OptionInstance#getValue()
	 * @see #getOptionInstance()
	 * @generated
	 */
	EReference getOptionInstance_Value();

	/**
	 * Returns the meta object for class '{@link controls.SimpleControl <em>Simple Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Control</em>'.
	 * @see controls.SimpleControl
	 * @generated
	 */
	EClass getSimpleControl();

	/**
	 * Returns the meta object for the reference '{@link controls.SimpleControl#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see controls.SimpleControl#getUses()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link controls.SimpleControl#getOptionInstance <em>Option Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Instance</em>'.
	 * @see controls.SimpleControl#getOptionInstance()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_OptionInstance();

	/**
	 * Returns the meta object for the attribute '{@link controls.SimpleControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.SimpleControl#getName()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EAttribute getSimpleControl_Name();

	/**
	 * Returns the meta object for the reference list '{@link controls.SimpleControl#getNestedControls <em>Nested Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Controls</em>'.
	 * @see controls.SimpleControl#getNestedControls()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_NestedControls();

	/**
	 * Returns the meta object for the reference list '{@link controls.SimpleControl#getSibling <em>Sibling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sibling</em>'.
	 * @see controls.SimpleControl#getSibling()
	 * @see #getSimpleControl()
	 * @generated
	 */
	EReference getSimpleControl_Sibling();

	/**
	 * Returns the meta object for class '{@link controls.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see controls.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link controls.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see controls.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference '{@link controls.Type#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see controls.Type#getControl()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Control();

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
		 * The meta object literal for the '{@link controls.impl.ControlDefImpl <em>Control Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.ControlDefImpl
		 * @see controls.impl.ControlsPackageImpl#getControlDef()
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
		 * The meta object literal for the '{@link controls.impl.PageInfoImpl <em>Page Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.PageInfoImpl
		 * @see controls.impl.ControlsPackageImpl#getPageInfo()
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
		 * The meta object literal for the '{@link controls.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.ResourceImpl
		 * @see controls.impl.ControlsPackageImpl#getResource()
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
		 * The meta object literal for the '{@link controls.impl.ControlManagerImpl <em>Control Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.ControlManagerImpl
		 * @see controls.impl.ControlsPackageImpl#getControlManager()
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
		 * The meta object literal for the '{@link controls.impl.ControlGroupImpl <em>Control Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.ControlGroupImpl
		 * @see controls.impl.ControlsPackageImpl#getControlGroup()
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
		 * The meta object literal for the '{@link controls.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.OptionsImpl
		 * @see controls.impl.ControlsPackageImpl#getOptions()
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
		 * The meta object literal for the '{@link controls.impl.ValuePlaceHolderImpl <em>Value Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.ValuePlaceHolderImpl
		 * @see controls.impl.ControlsPackageImpl#getValuePlaceHolder()
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
		 * The meta object literal for the '{@link controls.impl.CompositeWebCtrlImpl <em>Composite Web Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.CompositeWebCtrlImpl
		 * @see controls.impl.ControlsPackageImpl#getCompositeWebCtrl()
		 * @generated
		 */
		EClass COMPOSITE_WEB_CTRL = eINSTANCE.getCompositeWebCtrl();

		/**
		 * The meta object literal for the '{@link controls.impl.CompositeMobCtrlImpl <em>Composite Mob Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.CompositeMobCtrlImpl
		 * @see controls.impl.ControlsPackageImpl#getCompositeMobCtrl()
		 * @generated
		 */
		EClass COMPOSITE_MOB_CTRL = eINSTANCE.getCompositeMobCtrl();

		/**
		 * The meta object literal for the '{@link controls.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.CompositeImpl
		 * @see controls.impl.ControlsPackageImpl#getComposite()
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
		 * The meta object literal for the '{@link controls.impl.OptionInstanceImpl <em>Option Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.OptionInstanceImpl
		 * @see controls.impl.ControlsPackageImpl#getOptionInstance()
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
		 * The meta object literal for the '{@link controls.impl.SimpleControlImpl <em>Simple Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.SimpleControlImpl
		 * @see controls.impl.ControlsPackageImpl#getSimpleControl()
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
		 * The meta object literal for the '{@link controls.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see controls.impl.TypeImpl
		 * @see controls.impl.ControlsPackageImpl#getType()
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

	}

} //ControlsPackage
