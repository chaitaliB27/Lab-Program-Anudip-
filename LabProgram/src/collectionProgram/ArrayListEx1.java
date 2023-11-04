package collectionProgram;
import java.util.ArrayList;
//Default value of ArrayList is null.
public class ArrayListEx1 {
/*Properties of ArrayList:
 * 1.insertion order is maintained
 * 2.members are not sorted.
 * 3.Null value allowed.(when we call collection method on arrayList object that time null value is not accept.)
 * 4.Duplicates are allowed
 */
public static void main(String[] args) {
			ArrayList<String> names = new ArrayList<String>();
			names.add("Kartik");
			names.add("Chaitali");
			names.add("Akash");
			names.add("Mayur");
			names.add("Mohini");
			names.add(null);
			names.add("Akash");
			
			System.out.println("Directly: "+names);
         
         System.out.println("\nUsing for loop");
         for(int i=0;i<names.size();i++) {
        	 
        	 System.out.println(names.get(i));
         }
         System.out.println("\nUsing foreach loop");
         for(String n:names) {
        	 
        	 System.out.println(n);
         }
	}

}
