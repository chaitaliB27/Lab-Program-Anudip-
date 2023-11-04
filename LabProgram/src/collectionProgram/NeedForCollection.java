package collectionProgram;

import java.util.ArrayList;

public class NeedForCollection {

	public static <ArratList> void main(String[] args) {
		/*Disadvantages of of array
		 * 1.Size is fixed.
		 * 2.Only homogeneous type of data can be Stored in an array
		 * 3.Array dosen't provide much variation or predefined method in it.
		 * searching and other manipulation in an array difficult.
		 * 
		 * Framework:It is a group of predefined classes and interfacing having many predefined
		 * method which can be used and modified according to our requirement.
		 * 
		 * Collection is used to store a group of object.
		 * 1.Its size is not fixed.
		 * 2.we can create homogeneous or heterogeous collection
		 * we get many predefined class due to which we can have different collection having their 
		 * own unique properties. 
		 */
		
		/*Below we have created a hetergenous or non generic collection
		 * Meaning we can add any type of data in it.
		 * Note:
		 * In java this is not preferred .we should usually never make such non generic collection
		 * Because it is doesn't give type safety. 
		 */
		ArrayList myObj = new ArrayList();
		myObj.add("Anudip");
		myObj.add(10);
		myObj.add(9.6);
		myObj.add(true);
		myObj.add('#');
		
		System.out.println(myObj);
	}

}
