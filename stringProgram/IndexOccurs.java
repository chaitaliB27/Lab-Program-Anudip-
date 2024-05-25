package stringProgram;

public class IndexOccurs {

	public static void main(String[] args) {
		
		String s = "Yellow Umrella";int count=0;
		/*
		 * Write a program to print all the indexes at which l occur
		 */
		
		System.out.println("All the indexes at which l occur are: ");
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch=='l') {
				
				System.out.println(i);
				count++;
				
			}
		}System.out.println("count of l:"+count);
	}

}
