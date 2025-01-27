package javaBasic1;

public class Pattern2 {
public static void main(String[]args) {
	int i,j=0;
	for(i=0;i<5;i++) {
		for(j=0;j<5;j++) {
			if(i==0||i==4||j==0||j==4) {
				System.out.print("*");
			}
			else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
}
}
