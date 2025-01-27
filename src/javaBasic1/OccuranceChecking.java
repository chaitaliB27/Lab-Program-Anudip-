package javaBasic1;

import java.util.Arrays;
import java.util.Scanner;

public class OccuranceChecking {
	 public static void main(String[] args) {
	        int arr[] = {45, 67, 89, 45, 23};
	        int elementToRemove = 45;

	        // Count occurrences of the element
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == elementToRemove) {
	                count++;
	            }
	        }

	        // Create a new array with the appropriate size
	        int[] newArr = new int[arr.length - count];
	        int newIndex = 0;

	        // Copy elements from the original array to the new array, skipping the element to be removed
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != elementToRemove) {
	                newArr[newIndex] = arr[i];
	                newIndex++;
	            }
	        }

	        // Print the new array
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        System.out.println("Element to remove: " + elementToRemove);
	        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArr));
	    }
}