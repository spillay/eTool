/**
 */
package com.dsleng.etool.model.bobjs.util;

import com.dsleng.etool.model.bobjs.Annotation;
import com.dsleng.etool.model.bobjs.Attribute;
import com.dsleng.etool.model.bobjs.BOEnum;
import com.dsleng.etool.model.bobjs.BOImport;
import com.dsleng.etool.model.bobjs.BasedOn;
import com.dsleng.etool.model.bobjs.BobjsPackage;
import com.dsleng.etool.model.bobjs.BusinessObject;
import com.dsleng.etool.model.bobjs.BusinessType;
import com.dsleng.etool.model.bobjs.Literal;
import com.dsleng.etool.model.bobjs.NamedElement;
import com.dsleng.etool.model.bobjs.OpParameter;
import com.dsleng.etool.model.bobjs.Operation;
import com.dsleng.etool.model.bobjs.OrgUnit;
import com.dsleng.etool.model.bobjs.References;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.model.bobjs.BobjsPackage
 * @generated
 */
public class BobjsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BobjsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BobjsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BobjsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BobjsSwitch<Adapter> modelSwitch =
		new BobjsSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseOrgUnit(OrgUnit object) {
				return createOrgUnitAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseReferences(References object) {
				return createReferencesAdapter();
			}
			@Override
			public Adapter caseBusinessObject(BusinessObject object) {
				return createBusinessObjectAdapter();
			}
			@Override
			public Adapter caseBOEnum(BOEnum object) {
				return createBOEnumAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseEnum(com.dsleng.etool.model.bobjs.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseBasedOn(BasedOn object) {
				return createBasedOnAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOpParameter(OpParameter object) {
				return createOpParameterAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseBusinessType(BusinessType object) {
				return createBusinessTypeAdapter();
			}
			@Override
			public Adapter caseBOImport(BOImport object) {
				return createBOImportAdapter();
			}
			@Override
			public Adapter casePackage(com.dsleng.etool.model.bobjs.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.OrgUnit
	 * @generated
	 */
	public Adapter createOrgUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.References
	 * @generated
	 */
	public Adapter createReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.BusinessObject
	 * @generated
	 */
	public Adapter createBusinessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.BOEnum <em>BO Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.BOEnum
	 * @generated
	 */
	public Adapter createBOEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.BasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.BasedOn
	 * @generated
	 */
	public Adapter createBasedOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.OpParameter <em>Op Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.OpParameter
	 * @generated
	 */
	public Adapter createOpParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.BusinessType <em>Business Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.BusinessType
	 * @generated
	 */
	public Adapter createBusinessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.BOImport <em>BO Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.BOImport
	 * @generated
	 */
	public Adapter createBOImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.dsleng.etool.model.bobjs.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.dsleng.etool.model.bobjs.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BobjsAdapterFactory
