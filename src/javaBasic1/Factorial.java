package javaBasic1;

import java.util.Scanner;

public class Factorial {
int rem=1;
public int factorialM(int n){
	for(int i=2;i<=n;i++) 
	{
	rem=rem*i;
	}
	return rem;
}
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for factorial:");
	int n=sc.nextInt();
	Factorial f=new Factorial();
	int result=f.factorialM(n);
	System.out.println("factorial of number:"+result);
    sc.close();
}
}