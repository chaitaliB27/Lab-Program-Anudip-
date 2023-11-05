package jdk8910Features;
/*
 * multiple inheritance with interface is allowed.
 * But if all the interface implemented by a class has default methods with exact 
 * same method signature then it become complusory for the class to override the 
 * method and give its own implementation
 * 
 */
interface Template1{
	default public void addCart() {//This is method with same method signature 
		System.out.println("Product added to cart from Template1");
}
}
interface Template2{
	default public void addCart() {//This method is also with same method signature
		System.out.println("Product added to cart form Template2 ");
			}
}
class Amazon implements Template1,Template2{
	//Improtant syntax
	public void addCart() {//therefore we require the give the our own implementation to 
		//method.
		System.out.println("Product add to cart from Amazon!");}
	
}
public class InterfaceDefaultMethodEx2 {

	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.addCart();
	}
}
