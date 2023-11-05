package jdk8910Features;
// we can't override a static method in class or interface.
interface calculator{
	default public void add(int i,int j) {
		System.out.println("Answer:"+(i+j));
		}
	//below we create static method therefore we can call method without object of 
	//class.
	static void sub(int i,int j) {
		
		System.out.println("Answer:"+(i-j));
	}
}
public class jdk8StaticMethod {

	public static void main(String[] args) {
		calculator.sub(20, 10);//without object we can class the method using class name
		//This method is static method
		}
}
