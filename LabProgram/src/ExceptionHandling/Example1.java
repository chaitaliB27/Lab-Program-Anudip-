package ExceptionHandling;
/*Exception is something that occur out of the ordinary.
 * In java program,exception is occur when JWM does not execute all the lines of code in the code.
 * It terminate program in between due to some error code.This known as exception.
 * 
 *  Definition:Exception is the abrupt termination of the program without reaching the end point. 
 * 
 * when an exception occurs,i.e,jvm terminate the program abruptly one of the exception class
 * object is created at the error code.
 * As developer we need to know to handle such abrupt interruption and get the program to be 
 * executed to the last line of code.
 * 
 * This is done by Exception handling 
 * 
 */
public class Example1 {

	public static void main(String[] args) {
     System.out.println("Hello EveryOne!!");
     
     System.out.println("Today is the the first day of the week!");
     /*Below we are handling the exception using try and catch block.
      * try block:used to write any code where exception is occur.
      * 
      * catch block:the exception occuring the try block is caught by 
      * catch block,hence JVM will not terminate the program.
      */
      try {
    	  int div=10/0;
    	  
      }
      catch(Exception e) {
    	  System.out.println("An exception has occured!!");
    	  e.printStackTrace();
    	  System.err.println("Reson for exception............."+e.getMessage());
      }
      
      for(int i=1;i<=10;i++) {
    	  System.out.println(i+" ");
    	  
      }
     System.out.println("\nbye everyone");
	}

}
