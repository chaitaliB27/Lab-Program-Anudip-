package abstractclass;
/*Abstraction is another pillar of OPPs concept.
 * Abstraction is a process of hiding the implementation detail and showing only functionality
 * to the user.
 * 
 * In java,Abstraction achieve using two ways:
 * 1)Using class(0 to 100)%
 * 2)Interface(100%)
 * 
 * Abstract class:
 * 1)A class which declared as abstract is known as an abstract class
 * 2)An abstract class must be declared with an abstract keyword.
 * 3)It can have abstract and non-abstract methods.
 * 4)we cannot make the object of abstract class because our class is incomplete since it has abstract methods.
 * 5)We can create constructor of abstract class and we can declare static variable in abstract class
 * 6)We can create a final method in abstract class but any abstract method in class can not 
 * declared as final.If we try then get error:"illegal combination of modifier".
 * 7)Implementation of all abstract method is provide by child class of that abstract class.
 */
abstract class Robot1{
public void talking() {
	System.out.println("The robot id coding...");
}
public void cleaning() {
		System.out.println("The robot is cleaning..");
	}
public abstract void dancing();
	}
class sanketrobot extends Robot1{
	public void dancing()
   {
	System.out.println("My robot doing the break dance.");
	}
}
class pratimarobot extends Robot1{
	public void dancing() 
	 {
System.out.println("My robot doing the bharatnatym.");
}
}
public class AbstractclassDemo {
	public static void main(String[] args) {
		sanketrobot sr=new sanketrobot();
		sr.talking();
		sr.cleaning();
		sr.dancing();
		
		pratimarobot pr=new pratimarobot();
		pr.talking();
		pr.cleaning();
		pr.dancing();
		
	}
}
