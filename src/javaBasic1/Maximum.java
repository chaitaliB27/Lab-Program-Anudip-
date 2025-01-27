package javaBasic1;
import java.util.Scanner;
public class Maximum {
	public void ismax(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println("a is maximum");
		}
		else if(b>a&&b>c) {
			System.out.println("b is maximum number");
		}
		else {
			System.out.println("c is maximum number");
		}
	}
	
public static void main(String[]args) {
	int a,b,c;
	System.out.println("Enter the three number:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	Maximum m=new Maximum();
	m.ismax(a, b, c);
	sc.close();
}
}
