package javaBasic1;

public class ReverseNimap {
public static void main(String[] args) {
	String s="Chaitali";
	String nstr="";
	for(int i=s.length()-1;i>=0;i--) {

		char ch;
		ch=s.charAt(i);
		nstr=nstr+ch;
	}
	System.out.println(nstr);
}
}
