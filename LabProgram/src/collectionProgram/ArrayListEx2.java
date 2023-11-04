package collectionProgram;
//nested class
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/*question:
 * what is iterator
 * what is use of iterator method and interface.
 *  what is different between iterator and array iterator?
 */
public class ArrayListEx2 {
/*iterator is an interface used to iterate the member of the collection.
 * It can be used to fetch data from any type of collection.
 *  Iterator interface implement object is created with the method iterator().
 *  
 *  
 *  
 *  ListIterator is also an interface used to iterate member of the collection
 *  It can be used to fetch data only from those collection classes that implement 
 *  List interface
 */
	public static void main(String[] args) {
		ArrayList<Integer> rollNo=new ArrayList<Integer>();
		rollNo.add(2);
		rollNo.add(25);
		rollNo.add(289);
		rollNo.add(278);
		
		Iterator<Integer> it=rollNo.iterator();//upcasting.object  itr class is created 
		//when we call iterator() method.
		//itr class implements iterator interface.hence we are doing upcasting over here.
		System.out.println("Using Iterator:-");
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			ListIterator<Integer>li=rollNo.listIterator();
			System.out.println("\nUsing Listiterator from start to end:");
			while(li.hasNext()) {
				System.out.println(li.next());
				
			}
			System.out.println("\nUsing Listiterator from end to start:");
			ListIterator<Integer>rev=rollNo.listIterator(rollNo.size());
			while(rev.hasPrevious()) {
				
				System.out.println(rev.previous());
			}
		}
	}


