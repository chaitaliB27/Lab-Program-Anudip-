package FundametalOfJava;
/*An instance variable is a variable that is specific to a certain object. 
 * It is declared within the curly braces of the class but outside of any method. 
 * The value of an instance variable can be changed by any method in the class, but it is not 
 * accessible from outside the class.
 * It is store in heap memory. 
 * Initialization of an instance variable is not mandatory.
 */
public class InstanceVariable {
	int num=100;//num is instance variable 
	String institute="anudip";
	String course="java";
	public void display() 
	{   System.out.println("num:"+num);
		System.out.println("institute:"+institute);
		System.out.println("course:"+course);
		}
public static void main(String [] args) 
	{InstanceVariable iv=new InstanceVariable();
		System.out.println("num:"+iv.num);
		System.out.println("institute:"+iv.institute);
		System.out.println("course:"+iv.course);
		System.out.println("\n\ncalling the display method: ");
		iv.display();
	}
}
