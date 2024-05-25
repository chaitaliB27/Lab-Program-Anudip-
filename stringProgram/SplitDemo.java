package stringProgram;

public class SplitDemo {

	public static void main(String[] args) {
		/*
		 * Write a program to count the number of the words in the given string.
		 */
		
		String message = "Hi everyone!! Wekenf is here!!";
		
		String[] arr = message.split(" ");
		
		System.out.println("Number of words: " + arr.length);
		
		/*int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			count ++;
		}
		
		System.out.println(count);*/
	}

}
