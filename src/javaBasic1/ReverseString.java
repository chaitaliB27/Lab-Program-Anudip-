package javaBasic1;

import java.util.Scanner;

public class ReverseString {
	String nstr=" ";
	char ch;
	public String check(String s) {
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			nstr=ch+nstr;
		}
		return nstr;
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.next();
	ReverseString re=new ReverseString();
	String result=re.check(s);
	System.out.println("reverse string :"+result);
}
}
