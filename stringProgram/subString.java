package stringProgram;

public class subString {

	public static void main(String[] args) {
		
		String address = "Andheri West, Azad Nagar";
		String s1 = address.substring(8);
		String s2 = address.substring(8, 12);
		
		System.out.println("Address: " + address);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}

}
