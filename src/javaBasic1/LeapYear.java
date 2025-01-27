package javaBasic1;
import java.util.Scanner;
public class LeapYear {
public void isLeapYear(long n) {
		if(n%4==0) {
			System.out.println("Leap year");
			
		}
		else {
			System.out.println("It is not Leap year");
		}
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Year:");
	long year=sc.nextLong();
	LeapYear ly=new LeapYear();
	ly.isLeapYear(year);
	sc.close();
}
}
