package jdk8910Features;
/*we can also make private method inside in an interface:
 * uses:
 * 1.to encapsulate some important codes.
 * 2.If we have some line of code which needs to repeated again and again then 
 * we can write it once in private method and call this method wherever we want to 
 * execute the common line of code
 */
interface PrivateDemo{
	private void display() {
		
		System.out.println("Welcome to our interface.");
	}
	default void show () {
		display();
		System.out.println("This is the our show method");
		
	}
	default void add() {
		
		display();
		System.out.println("This is our add method.");
	}
}

public class PrivateInterfaceMethod implements PrivateDemo{

	public static void main(String[] args) {
		PrivateInterfaceMethod p=new PrivateInterfaceMethod();
		p.add();
		p.show();

	}

}
