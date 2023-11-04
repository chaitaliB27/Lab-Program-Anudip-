package ExceptionHandling;
/*When an exception occurs We have to handle it so that our program does not get terminated in between.
 * If an exception occurs in our method but We do not want to handle it there then We can use throws keyword
 * to declare the exception so that anyone who calls our method has the responsibility to handle the
 * exception.
 * 
 * Note:-
 * With throws keyword We are NOT handling our exception We are simply declaring the exception.
 * If the caller method does not handle the exception while calling our method then the program will
 * terminate suddenly without reaching its last line.
 * 
 */
class Demo{
	public void databaseConnectivity() throws ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");

}
}
public class ThrowsEX1 {

	public static void main(String[] args) throws ClassNotFoundException {
       System.out.println("hello everyone!!");
       Demo d=new Demo();
       try {
       d.databaseConnectivity();
       }
       catch(Exception e) {
    	   System.out.println("An exception occured!!");
       }
	}

}

