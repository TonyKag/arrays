/**
 *   File Name: ArraysTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package arrays;

import org.junit.Test;

/**
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ArraysTest {

	String[][] multDimArray0;
	// You have to declare
	String[][] multDimArray1 = new String[4][];
	String[][] multDimArray2 = { { "2", "4", "A", "6" }, { "13", "6", "S", "7" }, { "7", "4", "M", "28" },
			{ "33", "3", "D", "11" } };

	@Test
	public void create2DArray() {
		String[] test1 = new String[] { "2", "4", "A", "6" };
		String[] test2 = new String[] { "13", "6", "S", "7" };
		String[] test3 = new String[] { "7", "4", "M", "28" };
		String[] test4 = new String[] { "33", "3", "D", "11" };

		multDimArray1[0] = test1;
		multDimArray1[1] = test2;
		multDimArray1[2] = test3;
		multDimArray1[3] = test4;

		display(multDimArray1);

	}

	/**
	 * @param multDimArray12
	 */
	private void display(String[][] multDimArray) {
		/*
		 * int i = 0; int j = 0; System.out.println("[" + multDimArray[i][j++] +
		 * "]\t[" + multDimArray[i][j++] + "]\t[" + multDimArray[i][j++] +
		 * "]\t[" + multDimArray[i][j] + "]"); i++; j = 0;
		 * System.out.println("[" + multDimArray[i][j] + "]\t[" +
		 * multDimArray[i][++j] + "]\t[" + multDimArray[i][++j] + "]\t[" +
		 * multDimArray[i][++j] + "]"); i++; j = 0; System.out.println("[" +
		 * multDimArray[i][j++] + "]\t[" + multDimArray[i][j++] + "]\t[" +
		 * multDimArray[i][j++] + "]\t[" + multDimArray[i][j] + "]"); i++; j =
		 * 0; System.out.println("[" + multDimArray[i][j] + "]\t[" +
		 * multDimArray[i][++j] + "]\t[" + multDimArray[i][++j] + "]\t[" +
		 * multDimArray[i][++j] + "]");
		 * 
		 * System.out.println("");
		 */

		for (int row = 0; row < multDimArray.length; row++) {
			System.out.print("Test " + (row + 1) + ":\t");
			for (int col = 0; col < multDimArray[row].length; col++) {
				System.out.print("[" + multDimArray[row][col] + "]\t");
			}
			System.out.print("\n");
		}

	}
}
