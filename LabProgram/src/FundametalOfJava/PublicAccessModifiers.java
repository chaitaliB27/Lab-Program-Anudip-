package FundametalOfJava;
/*What are Access Modifiers?
 * In Java, access modifiers are used to set the accessibility (visibility) of 
 * classes, interfaces, variables, methods, constructors, data members, and the setter methods. 
 *
 * 
 * Public Access Modifier:When methods, variables, classes, and so on are declared public, 
 * then we can access them from anywhere. The public access modifier has no scope restriction.
 * 
 */
class Animal {
 public int legCount;
   public void display() {
     System.out.println("I am an animal.");
     System.out.println("I have "+ legCount +" legs.");
     }
}

public class PublicAccessModifiers {

	public static void main(String[] args) {
		Animal animal = new Animal();
        animal.legCount = 4;
        animal.display();
	}

}
