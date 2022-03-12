/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Nov 19th, 2021
 * Modified: Nov 19th, 2021
 * Description: This class will process the entered information
 */


//class Drinkmachine
public class DrinkMachine {
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	public static final double constant = 10.0;
	// ToDo: declare an EPSILON constant with value of 10.0
	// i.e. is measured volume within 10ml of expected volume?
	private double volume; // (ml)
	private String size; // "small", "medium", "large"

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public DrinkMachine() {
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public DrinkMachine(double volume, String size) {
		this.volume = volume;
		this.size = size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double getVolume() {
		return volume;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public void setVolume(double volume) {
		this.volume = volume;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String getSize() {
		return size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public void setSize(String size) {
		this.size = size;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	public String verifySize() {
		String report = "";
		double difference = 0;
		String tolerance = null;

		// ToDo: Use the size to determine the volume you are testing against.
		// then use EPSILON to determine if the expected volume, and
		// actual volume are "close enough", then return a string
		// as a report. E.g.
		// E.g.
		// "size is small, volume is 255.0 ml, difference is 5.0 ml, within tolerance of
		// 10.0 ml "
		// E.g.
		// "size is medium, volume is 389.0 ml, difference is 11.0 ml, outside of
		// tolerance of 10.0 ml"
		// E.g.
		// "size is tuna, volume is -45, difference is 0.0 ml, invalid size or volume
		// input"
		// You can use any decision structure you want.
		// You must use String.format(String, , , ) to generate the report.
		// Tip: See drinkSizeMenu() below for an example of String.format

		if (size.equalsIgnoreCase("small")) {

			difference = volume - SMALL_VOLUME;

			if (difference >= -10 && difference <= constant) {
				tolerance = "within tolerance of 10.0 ml";
			} else {
				tolerance = "outside tolerance of 10.0 ml";
			}
			report = String.format("size is %s, volume is %.1f (ml), difference is %.1f, %s", size, volume, difference,
					tolerance);
			System.out.println(report);

		}

		else if (size.equalsIgnoreCase("medium")) {

			difference = volume - MEDIUM_VOLUME;

			if (difference >= -10 && difference <= constant) {
				tolerance = "within tolerance of 10.0 ml";
			} else {
				tolerance = "outside tolerance of 10.0 ml";
			}
			report = String.format("size is %s, volume is %.1f (ml), difference is %.1f, %s", size, volume, difference,
					tolerance);
			System.out.println(report);

		}

		else if (size.equalsIgnoreCase("large")) {

			difference = volume - LARGE_VOLUME;

			if (difference >= -10 && difference <= constant) {
				tolerance = "within tolerance of 10.0 ml";
			} else {
				tolerance = "outside tolerance of 10.0 ml";
			}
			report = String.format("size is %s, volume is %.1f (ml), difference is %.1f, %s", size, volume, difference,
					tolerance);
			System.out.println(report);

		}

		else {
			report = String.format("size is %s, volume is %.1f (ml), difference is %.1f, %s", size, volume, difference,
					tolerance);
			System.out.println(report);
		}

		return report;
	}

	// ToDo: Supervisor wants programmer comments (use /* */ comment)
	// ToDo: verify the menu is correct and fix any problems.
	public String drinkSizeMenu() {
		String report = String.format("\nDrink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME, DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME);
		return report;
	}

}
