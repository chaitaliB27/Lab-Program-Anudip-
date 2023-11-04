package ExceptionHandling;
import java.util.Scanner;

class AgeInvalidToVoteException extends Exception{
	
	public AgeInvalidToVoteException() {
		
		System.out.println("Age is not vaild because your age below 18");
	}
 //getMessage method always returns the reason for the execption to occur.
	
	
	public String getMessage() {
		
		return "AGE too low";
	}
	public String toString() {
		return "execption Program.AgeInvalidToVoteException:Age too low";
		}
}
class Age{
	int age=18;
	public void check(int ageN) throws AgeInvalidToVoteException {
		if(age>ageN) {
			
			throw new AgeInvalidToVoteException();
			}
		else {
			age=ageN;
			
			System.out.println("Valid age for voting:"+ageN);
			
		}		}
		
	}
public class UserDefineExceptionP {

	public static void main(String[] args) {
		Age a=new Age();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the aget:");
		
		int ageU=sc.nextInt();
		try {
			a.check(ageU);
			
		}
		catch(AgeInvalidToVoteException e)
		{
		 e.printStackTrace();
			
		}

	}

}
