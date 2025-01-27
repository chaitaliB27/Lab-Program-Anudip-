package javaBasic1;

import java.util.Scanner;

public class LargestElements {

	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println("Enter the five number:");
		Scanner sc=new Scanner(System.in);
		int i=0;
		int max=arr[0];
		for(i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		}
		for(int m:arr) {
			System.out.println(m);
		}
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i]<max) {
				max=arr[0];
			}
			
		}
		System.out.println(max);

	}

}
