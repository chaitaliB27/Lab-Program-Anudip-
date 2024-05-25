package stringProgram;

import java.util.Scanner;

public class TestCharacterMatching {

	public static void main(String[] args) {
		
		String s = "Anudip Foundation";
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		System.out.print("Enter the character: ");
		String s2 = sc.next();
	
		if(s.contains(s2)) 
				
				System.out.println("Character " + s2 + " is present in the s variable");
			else
				
				System.out.println("Character " + s2 + " is not present in the s variables");
	
	}

}
