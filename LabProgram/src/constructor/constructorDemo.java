package constructor;
/*A constructor in Java is a special method that is used to initialize objects.
 *The constructor is called when an object of a class is created. 
 *It can be used to set initial values for object attributes. 
 * 
 * 
 * It is not necessary to write a constructor for a class. 
 * It is because the java compiler creates a default constructor (constructor with no arguments) 
 * if your class doesn’t have any.
 * 
 * Rules:
 * 1.Constructors must have the same name as the class within which it is defined it.
 * 2.Constructors do not return any type.
 * 3.Constructors are called only once at the time of Object creation.
 * 
 * Types of Constructors in Java:
 * 1.Default Constructor:A constructor that has no parameters is known as default the constructor. A default constructor 
 * is invisible. And if we write a constructor with no arguments, 
 * the compiler does not create a default constructor. 
 * 
 * 2.Parameterized Constructor:A constructor that has parameters is known as parameterized 
 * constructor. If we want to initialize fields of the class with our own values, 
 * then use a parameterized constructor.
 */
public class constructorDemo {
public constructorDemo() {
		System.out.println("this is non parameterised constructor. ");
	}
	public constructorDemo(String s) {
		System.out.println("this is parameterised constructor.");
	}
	public constructorDemo(int a,String s) {
		System.out.println("this is two parameterised constructor. ");
	}
	public constructorDemo(int a,String s,long r) {
		System.out.println("this is three parameterised constructor.");
    }
	public static void main(String [] args) {
		constructorDemo c1=new constructorDemo(100,"chaitali",10000);//parameter must same as constructor parameter.
		constructorDemo c2=new constructorDemo();
		constructorDemo c3=new constructorDemo("chaitali");
		constructorDemo c4=new constructorDemo(100,"chaitali");
	}
}
