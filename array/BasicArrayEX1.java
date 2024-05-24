package array;

public class BasicArrayEX1 {

	public static void main(String[] args) {
		/*
		 * Arrays is an objects of fixed size used to store a group of objects or
		 * values of the same  datatype.
		 * 
		 * Points to remember:-
		 * 1) Sized is fixed. We cannot add more than size at runtime.
		 * 2) Arrays accept all data of the same datatype.
		 * 3) All members have indexes starting from 0 to length-1.
		 * 4) We add and retrive members by using its indexes.
		 */
		int rollNo = 10;
		int[] allRollNo = new int[5];
		
		allRollNo[0] = 101;
		allRollNo[1] = 102;
		allRollNo[2] = 103;
		allRollNo[3] = 104;
		allRollNo[4] = 105;
		
		
		System.out.println(allRollNo);
		System.out.println(allRollNo[2] + "\n");
		
		for(int i=0; i<allRollNo.length; i++) {
			
			System.out.println(allRollNo[i]);
		}
	}

}
