package ExceptionHandling;

import java.util.Scanner;

/*
 * We can make our own exceptions with the following steps:-
 * 1) Our class should be part of the Exception hierarchy. So We should extends our class with either
 * Exception class: - This will make our exception a compile-time exception or
 * RuntimeException class: - This will make our exception a run-time exception.
 * 
 * 2) Make constructors and basic methods in the exception class.
 * 
 * 3) We use throw keyword to specify on which error code our exception should occur.
 */
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		System.out.println("Balance is not sufficient enough to make withdrawal.");
	}
	//getMessage() method always returns the reason for the exception to occur
	@Override
	public String getMessage() {
		return "Balance too low";
	}
	/*
	 * In toString() method We return the fully qualified name of the class and the reason for the exception
	 * to occur as seen below
	 */
	@Override
	public String toString() {
		return "exceptionsPrograms.InsufficientBalanceException: Balance too low";
	}
}

class Account{
	int balance = 1000;
	
	public void withdraw(int withdrawAmount) throws InsufficientBalanceException {
		if (balance<withdrawAmount) {
			throw new InsufficientBalanceException();
			/*
			 * throw keyword is used to forcefully generate an Exception in our program.
			 * Most commonly We use throw keyword when We want to generate our own user-defined exception.
			 */
		}
		else {
			balance -=withdrawAmount;
			System.out.println(withdrawAmount+" has been withdrawn from your account");
			System.out.println("Current balance: "+balance);
		}
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		Account a = new Account();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		int withdrawAmount = scan.nextInt();
		try {
			a.withdraw(withdrawAmount);
			scan.close();
			
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
