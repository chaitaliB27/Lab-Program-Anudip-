package javaBasic1;

public class ArrayHighestNumber {
	public static int findHighestNumber(int[] arr) {

	        int maxNumber = arr[0]; // Assume the first element is the maximum

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > maxNumber) {
	                maxNumber = arr[i];
	            }
	        }

	        return maxNumber;
	    }

	    public static void main(String[] args) {
	        int[] myArray = {3, 7, 2, 8, 5};
	        int result = findHighestNumber(myArray);
	        System.out.println("The highest number is: " + result);
}
}