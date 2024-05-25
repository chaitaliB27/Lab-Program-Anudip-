package stringProgram;

public class CompareTo {

	public static void main(String[] args) {
		/*
		 * compareTo method will subtract the ascii value of each letters one at
		 * a time.
		 * As soon as it finds that the result is any value other than 0 its stop
		 * and return the result of the subtraction.
		 */
		String s1 = "Mom";
		String s2 = "Tom";
		// 77 84
		int i = s1.compareTo(s2);
		int k = s2.compareTo(s1);
		System.out.println("i: " + i);
		System.out.println("k: " + k);
		
		
		String t1 = "Jinny";
		String t2 = "Jonny";
		// 105 111
		int j = t1.compareTo(t2);
		int l = t2.compareTo(t1);
		System.out.println("j: " + j);
		System.out.println("l: " + l);
	}

}
