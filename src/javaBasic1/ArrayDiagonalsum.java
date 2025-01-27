package javaBasic1;

public class ArrayDiagonalsum {
public static void main(String[] args) {
	int [][] a= {
			{8,12,45,67},{56,78,23,45},{1,22,67,89},{45,67,23,16}
	};
	int pd=0;int sd=0;int n=4;
	for(int k=0;k<n;k++) {
		for(int l=0;l<n;l++) {
			if(k==l) {
				pd=pd+a[k][l];
			}
			if((k+l)==(n-1)){
				sd=sd+a[k][l];
			}
		}
		
	}
	System.out.println("Sum of principal Diagonal:"+pd);
	System.out.println("Sum of secondary Diagonal:"+sd);
}
}
