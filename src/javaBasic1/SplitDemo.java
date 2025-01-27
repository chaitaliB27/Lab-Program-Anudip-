package javaBasic1;

public class SplitDemo {
	public static void main(String[] args) {
		
		String institute="Anudip Foundation";
		
		boolean a=institute.startsWith("An");
		boolean b=institute.startsWith("on");
		boolean c=institute.endsWith("on");
		boolean d=institute.endsWith("An");

	    System.out.println(" "+a);
	    System.out.println(" "+b);
	    System.out.println(" "+c);
	    System.out.println(" "+d);
	}
}
