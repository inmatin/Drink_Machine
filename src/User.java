/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 19th, 2021
 * Modified: Nov 19th, 2021
 * Description: This class will properly enter the user date int, double and 
 * String
 */


import java.util.Scanner;

//class User
public class User {

	private Scanner keyboard = new Scanner(System.in);

	// inputInterger()
	public int inputInteger() {
		// ToDo: See lecture notes and stop this from crashing the program
		// if the user enters text, you can copy and paste code from
		// the lecture notes, but cite the lecture handout.

		int value = 0;
		boolean isInputBad = true; // sentinel loop control variable
		while (isInputBad) { // same as (isInputBad == true)
			if (keyboard.hasNextInt()) {
				value = keyboard.nextInt();
				isInputBad = false;
			} else {
				System.out.print("Invalid Entry for Test Integer, please re-enter: ");
			}
			keyboard.nextLine();
		} // end while
		return value; // exit the method
	} // end inputInteger()

	// output inputInteger()
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger();
		return value;
	}

	// inputDouble()
	public double inputDouble() {
		// ToDo: See lecture notes and stop this from crashing the program
		// if the user enters text, you can copy and paste code from
		// the lecture notes, but cite the lecture handout.

		//declaration
		double value = 0;
		
		//loop control variable
		boolean isInputBad = true;

		//while isInputBad = true
		while (isInputBad) {
			
			
			if (keyboard.hasNextDouble()) {
				value = keyboard.nextDouble();
				if (value > 0) {
					isInputBad = false;
				} else {
					System.out.print("Invalid Entry for Volume, please re-enter: ");
				}
			} else {
				System.out.print("Invalid Entry for Volume, please re-enter: ");
			}
			keyboard.nextLine();
		} // end while
		return value; // exit the method
	} // end inputDouble()

	// output inputDouble()
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}

	// inputString()
	public String inputString() {

		String value = null;

		boolean isInputBad = true; // sentinel loop control variable
		while (isInputBad) { // same as (isInputBad == true)

			value = keyboard.nextLine();

			if (value.equalsIgnoreCase("small")) {
				isInputBad = false;
			} else if (value.equalsIgnoreCase("medium")) {
				isInputBad = false;
			} else if (value.equalsIgnoreCase("large")) {
				isInputBad = false;
			} else {
				System.out.print("Invalid Entry for Size, please re-enter: ");
			}

		} // end while
		return value;
	} // end inputString()

	// output inputString()
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
}