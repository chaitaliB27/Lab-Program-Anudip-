package ExceptionHandling;
/*Error is also a child class of Throwable.
 * Errors occurs on code that are dangerous or very serious and these codes should not be handled by
 * try catch. They have to be reactified and solved immediately.
 */
class EDemo1{
	// This will create StackOverflowError because the method display() is called infinitely
	public void display() {
		display();//we can display in display method therefore stack run for infinite time.
	}
}
public class ErrorDemo {

	public static void main(String[] args) {
		// new EDemo1().display(); ---> StackOverflowError
		
				//This will create OutofMemoryError because the array size is too big
				// int[] arr = new int[1000000000]; ---> OutOfMemoryError
		}

}
