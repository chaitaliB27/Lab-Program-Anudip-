package stringProgram;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = "Kartik";
		String s2 = "Kartik";
		String s3 = "Kartik Pawar";
		
		System.out.println("s1 Equals s2? " + s1.equals(s2));
		System.out.println("s1 Equals s3? " + s1.equals(s3));
		
		int i = s1.compareTo(s2);
		int j = s1.compareTo(s3);
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);

		if(i==0) // here 0 is true
			
			System.out.println("s1 is exactly same as s2");

		else
			
			System.out.println("s1 and s2 are different");
		
		if(j==0) // here 0 is true
			
			System.out.println("s2 is exactly same as s3");

		else
			
			System.out.println("s1 and s3 are different");
	}

}
