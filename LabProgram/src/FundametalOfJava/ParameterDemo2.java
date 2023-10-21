package FundametalOfJava;
import java.util.Scanner;
public class ParameterDemo2 {
	/*String name and String email are method parameter when we call to method that time
	 * we always pass the same data type of parameter.
	 */
	 public static String taking(String name, String email) {
		    return "\nThe name"+name+"\nEmail:"+email;
		    }
	  public static void main(String[] args) {
	  ParameterDemo2 pd2 = new ParameterDemo2();
	     Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Name: ");
	    String name = sc.next();
	    System.out.println("Enter the email: ");
	    String email = sc.next();
/*below we was create String data type variable for to store String message from return statement
 * of method
 */
	     String message=pd2.taking(name, email);
	     System.out.println("message:"+message);

	  }
}
