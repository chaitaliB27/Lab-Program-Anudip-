package abstractclass;
/*final keyword is used to make final meaning its value or behavior 
 * cannot be changed once it is declared final.
 * 
 */
class Demo1{
	final int i=100;
	int j=200;
	public void display() {
		//i=200;Here we are unable to reassign the value to final variable
		System.out.println("We are unable to reassign the value to final variable");
		j=300;
	}
}
public class FinalForVariable {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		//d1.i=100;
		d1.display();
		d1.j=399;
		}
	}
