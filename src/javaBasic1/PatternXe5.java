package javaBasic1;

public class PatternXe5 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
			for(int j=0;j<=5-i;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
}
}

