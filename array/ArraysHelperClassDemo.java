package array;

import java.util.Arrays;

public class ArraysHelperClassDemo {

	public static void main(String[] args) {
		/*
		 * Arrays is a predefined class used to manipulate the members of an
		 * array.
		 * In this class all methods are static.
		 */
		int num[] = {80, 2, 61, 12, 100};
		/*
		 * sort is a static method so we can call it with just class name
		 */
		Arrays.sort(num);
		
		System.out.println("Sorted array in ascending order:");
        for(int n:num) 
        	System.out.println(n);
        	
        	/*
        	 * binarySearch will return the index of member if present in the
        	 * array
        	 */
        	System.out.println("Number 12 is at index: " + 
        	Arrays.binarySearch(num, 12));
        	System.out.println("Number 2 is at index: " + 
                	Arrays.binarySearch(num, 2));
        	
        	/*
        	 * toString is an easy way of printing the members of an array 
        	 * without using loops
        	 */
        	System.out.println("Members of num: " + Arrays.toString(num));
	}

}
