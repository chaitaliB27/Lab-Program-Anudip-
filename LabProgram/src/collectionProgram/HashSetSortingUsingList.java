package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*HashSet does not maintain the order of its element .Hence sorting of Hash set is not possible.
 * Therefore the element of hashset sorted indirectly by converting into list 
 *
 */
public class HashSetSortingUsingList {
public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("Yash");
	set.add("Mohini");
	set.add("Chaitali");
	set.add("Rutu");
	set.add("Devika");
	set.add("Rahul");
	System.out.println("Before Sorting:"+set);
	List <String> l=new ArrayList <String>(set);
	Collections.sort(l);
	System.out.println("After Sorting Using List:"+l);
}
}
