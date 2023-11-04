package collectionProgram;
import java.util.PriorityQueue;
public class PriorityQueueEx1 {
	/*
	 * PriorityQueue class implements Queue interface.
	 * 
	 * Properties:-
	 * 1) It does not follow FIFO,by default the member having least priority will be deleted first.
	 * 2) Null values are not allowed.
	 * 3) Insertion order is not maintained.
	 * 4) Members are not sorted.
	 * 5) Duplicates are allowed.
	 * 6) Only those classes which have implemented Comparable can be added to PriorityQueue.
	 * Otherwise We will have to use Comparator.
	 */
	public static void main(String[] args) {
		
	
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	pq.add(1040);
	pq.add(24);
	pq.add(6);
	//pq.add(null); //this will give NullPointerException
	pq.add(117);
	pq.add(35);
	pq.add(17);
	
	System.out.println(pq);
	
	pq.poll();
	
	System.out.println("\nAfter polling:\n"+pq);
}
}