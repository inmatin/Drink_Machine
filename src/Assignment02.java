/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 19th, 2021
 * Modified: Nov 19th, 2021
 * Description: This class will get the user to enter the size and volume of the
 * drink being measured
 */

import java.util.Scanner;

//class Assingment02
public class Assignment02 {

	// no arg constructor
	public static void main(String[] args) {

		// declaration
		DrinkMachine machine = new DrinkMachine();
		User user = new User();
		Scanner keyboard = new Scanner(System.in);

		double volume = 0;
		String size = null;
		// int test = 0;
		String shouldContinue = "yes";

		// (other variables as needed)

		// ToDo:
		// Ask for drink size as text, prompt using the menu generated
		// from a method in DrinkMachine

		// Ask for measured volume, accepting decimal places

		// determine if the volume matches the expected size using the
		// verifySize() method, printing the returned report.

		// print out your name on screen

		// ask if there is more data to enter (yes, no) and continue
		// using a loop only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)

		// you can use any decision structure or loop for this program,
		// however a for-loop is not recommended.

		// do while shouldContinue igrnoring case = "yes"
		do {

			// output machine.drinkSizeMenu()
			System.out.println(machine.drinkSizeMenu());

			// output "drink sizes are case-sensitive"
			System.out.println("drink sizes are case-sensitive");

			// user.inputString = user
			size = user.inputString("Enter size (small, medium, or large): ");

			// user.inputDouble = volume
			volume = user.inputDouble("Enter volume: ");

			// testing interger
			// test = user.inputInteger("Test Integer: ");
			// System.out.println(test);

			// machine.setSize = size
			machine.setSize(size);

			// machine.seVolume = volume
			machine.setVolume(volume);

			// execute machine.verifySize
			machine.verifySize();

			// print name of the creator
			System.out.println("Program by Ishtiaque Matin ");

			// String value
			String value = null;

			// loop control variable
			boolean isInputBad = true;

			// while isInputBad = true
			while (isInputBad) {

				// output
				System.out.print("\nContinue program (yes/no)? ");

				// value = keyboard.nextLine
				value = keyboard.nextLine();

				// if value ignoring case = "yes"
				if (value.equalsIgnoreCase("yes")) {
					isInputBad = false;
					shouldContinue = value;
				}
				// else if value ignoring case = "no"
				else if (value.equalsIgnoreCase("no")) {
					isInputBad = false;
					shouldContinue = value;
					System.out.print("Program has exited.");
				} else {
					System.out.println("Invalid Entry! ");
				}

			} // end while

		}
		// while shouldContinue = "yes"
		while (shouldContinue.equalsIgnoreCase("yes"));

		// System.out.print("Program has exited.");

		keyboard.close();
	}
}