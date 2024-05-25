package stringProgram;

import java.util.Scanner;

public class CountingOfVowel {

	public static void main(String[] args) {
		/*
		 * count the number of vowels in the word given by user.
		 */
		System.out.print("Enter any words: ");
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); // Java Program
		
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			
			char ch = word.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='o' || ch=='O') {
				
				count++;
			}
			
		}
		
		System.out.println("The number of times vowels are used are: " + count);
	}

}
