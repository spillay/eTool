/**
 */
package com.dsleng.etool.models.bobjs.impl;

import com.dsleng.etool.models.bobjs.Attribute;
import com.dsleng.etool.models.bobjs.BOEnum;
import com.dsleng.etool.models.bobjs.BasedOn;
import com.dsleng.etool.models.bobjs.BobjsFactory;
import com.dsleng.etool.models.bobjs.BobjsPackage;
import com.dsleng.etool.models.bobjs.BusinessObject;
import com.dsleng.etool.models.bobjs.DataTypes;
import com.dsleng.etool.models.bobjs.Inclusions;
import com.dsleng.etool.models.bobjs.Literal;
import com.dsleng.etool.models.bobjs.Multiplicity;
import com.dsleng.etool.models.bobjs.NamedElement;
import com.dsleng.etool.models.bobjs.OrgUnit;
import com.dsleng.etool.models.bobjs.References;
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
public class BobjsFactoryImpl extends EFactoryImpl implements BobjsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BobjsFactory init() {
		try {
			BobjsFactory theBobjsFactory = (BobjsFactory)EPackage.Registry.INSTANCE.getEFactory(BobjsPackage.eNS_URI);
			if (theBobjsFactory != null) {
				return theBobjsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BobjsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BobjsFactoryImpl() {
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
			case BobjsPackage.NAMED_ELEMENT: return createNamedElement();
			case BobjsPackage.ORG_UNIT: return createOrgUnit();
			case BobjsPackage.ATTRIBUTE: return createAttribute();
			case BobjsPackage.REFERENCES: return createReferences();
			case BobjsPackage.BUSINESS_OBJECT: return createBusinessObject();
			case BobjsPackage.BO_ENUM: return createBOEnum();
			case BobjsPackage.LITERAL: return createLiteral();
			case BobjsPackage.ENUM: return createEnum();
			case BobjsPackage.BASED_ON: return createBasedOn();
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
			case BobjsPackage.DATA_TYPES:
				return createDataTypesFromString(eDataType, initialValue);
			case BobjsPackage.INCLUSIONS:
				return createInclusionsFromString(eDataType, initialValue);
			case BobjsPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
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
			case BobjsPackage.DATA_TYPES:
				return convertDataTypesToString(eDataType, instanceValue);
			case BobjsPackage.INCLUSIONS:
				return convertInclusionsToString(eDataType, instanceValue);
			case BobjsPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public References createReferences() {
		ReferencesImpl references = new ReferencesImpl();
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject createBusinessObject() {
		BusinessObjectImpl businessObject = new BusinessObjectImpl();
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOEnum createBOEnum() {
		BOEnumImpl boEnum = new BOEnumImpl();
		return boEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.dsleng.etool.models.bobjs.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOn createBasedOn() {
		BasedOnImpl basedOn = new BasedOnImpl();
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue) {
		DataTypes result = DataTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusions createInclusionsFromString(EDataType eDataType, String initialValue) {
		Inclusions result = Inclusions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInclusionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BobjsPackage getBobjsPackage() {
		return (BobjsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BobjsPackage getPackage() {
		return BobjsPackage.eINSTANCE;
	}

} //BobjsFactoryImpl
