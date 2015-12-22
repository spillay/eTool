/**
 */
package com.dsleng.etool.models.bobjs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.dsleng.etool.models.bobjs.BobjsPackage#getMultiplicity()
 * @model
 * @generated
 */
public enum Multiplicity implements Enumerator {
	/**
	 * The '<em><b>One Toone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TOONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TOONE(0, "oneToone", "onetoone"),

	/**
	 * The '<em><b>One Tomany</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TOMANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TOMANY(1, "oneTomany", "oneTomany"),

	/**
	 * The '<em><b>Many Tomany</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TOMANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TOMANY(2, "manyTomany", "manyTomany"),

	/**
	 * The '<em><b>Many Toone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TOONE_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TOONE(3, "manyToone", "manyToone");

	/**
	 * The '<em><b>One Toone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Toone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TOONE
	 * @model name="oneToone" literal="onetoone"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TOONE_VALUE = 0;

	/**
	 * The '<em><b>One Tomany</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Tomany</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TOMANY
	 * @model name="oneTomany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TOMANY_VALUE = 1;

	/**
	 * The '<em><b>Many Tomany</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many Tomany</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TOMANY
	 * @model name="manyTomany"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TOMANY_VALUE = 2;

	/**
	 * The '<em><b>Many Toone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many Toone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TOONE
	 * @model name="manyToone"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TOONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicity[] VALUES_ARRAY =
		new Multiplicity[] {
			ONE_TOONE,
			ONE_TOMANY,
			MANY_TOMANY,
			MANY_TOONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(int value) {
		switch (value) {
			case ONE_TOONE_VALUE: return ONE_TOONE;
			case ONE_TOMANY_VALUE: return ONE_TOMANY;
			case MANY_TOMANY_VALUE: return MANY_TOMANY;
			case MANY_TOONE_VALUE: return MANY_TOONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Multiplicity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Multiplicity
