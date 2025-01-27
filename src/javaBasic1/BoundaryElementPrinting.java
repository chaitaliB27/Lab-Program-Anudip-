package javaBasic1;

public class BoundaryElementPrinting {
public static void main(String[] args) {
	int mat[][]= {
			{1,2,3},{4,5,6},{7,8,9}	
	};
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat.length;j++) {
			if(i==0||j==0||i==mat.length-1||j==mat.length-1) {
				System.out.println(mat[i][j]);
			}else {
				System.out.print(" ");
			}
		}
	}
}
}
