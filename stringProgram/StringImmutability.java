package stringProgram;
/*
 * String immutability is the ability of Strings to not change the original 
 * object.
 * Once a String object is created in SCP memory then we will not be able to 
 * change this object. If we try to concat or make any other change then a new
 * String object is created.
 * 
 * We can refer this new String object by a new variable or use the same old
 * reference to now point to new object.
 */
public class StringImmutability {

	public static void main(String[] args) {
		
		String name1 = "Kartik";
		String name2 = "Kartik";
		
		System.out.println("Are name1 and name2 referring to same object: " 
		+ (name1 == name2));
		System.out.println("Before: \n name1 = " + name1 + "\n name2 = " + name2);
		
		name1 = name1.toUpperCase(); // same name1 variable will now refer to new object
		// String s = name1.toUpperCase(); we have created new variable s to refer to the new object
		
		System.out.println("\n Are name1 and name2 referring to same object: " + (name1 == name2));
		System.out.println("After: \n name1 = " + name1 + "\n name2 = " + name2);

	}

}
