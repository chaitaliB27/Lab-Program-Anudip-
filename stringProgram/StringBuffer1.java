package stringProgram;

class Kartik{
	
	public void display() {
		
		System.out.println("Hello!!!");
	}
}

class Anjali{
	
	public void show() {
		
		System.out.println("Hiii");
	}
}
public class StringBuffer1 {

	public static void main(String[] args) {
		/*
		 * If we want to create mutable object of character sequence then we 
		 * should use StringBuffer or StringBuilder
		 * 
		 * These are also classes that create mutable objects.
		 * 
		 * Concatination is the process of adding words or character to an 
		 * existing string
		 * 
		 * StringBuffer and StringBuilder classes are both to create mutable 
		 * string objects.
		 * The only difference between the two is the StringBuffer is thread safe
		 * whereas StringBuilder is NOT 
		 */
		StringBuffer sb = new StringBuffer("Anudip");
		// These are mutable object String
		
		String s = "Anudip";
		
		System.out.println("Before:");
		System.out.println("s = " + s + "\nsb = " + sb);
		
		s.concat(" Foundation"); 
		/*
		 * In String s value will not change because of these is normal string
		 * and concat method is use only for Normal String class and object
		 */
	
		sb.append(" Foundation");
		
		System.out.println("\nAfter:");
		System.out.println("s = " + s + "\nsb = " + sb);
		
		
		Kartik k = new Kartik();
		Anjali a = new Anjali();
	}

}
