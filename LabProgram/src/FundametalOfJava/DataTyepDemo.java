package FundametalOfJava;
/*
 * DataType:In Java,They are of different sizes and values that can be stored in the variable 
 * that is made as per convenience and circumstances to cover up all test cases. 
 * Java has two categories in which data types are segregated: 
    1.Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
    2.Non-Primitive Data Type or Object Data type: such as String, Array, etc.
 */
import java.util.Scanner;
public class DataTyepDemo {
public int add(int num1,int num2) {
		return num1+num2;
	}
	public static void main(String [] args) {
		
    	Scanner sc = new Scanner (System.in); 
		DataTyepDemo pd=new DataTyepDemo();
		
	    System.out.println("Enter the first number: "); 
	    int i= sc.nextInt();//int is data type
	    
	    System.out.println("Enter the Second number: "); 
	    int j= sc.nextInt();
		int total=pd.add(i, j);
		System.out.println("Addtion of number:"+total);
		
	}
}
