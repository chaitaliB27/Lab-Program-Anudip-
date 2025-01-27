package javaBasic1;
import java.util.Scanner;
public class ArraryExample {
	public static void main(String[] args) {
		/*
		 * Write the program to store all the name of student in an array.
		 * Print all member of this array
		 */
	       String []name=new String[8];
	       name[0]="Chaitali";
	       name[1]="Mohini";
	       name[2]="Yash";
	       name[3]="Rahul";
	       name[4]="Devika";
	       name[5]="Rutu";
	       
	       System.out.println("By using Shortcut");
	       String []name1=new String[5];
	       {
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("Please enter the name:");
	    	   for(int i=0;i<name1.length;i++) {
	        	   
	    		   name1[i]=sc.next();
	           }
	    	   for(int i=0;i<name1.length;i++) {
	        	   
	        	   System.out.println(name1[i]);
	       }
	       
		}

	}
}
