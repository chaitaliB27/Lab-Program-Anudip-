package statementandloop;

import java.util.Scanner;

/*In java,o-while loop is used to iterate a part of the program repeatedly, until the specified 
 * condition is true. If the number of iteration is not fixed and you must have to execute the 
 * loop at least once, it is recommended to use a do-while loop.
 * 
 *Syntax:
 *do{    
 *code to be executed / loop body  
 *update statement   
 *}while (condition);   
 * 
 */
public class DoWhileLoop {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the no.of Student");
	    int studentNo=sc.nextInt();
		
		do {
		System.out.println("Hello Everyone!!welcome to All in Anudip Foundation.");
		}
    while(studentNo>30);
		sc.close();
	}

}
