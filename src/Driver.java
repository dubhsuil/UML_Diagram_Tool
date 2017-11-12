import java.util.Scanner;

/**
 * Driver is meant to test and observe
 * 
 * @author Dubhsuil
 *
 */
public class Driver {

	public static String WELCOME_TEXT = ""; 
	public static String OPTIONS = "";
	public static String GOODBYE = "";
	
	public static void main(String[] args) {
		boolean quit = false;
		Scanner in = new Scanner(System.in);
		System.out.println(WELCOME_TEXT);
		String response;
		while (!quit) {
			response = in.nextLine();
			switch (Integer.parseInt(response)) {
				case 1:
					//view classes
					break;
				case 2:
					//new class
					break;
				case 3:
					//remove class
					break;
				case 4:
					//load file
					break;
				case 5:
					//save file
					break;
				case 0:
					//exit
					System.out.println("Goodbye!");
					quit = true;
				default:
					//unrecognized input
					
			}
			
		}
		in.close();
		System.out.println(GOODBYE);
	}

}
