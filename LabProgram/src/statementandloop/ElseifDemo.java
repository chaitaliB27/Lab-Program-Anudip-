package statementandloop;
import java.util.Scanner;
/*Java if-else-if ladder is used to decide among multiple options. 
 * The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, 
 * the statement associated with that if is executed, and the rest of the ladder is bypassed. 
 * If none of the conditions is true, then the final else statement will be executed.
 * 
 */
public class ElseifDemo {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your Number 1:");
	     int num1 = sc.nextInt();
	     System.out.println("Enter your Number 2:");
	     int num2 = sc.nextInt();
	     System.out.println("Enter your Number 3:");
	     int num3 = sc.nextInt();
       if (num1>num2 && num1>num3) {
       	System.out.println(num1+":is Maximum number of three given number.");
       	}
   		else if(num2>num1 && num2>num3) {
       	System.out.println(num2+":is Maximum number of three given number.");
       	}	
       else{
       	
       	System.out.println(num3+":is Maximum number of three given number.");
       }
       sc.close();
}  	

}
   	
   	
   	
   	
   	

	


