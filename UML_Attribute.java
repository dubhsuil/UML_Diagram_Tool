/**
 * A UML_Attribute stores the necessary data for an attribute (variable) in a class, IOT be represented on a UML diagram,
 * and to be written to a code skeleton.
 * @author Dubhsuil
 */
public class UML_Attribute {

	/*start class attributes*/
	private String name;
	private String type;
	private Visibility visible;
	/*end class attributes*/
	
	/*start getters and setters*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Visibility getVisible() {
		return visible;
	}
	public void setVisible(Visibility visible) {
		this.visible = visible;
	}
	/*end getters and setters*/
	
	/*start constructors*/
	/**
	 * fully parameterized constructor for a UML_attribute
	 * @param name - String, the name of the variable
	 * @param type - String, the type for this attribute (primitive or otherwise)
	 * @param visible - enum, the visibility for this attribute
	 */
	public UML_Attribute(
			String name, 
			String type, 
			Visibility visible
			) {
		super();
		this.name = name;
		this.type = type;
		this.visible = visible;
	}
	/*end constructors*/
	
}
