package statementandloop;
/* while loops are type of loop used to execute repetitive task.
 * we use for loop when we know the exact number of times that we want to repeat a task.
 * while loop is used when we do not know  how many the task needs to be repeated.
 * 
 *Syntax:
 *  while(condition)
 *  repetitive task
 *  increment and decrement
 * 
 */
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);  
	    System.out.println("Enter the number: "); 
	    int num=sc.nextInt();
	    int count=0;
	    while(num>0) {
	    	num=num/10;
	    	count++;
	   }
	    System.out.println("count of number:"+count);
        sc.close();
	}

}
