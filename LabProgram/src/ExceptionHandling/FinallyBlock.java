package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		FileInputStream fis = null;
		Scanner sc = null;
		
		try {
			fis = new FileInputStream("abc.txt");
			sc = new Scanner(System.in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			System.out.println("Hello World");
			try {
				fis.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
