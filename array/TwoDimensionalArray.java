package array;

import java.util.Arrays;

/*
 * Two dimensional arrays are arrays in which each member is also an array.
 * An array of arrays is known as two dimensional array.
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
		 * int[] a =
		 * {
		 * 4, ----> 0
		 * 6, ----> 1
		 * 10, ----> 2
		 * };
		 * 
		 * String[][] b =
		 * {
		 * {1, 2, 3} -----> 0
		 * {5, 6, 7} -----> 1
		 * {9, 10, 11} -----> 2
		 * }
		 */
		
		String[] names = new String[3]; // single dimensional array
		names[0] = "Kartik";
		names[1] = "Mohini";
		names[2] = "Sanket";
		
		String color[][] = new String[3][2]; // two dimensional array
		String a1[] = {"Red", "Brown"};
		String a2[] = {"Black", "Pink"};
		String a3[] = {"Green", "Yellow"};
		
		color[0] = a1; // adding array at index 0 of color
		color[1] = a2;
		color[2] = a3;
		
		int[][] numbers = // another way of initializing two dimensional array
			{
					{1, 2}, // 0
					{6, 10, 15}, // 1
					{900} // 2
			};
		
		/*
		 * this will access the value stored in the index that is present on index 2 of array
		 * present on the index 1 of the array numbers
		 */
		System.out.println("Single member: \n" + numbers[1][2]);
		
		// using enhance for loop or for each loop
		System.out.println("\nUsing enhance for loop or for each loop...");
		for(int[] x:numbers) {
			
			System.out.println(Arrays.toString(x));
		}
		
		// using for loop
		System.out.println("\nUsing for loop...");
		for(int i=0; i<numbers.length; i++) {
			
			// numbers[i] will fetch the array at index i of numbers array
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
