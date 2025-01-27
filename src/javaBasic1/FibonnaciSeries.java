package javaBasic1;
import java.util.Scanner;
public class FibonnaciSeries {
	int sum;
    public void series(int n){
    	int a=0;
        int b=1;
    	for( int i=0;i<n;i++) {
        sum=a+b;
        a=b;
        b=sum;
        System.out.println("Fibonnaci Series:"+a+" ");
    	}
    }
    public static void main(String[]args) {
    	FibonnaciSeries fs=new FibonnaciSeries();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
    	int number=sc.nextInt();
    	fs.series(number);
        sc.close();
}
}
