package ExceptionHandling;
/*Object class is the parent of all Java classes.
* 
* In Java whenever an exception occurs JVM creates one of the exception class object.
* 
* Let's see Exception Hierarcy:-
* Object
* Throwable class: This is the parent of all Error and Exception class
* 
* Error class: This class has many child classes whose objects are created at serious error codes.
* As developer We need to solve those errors. We should not handle them using try catch.
* Examples: StackOverflowError, OutOfMemoryError
* 
* Exception class: This is the parent of many exception type classes. These exception occur at error code
* which are not that serious. Hence We can simply handle them using try catch.
* Examples: ArithmeticException, ArrayIndexOutofBoundsException, NullPointerException,
* ClassNotFoundException
* 
* Types of Exception: -
* Run-time Exception: All sub-classes of the RuntimeException class is also known as of type Run-time 
* Exception.
* These exceptions are not checked by the compiler while compiling the code. We as developer come to know 
* that such exceptions are occurring only after We run the program.
*/
public class ExceptionTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Below we are trying to call a method on null value hence at the line where we call chatAtmethod
		 *JVm will create the object of null pointerException class and terminate our program.
		 *
		 * We can handle this exception by writing try and catch block.
		 */
		System.out.println("Welcomr to this progarm");
		String s=null;
		try {
		  System.out.println(s.charAt(2));
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Thank you for using our appliction");
	}

}
