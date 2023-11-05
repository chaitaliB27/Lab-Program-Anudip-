package jdk8910Features;
/*
 * interface=force for overriding(implement) 
 * when method body is present then ,they is not force for overriding(implement)
 * 
 * Default method=upto jdk7 we were able to make only abstract method in an interface,
 * due to which any class that implements an interface had to give implementation to
 * all the abstract methods.
 * 
 * but in jdk8 the concept of default method had been intriduced in java.Now we 
 * can make method having its own implementation inside the interface itself.
 * we make such methods by declaring it with keyword default.
 * 
 * Any child class which implements the interface having default method do 
 * not have to override the default method again.
 * 
 */
interface Camera{
public void clickPic();
public void flask();
default public void panorama() {// This is default method.
System.out.println("Taking long panormic pics!");
	 }
}
class Nikon implements Camera{
@Override
	public void clickPic() {
		System.out.println("Clicking pic");
	}
	@Override
	public void flask() {
		System.out.println("flask is on!!");
			}
	}
public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		Nikon n=new Nikon();
		n.panorama();
		n.clickPic();
		n.flask();
}
}
