package stringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TestAlphabetsOrder {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name=sc.nextLine();
	char arr[]=name.toCharArray();
	char temp=0;
	for(int i=0;i<arr.length;i++) {
		
		Arrays.sort(arr);	
	}

	for(int i=arr.length;i<0;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;			
			}
		}
	}
	System.out.println("Alphabets order are as follow... ");
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]+"");
	}

	}

}