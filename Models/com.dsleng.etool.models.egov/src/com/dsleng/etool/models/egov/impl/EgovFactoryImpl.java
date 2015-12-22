/**
 */
package com.dsleng.etool.models.egov.impl;

import com.dsleng.etool.models.egov.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgovFactoryImpl extends EFactoryImpl implements EgovFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EgovFactory init() {
		try {
			EgovFactory theEgovFactory = (EgovFactory)EPackage.Registry.INSTANCE.getEFactory(EgovPackage.eNS_URI);
			if (theEgovFactory != null) {
				return theEgovFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EgovFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgovFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EgovPackage.ESERVICE: return createEService();
			case EgovPackage.PAGE: return createPage();
			case EgovPackage.BO_MAPPER: return createBOMapper();
			case EgovPackage.BO_ATTRIBUTE: return createBOAttribute();
			case EgovPackage.PRE_DEFINED_VALUE: return createPreDefinedValue();
			case EgovPackage.CONTROL_MAPPER: return createControlMapper();
			case EgovPackage.PRE_DEFINED_CONTAINER: return createPreDefinedContainer();
			case EgovPackage.IMPORT: return createImport();
			case EgovPackage.ADMIN: return createAdmin();
			case EgovPackage.MENU: return createMenu();
			case EgovPackage.WEB_ELEMENT: return createWebElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EgovPackage.MENU_TYPE:
				return createMenuTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EgovPackage.MENU_TYPE:
				return convertMenuTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EService createEService() {
		EServiceImpl eService = new EServiceImpl();
		return eService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMapper createBOMapper() {
		BOMapperImpl boMapper = new BOMapperImpl();
		return boMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOAttribute createBOAttribute() {
		BOAttributeImpl boAttribute = new BOAttributeImpl();
		return boAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreDefinedValue createPreDefinedValue() {
		PreDefinedValueImpl preDefinedValue = new PreDefinedValueImpl();
		return preDefinedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlMapper createControlMapper() {
		ControlMapperImpl controlMapper = new ControlMapperImpl();
		return controlMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreDefinedContainer createPreDefinedContainer() {
		PreDefinedContainerImpl preDefinedContainer = new PreDefinedContainerImpl();
		return preDefinedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebElement createWebElement() {
		WebElementImpl webElement = new WebElementImpl();
		return webElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuType createMenuTypeFromString(EDataType eDataType, String initialValue) {
		MenuType result = MenuType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMenuTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgovPackage getEgovPackage() {
		return (EgovPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EgovPackage getPackage() {
		return EgovPackage.eINSTANCE;
	}

} //EgovFactoryImpl
