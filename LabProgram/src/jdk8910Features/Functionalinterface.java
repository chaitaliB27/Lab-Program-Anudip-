package jdk8910Features;
/*
 * Functional interface is any interface having only one abstract method
 * Ii is called as sam(single abstract method) interface.
 * 
 */
interface Printable{
	
	public void print();
}
public class Functionalinterface {

	/*
	 * lambda expression is a quick way of giving implemetion to an 
	 * abstract method of a functional interface
	 * 
	 * syntax:-
	 * functionalInterfaceName variable=(parameters)->{};
	 * 
	 */
		public static void main(String[] args) {
			Printable p=()->{
				System.out.println("This is the implemenatation given in lambda expression");
			};
		   p.print();
		// TODO Auto-generated method stub

	}

}
