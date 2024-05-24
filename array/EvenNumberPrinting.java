package array;

import java.util.Scanner;

public class EvenNumberPrinting {

	public static void main(String[] args) {
		/*
		 * Create an array of int type of size 5. Take user input to add data
		 * into this array. Print only the even members of the array.
		 */
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any 5 numbers...");
		for(int i=0; i<num.length; i++) {
			
			System.out.print("Enter number: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("\nPrinting all even numbers... ");
		for(int i=0; i<num.length; i++) {
			
			if(num[i]%2==0) 
				System.out.println(num[i]);
		}
	}
}