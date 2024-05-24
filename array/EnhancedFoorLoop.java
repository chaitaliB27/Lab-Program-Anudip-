package array;

public class EnhancedFoorLoop {

	public static void main(String[] args) {
		/*
		 * Enhanced for loop is also known as for each loop.
		 * This type of loop is used to fetch data from arrays or collection.
		 * 
		 * Syntax:-
		 * for(arrayDataType var: arrayName){}
		 */
		double[] marks = {78.40, 61.54, 88.40, 84.26};
		System.out.println("Using normal for loop...");
		for(int i=0; i<marks.length; i++) {
			
			System.out.println(marks[i]);
		}
		
		System.out.println("\nUsing enhanced for loop...");
		for(double m:marks) {
			
			System.out.println(m);
		}
	}

}
