package inheritance;
/*
 * Java follow OOPs concept.
 * 1)Inheritance
 * 2)Abstraction
 * 3)Polymorphism:-same name different behavior.
 * 4)Encapsulation:protecting the class /class member by using access specifier.
 *
 *Inheritance= It is the process of inheriting the members of another class into our own class 
 *this is done by making our class the child class of some other  
 * 
 * Parent class is also knows as base class or superclass
 * child class is also know as derived class or sub class.
 * 
 * 
 * Note:-extends keyword used for inheritance.
 * 
 * Type of inheritance:
 * 1)simple inheritance:In this method, simply we are use extends keyword. 
 * 2)multi-level inheritance:one parent and other class child then child class become parent and another class 
 * become the child of that class.  
 * 3)Hierarchical inheritance:one parent and multiple child(meaning one parent can has one or more than one child)
 */
class MobileApp {
	public void textmessage() {
		System.out.println("Sending text message.....");
	}
	public void voicecall() {
		System.out.println("Voice call connecting.....");
	}
}
class myapp extends MobileApp{
	//@override
	public void voicecall1() {//Here we are change the behavior of method
	System.out.println("Voice call connecting.....");
}
}
public class Example1 {
public static void main(String[] args) {
	myapp m=new myapp();//It is called simple inheritance.
		m.textmessage();
}
}
