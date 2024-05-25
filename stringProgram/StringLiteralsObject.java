package stringProgram;

public class StringLiteralsObject {

	public static void main(String[] args) {
		
		String s = "Anudip"; // using String literals
		/*
		 * making String object with new keyword
		 * We have called the empty constructor to make this object
		 */
		String s1 = new String(); 
		
		System.out.println("s = " + s);
		System.out.println("s1 = " + s1 );
		/*
		 * Below we are calling the parameterized constructor, passing String
		 * value
		 */
		String s2 = new String("Java");
		System.out.println("s2 = " + s2);
		/*
		 * Again calling parameterized constructor which accepts String type data
		 */
		String s3 = new String(s);
		System.out.println("s3 = " + s3);
		
		char symbols[] = {'*', '&', '%', '$'};
		/*
		 * Below we are making the object of the String class by calling the
		 * constructor which accepts a character type array.
		 * When we print s4 we can see that all the characters of the array has
		 * been added as one single string in s4
		 */
		String s4 = new String(symbols);
		System.out.println("s4 = " + s4);
	}

}
