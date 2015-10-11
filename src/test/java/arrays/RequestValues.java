/**
 *   File Name: RequestValues.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package arrays;

import java.util.Scanner;

/**
 * RequestValues //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestValues {
	private static Scanner scanner = new Scanner(System.in);

	public static boolean requestBooleanValue(String question) {
		boolean endValue = true;
		while (true) {
			System.out.print(question);
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				endValue = true;
				break;
			} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				endValue = false;
				break;
			} else {
				System.out.println("You must enter Yes/Y or No/N.");
				continue;
			}
		}
		return endValue;
	}

	public static int requestIntValue(String question) {
		int intValue = 0;
		String input;
		System.out.println(question);
		input = scanner.nextLine();
		return intValue;
	}
}
