package javaBasic1;
import java.util.Scanner;
public class PrimeNumber {
int rem=1;
public void isPrime(int n) {
int i;
int result=1;
for(i=2;i<=Math.sqrt(n);i++) {
 result=n%i;
}
	if(result==0) {
		System.out.println("number is not prime");
	}
	else {
		System.out.print("number is prime");
	}
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter thr number:");
	int number=sc.nextInt();
	PrimeNumber pn=new PrimeNumber();
	pn.isPrime(number);
	sc.close();
}
}
