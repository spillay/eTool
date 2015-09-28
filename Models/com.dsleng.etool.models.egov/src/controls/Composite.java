/**
 */
package controls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controls.Composite#getUsesControl <em>Uses Control</em>}</li>
 * </ul>
 *
 * @see controls.ControlsPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends SimpleControl {
	/**
	 * Returns the value of the '<em><b>Uses Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Control</em>' reference.
	 * @see #setUsesControl(SimpleControl)
	 * @see controls.ControlsPackage#getComposite_UsesControl()
	 * @model required="true"
	 * @generated
	 */
	SimpleControl getUsesControl();

	/**
	 * Sets the value of the '{@link controls.Composite#getUsesControl <em>Uses Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Control</em>' reference.
	 * @see #getUsesControl()
	 * @generated
	 */
	void setUsesControl(SimpleControl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getCode();

} // Composite
