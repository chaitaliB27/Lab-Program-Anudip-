package array;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		/*
		 * Create an array of int type size 5.
		 * Take user input to add data in the array.
		 * Now sort the array in ascending order. 
		 * 
		 * int[] a = {80, 2, 61, 12, 100};
		 * a = {2, 12, 61, 80, 100};
		 */
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter any 5 numbers...");
	        for (int i = 0; i < num.length; i++) {
	            //System.out.print("Enter number: " );
	            num[i] = sc.nextInt();
	        } 
	        for (int j=0; j<num.length; j++) {
	        	
	            for (int k=j+1; k<num.length; k++) {
	            	
	            	int temp = num[j];
	                if (num[j]>num[k]) {
	                    
	                    num[j] = num[k];
	                    num[k] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted array in ascending order:");
	        for(int n:num) {
	        	
	        	System.out.println(n);
	        }
	}
}
