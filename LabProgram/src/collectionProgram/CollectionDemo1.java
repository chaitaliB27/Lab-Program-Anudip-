package collectionProgram;
/*Collection is predefined class used to rearrange and manipulate the member
 * of the list.
 * By default list implement classes such as arrayList ,linked list etc does not 
 * sort our member,hence in order to achieve sorting we use this collection class.
 * 
 * collection is a singleton class meaning we will not be able to create its object 
 * 
 * All method of the collection is static method
 */

//when we call collections method that null value is not accept.
import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo1 {
public static void main(String[] args) {
	//Collections.sort=will sort the member in natural order.
	//collections.shuffle=will randomly shuffle in the member.
	//Collections.reverse=will give the mirror image of the list.
	ArrayList<String> names=new ArrayList<String>();
	names.add("Chaitali");
    names.add("MOhini");
    names.add("rutu");
    names.add("Yash");
    
    names.add("Chaitali");
    System.out.println("Before the sorting");
    
    Collections.sort(names);
    System.out.println("After the sorting"+names);
    
    Collections.shuffle(names);
    System.out.println("After the shuffle"+names);
    
    Collections.reverse(names);
    System.out.println("After the reverse"+names);
    
    Collections.sort(names,Collections.reverseOrder());
    System.out.println("\nAfter reverse sorting:"+names);
}
}
