package stringProgram;

import java.util.Scanner;

public class SpaceReplacement {

	public static void main(String[] args) {
		/*
		 * 
		 */
		String s = "Hi my name is _. I am from _. I have done graduation "
				+ "in _.";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		System.out.print("Enter the location: ");
		String city = sc.nextLine();
		System.out.print("Enter your ecducation stream: ");
		String branch = sc.nextLine();
		
		s = s.replaceFirst("_", name);
		s = s.replaceFirst("_", city);
		s = s.replaceFirst("_", branch);
		
		System.out.println(s);
		sc.close();
	}

}
