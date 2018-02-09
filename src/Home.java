import java.util.Scanner;

/**
 * Lab 3 - Display a table of powers.
 * 
 * Full JavaDocs can be found at this link: https://mtedder.github.io/lab3javadocs/
 *  
 * @author Java Class person
 * @version 1.0
 */
public class Home {

	static int userVal;
	static int value = 0;
	static Boolean proceed = true;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (proceed) {

			System.out.println("Please enter an integer: ");

			userVal = Math.abs(scan.nextInt());

			System.out.printf("%-10s %-10s %-10s","Number", "Squared", "Cubed");
			System.out.println();
			
			
			System.out.printf("%-10s %-10s %-10s","=======", "=======", "=======");
			System.out.println();
			value = 0;
			for (int i = userVal; i > 0; i--) {
				
				System.out.printf("%-10s %-10s %-10s",numberDisplay(userVal), squaredDisplay(value), cubedDisplay(value));
				System.out.println();

			}
			
			System.out.println();
			System.out.println("Continue? (y/n)");
			
			if (!scan.next().equalsIgnoreCase("y")) {
				proceed = false;
				
				System.out.println("Thank you for using the Grand Circus calculator!");
			}
			
			System.out.println();

		}
		scan.close();
		
		testMethod(3);

	}

	
	
	/**
	 * Testing javadocs shortcut
	 * @param int age of employee
	 */
	private static void testMethod(int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method must be be called first before calling squaredDisplay and cubedDisplay
	 * 
	 <pre>
		 {@code
			 String number = numberDisplay(userVal);
			 String number = squaredDisplay(value);
			 String number = cubedDisplay(value);
			 String number = System.out.println();
		}
 	</pre>
	 * @param userVal - not implemented
	 * @return String - the counter value
	 */
	public static String numberDisplay(int userVal) {

		value++;
		return String.valueOf(value);
	}

	/**
	 * Calculates the square of value.
	 * @param value - Operand for the Math.pow() method
	 * @return String representation of the value squared
	 */
	public static String squaredDisplay(int value) {

		return String.valueOf((int)Math.pow(value, 2));
	}

	/**
	 * Calculates the cube of a value.
	 * @param value - Operand for the Math.pow() method
	 * @return String representation of the value cubed
	 */
	public static String cubedDisplay(int value) {

		return String.valueOf((int)Math.pow(value, 3));
	}

}
