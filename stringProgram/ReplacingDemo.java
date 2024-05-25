package stringProgram;

import java.util.Scanner;

public class ReplacingDemo {

	public static void main(String[] args) {
		/*
		 * Take any word from the user.
		 * Create a unique password from it where all
		 * a-->@
		 * e-->3
		 * i-->1
		 * o-->*
		 * u-->$
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String word = sc.nextLine().toLowerCase();
		
		String word2="";
		word2 = word.replace('a', '@');
		word2 = word2.replace('e', '3');
		word2 = word2.replace('i', '1');
		word2 = word2.replace('o', '*');
		word2 = word2.replace('u', '$');
		
		System.out.println("Password: " + word2);
	}

}
