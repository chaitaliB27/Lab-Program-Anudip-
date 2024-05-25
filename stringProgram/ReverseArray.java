package stringProgram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		/*
		 * Take the name of user.
		 * Find out the mirror image of the given name.
		 * 
		 * James Gosling
		 * gnilsoG semaJ
		 */
		System.out.print("Enter the name : ");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		String reverse="";
		for(int i=name.length()-1; i>=0; i--) {
			
			reverse = reverse + name.charAt(i) ;
		}
		
		System.out.println("Reverse Word: " + reverse);

	}

}

/*
  for(int i=0; i<name.length();i++) {
			
			reverse = name.charAt(i) + reverse;
		}
*/