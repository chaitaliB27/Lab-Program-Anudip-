package javaBasic1;
import java.util.Scanner;
public class Panlindrome {
public int isreverse(int n) {
	int reverse=0;
	int reminder=0;
	while(n>0) {
		reminder=n%10;
		reverse=reverse*10+reminder;
		n=n/10;
		}
	return reverse;
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	Panlindrome p=new Panlindrome();
	int result=p.isreverse(n);
	if(result==n) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("It is not palindrome");
	}
	sc.close();
}
}
