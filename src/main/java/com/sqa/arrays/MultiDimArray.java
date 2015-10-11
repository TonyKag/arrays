/**
 *   File Name: array.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package com.sqa.arrays;

/**
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class MultiDimArray {
	private static String[][] myArray = new String[4][];

	public static void main(String[] args) {

		String[] operand1 = new String[] { "2", "13", "7", "33" };
		String[] operand2 = new String[] { "4", "6", "4", "3" };
		String[] operation = new String[] { "A", "S", "M", "D" };
		String[] expResult = new String[] { "6", "7", "28", "11" };
		myArray[0] = operand1;
		myArray[1] = operand2;
		myArray[2] = operation;
		myArray[3] = expResult;

		displayMyArray();

		System.out.println("myArray[1][3]: " + myArray[1][3]);
	}

	/**
	 * 
	 */
	private static void displayMyArray() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(myArray[j][i] + " ");
			}
			System.out.print("\n");
		}

	}

}
