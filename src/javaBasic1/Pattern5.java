package javaBasic1;

public class Pattern5 {
public static void main(String[]args) {
	int i,j=1;
	int n=5;
	for(i=n;i>=1;i--) {
		for(j=1;j<i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
