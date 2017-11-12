import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.beans.XMLDecoder;

/**
 * This class writes and decodes UML_Class objects using XML
 * 
 * @author Dubhsuil
 */
public class Save_and_Load {

	public static void write_classes(UML_Class classes[], File outFile) throws FileNotFoundException {
		XMLEncoder writer = new XMLEncoder(new FileOutputStream(outFile));
		writer.writeObject(new Integer(classes.length));
		for (int i = 0; i < classes.length; i++) {
			writer.writeObject(classes[i]);
		}
		writer.close();
	}

	public static UML_Class[] read_classes(File inFile) throws FileNotFoundException {
		XMLDecoder reader = new XMLDecoder(new FileInputStream(inFile));
		UML_Class classes[] = new UML_Class[(int) reader.readObject()];
		for (int i = 0; i < classes.length; i++) {
			reader.readObject();
		}
		reader.close();
		return classes;
	}

}
