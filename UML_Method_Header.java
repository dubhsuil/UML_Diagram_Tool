/**
 * A UML_Method_Header stores all the data necessary to represent a method in a UML Diagram,
 * and written to a code skeleton.
 * @author Dubhsuil
 */
public class UML_Method_Header {

	/*start class attributes*/
	private String name;
	private UML_Attribute return_type;
	private UML_Attribute[] arguments;
	private int arg_count;
	private Visibility vis;
	/*end class attributes*/
	
	/*start getters and setters*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UML_Attribute getReturn_type() {
		return return_type;
	}
	public void setReturn_type(UML_Attribute return_type) {
		this.return_type = return_type;
	}
	public UML_Attribute[] getArguments() {
		return arguments;
	}
	public void setArguments(UML_Attribute[] arguments) {
		this.arguments = arguments;
	}
	public int getArg_count() {
		return arg_count;
	}
	public void setArg_count(int count) {
		arg_count = count;
	}
	public Visibility getVis() {
		return vis;
	}
	public void setVis(Visibility vis) {
		this.vis = vis;
	}
	/*end getters and setters*/
	
	/*start constructors*/
	/**
	 * Fully parameterized constructor for a UML_Method_Header
	 * @param name - String, the name of the method
	 * @param return_type - String, the type that this method returns
	 * @param arguments - UML_Attribute[], an array containing the arguments for this method
	 * @param vis - enum, the visibility for this method
	 */
	public UML_Method_Header(
			String name, 
			UML_Attribute return_type, 
			UML_Attribute[] arguments, 
			Visibility vis
			) {
		super();
		this.name = name;
		this.return_type = return_type;
		this.arguments = arguments;
		this.vis = vis;
	}
	/*end constructors*/
	
	/**
	 * adds an argument to the array
	 * @param arg - UML_Attribute, the attribute to add to the header
	 */
	public void add_argument(UML_Attribute arg) {
		UML_Attribute[] temp = new UML_Attribute[arg_count + 1];
		for (int i = 0; i < arg_count; i++) {
			temp[i] = arguments[i];
		}
		temp[arg_count++] = arg;
		arguments = temp;
	}
	
	/**
	 * removes an argument from the array
	 * @param index - int, the index of the argument to remove
	 */
	public void remove_argument(int index) {
		UML_Attribute[] temp = new UML_Attribute[arg_count - 1];
		for (int i = 0, j = 0; i < arg_count; i++) {
			if (i != index) {
				temp[j++] = arguments[i];
			}
		}
	}
}
