package javaBasic1;

import java.util.Scanner;

public class FactorialEx {
	int fact=1;
public int chechk(int n) {
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the any number:");
	int a=sc.nextInt();
	FactorialEx fc=new FactorialEx();
	int result=fc.chechk(a);
	System.out.println("factorial of number:"+result);
}
}
