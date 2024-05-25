package stringProgram;

public class ToCharArray {

	public static void main(String[] args) {
		
		String s = "Bharat";
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
