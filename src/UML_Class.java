/**
 * A UML_Class stores all the data necessary for a class to be represented in a
 * UML diagram, and for a code-skeleton to be written.
 * 
 * @author Dubhsuil
 */
public class UML_Class {

	/* start class attributes */
	private String class_name;
	private UML_Attribute[] attributes;
	private int attribute_count;
	private UML_Method_Header[] headers;
	private int header_count;
	private Visibility visible;
	/* end class attributes */

	/* start getters and Setters */
	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public UML_Attribute[] getAttributes() {
		return attributes;
	}

	public void setAttributes(UML_Attribute[] attributes) {
		this.attributes = attributes;
	}

	public int getAttribute_count() {
		return attribute_count;
	}

	public void setAttribute_count(int count) {
		attribute_count = count;
	}

	public UML_Method_Header[] getHeaders() {
		return headers;
	}

	public void setHeaders(UML_Method_Header[] headers) {
		this.headers = headers;
	}

	public int getHeader_count() {
		return header_count;
	}

	public void setHeader_count(int count) {
		header_count = count;
	}

	public Visibility getVisible() {
		return visible;
	}

	public void setVisible(Visibility visible) {
		this.visible = visible;
	}
	/* end getters and setters */

	/* start constructors */
	/**
	 * creating a class with only a name and visibility, these are the fewest
	 * details required.
	 * 
	 * @param name
	 *            - String, the name of the class
	 * @param vis
	 *            - Visibility, the enum denoting the visibility of the class
	 */
	public UML_Class(String name, Visibility vis) {
		class_name = name;
		visible = vis;
		attributes = new UML_Attribute[0];
		attribute_count = 0;
		headers = new UML_Method_Header[0];
		header_count = 0;
	}

	/**
	 * fully parameterized class, this is preferred method of creating a new
	 * UML_Class
	 * 
	 * @param name
	 *            - String, the name of the class
	 * @param vis
	 *            - enum, the type of visibility for this class
	 * @param attributes
	 *            - an array containing all of the class variables
	 * @param headers
	 *            - an array containing all of the method headers
	 */
	public UML_Class(String name, Visibility vis, UML_Attribute[] attributes, UML_Method_Header[] headers) {
		class_name = name;
		visible = vis;
		this.attributes = attributes;
		attribute_count = attributes.length;
		this.headers = headers;
		header_count = headers.length;
	}
	/* end constructors */

	/**
	 * adds a new attribute to the class, expands the array IOT accommodate
	 * 
	 * @param att
	 *            - UML_Attribute, the attribute to be added to the class
	 * @return boolean - true, if attribute_count is properly updated
	 */
	public boolean add_attribute(UML_Attribute att) {
		UML_Attribute[] temp = new UML_Attribute[attribute_count + 1];
		for (int i = 0; i < attribute_count; i++) {
			temp[i] = attributes[i];
		}
		temp[attribute_count++] = att;
		attributes = temp;
		return attribute_count == temp.length;
	}

	/**
	 * removes an attribute from the class and collapses the array
	 * 
	 * @param index
	 *            - int, the index of the attribute to be removed
	 * @return boolean - true if attribute_count is equal to attributes.length
	 */
	public boolean remove_attribute(int index) {
		UML_Attribute[] temp = new UML_Attribute[attribute_count - 1];
		for (int i = 0, j = 0; i < attribute_count - 1; i++) {
			if (i != index) {
				temp[j++] = attributes[i];
			}
		}
		attribute_count--;
		attributes = temp;
		return attribute_count == attributes.length;
	}

	/**
	 * adds a new method header to the class, expands the array to fit it
	 * 
	 * @param head
	 *            - UML_Method_Header, the new header to add to the class
	 */
	public void add_header(UML_Method_Header head) {
		UML_Method_Header temp[] = new UML_Method_Header[header_count + 1];
		for (int i = 0; i < header_count; i++) {
			temp[i] = headers[i];
		}
		temp[header_count++] = head;
		headers = temp;
	}

	/**
	 * removes a method header to the class, collapses the array
	 * 
	 * @param index
	 *            - int, the index of the header to be removed
	 */
	public void remove_header(int index) {
		UML_Method_Header temp[] = new UML_Method_Header[header_count - 1];
		for (int i = 0, j = 0; i < header_count; i++) {
			if (i != index) {
				temp[j++] = headers[i];
			}
		}
		headers = temp;
	}
}
