package ExceptionHandling;

import java.util.Scanner;

class Demo2{
	public void display() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int div = num1/num2;
		
		System.out.println("Answer= "+div);
		System.out.println("Thanks for using the app");
	}
}
public class ThrowsEx2 {

	public static void main(String[] args) {
		try {
			new Demo2().display();
			}
			catch(Exception e) {
				System.err.println("Sorry could not calculate the division of given numbers....");
			}
			System.out.println("Visit again soon....");

	}

}
