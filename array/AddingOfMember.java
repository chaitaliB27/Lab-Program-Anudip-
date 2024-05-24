package array;

public class AddingOfMember {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		/*
		 * Create a new int type array b of size 5.
		 * The members should be double of the member in array a
		 */
		int[] b = new int[5];
		System.out.println("The numbers of b array are...");
		for(int i=0; i<a.length; i++) {
			
			b[i] = a[i]*a[i]; // adding the members into the b array
			System.out.println(b[i]); // printing the member of b array
		}
	}

}
