package stringProgram;

import java.util.Scanner;

public class TestReverseFirstLetterCapital {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		String r ="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			r += s.charAt(i);
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(r.substring(0, 1).toUpperCase());
		sb.append(r.substring(1).toLowerCase());
		System.out.println(sb);
		
	}

}
