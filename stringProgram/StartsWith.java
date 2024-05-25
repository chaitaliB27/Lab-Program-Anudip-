package stringProgram;

public class StartsWith {

	public static void main(String[] args) {
		
		String institute = "Anudip Foundation";
		boolean a = institute.startsWith("An");
		boolean b = institute.startsWith("Ta");
		
		boolean c = institute.endsWith("on");
		boolean d = institute.endsWith("abc");
		
		System.out.println("Does the institute start with An? " + a);
		System.out.println("Does the institute start with Ta? " + b);
		
		System.out.println("Does the institute end with on? " + c);
		System.out.println("Does the institute end with abc? " + d);

	}

}
