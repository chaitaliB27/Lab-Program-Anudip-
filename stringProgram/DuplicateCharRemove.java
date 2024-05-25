package stringProgram;

import java.util.Scanner;

public class DuplicateCharRemove {

	public static void main(String[] args) {
		
		System.out.println("Enter any word...");
		
		String s = new Scanner(System.in).nextLine();
		/*Duplicate Char remove
		 * Write a program to remove all the duplicate letter of this words
		 * happy birthday
		 */
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					arr[i] = ' ';
				}
			}
		}
		
		s = new String(arr);
		s = s.replace(" ", "");
		
		System.out.println(s);
	}

}
