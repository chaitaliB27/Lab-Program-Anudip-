package ExceptionHandling;
/*
 * Below We are seeing an example of CompileTime Exception/ Checked Exception.
 * These types of exceptions are checked by compiler and it forces us to handle the exception there
 * itself.
 */
public class CompileTimeException {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println("Driver not found...");
	}
	System.out.println("We have reached the end of this program...");
}
}
