package FundametalOfJava;
/*When methods and data members are declared protected, 
 * we can access them within the same package or subclasses in different packages.. 
 */
class Dog {
    protected void display() {//It is protected method.
        System.out.println("I am an Dog");
    }
}

public class ProtectedAccessModifier extends Dog{//It is subclass of dog.we can access protected 
//in subclass.	

	public static void main(String[] args) {
		ProtectedAccessModifier p = new ProtectedAccessModifier();
         // access protected method
        p.display();

	}

}
