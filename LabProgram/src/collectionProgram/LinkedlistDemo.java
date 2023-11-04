package collectionProgram;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedlistDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("john");
		list.add("amar");
		list.add("sweet");
		list.add("Ujjwal");
		System.out.println("element of list:"+list);
		
		
		Queue<String> list2 = new LinkedList<String>();
		list2.add(null);
		list2.add(null);
		list2.add("Pramod");
		list2.add("Mulayam");
		list2.add("Akash");
		System.out.println("Before:\n"+list2);
		
		list2.add("Chaitali");
		System.out.println("After:\n"+list2);
		
		list2.poll();
		System.out.println("After deleting:\n"+list2);
		
		Deque<String> list3 = new LinkedList<String>();
		list3.add("Amar");
		list3.add("Akbar");
		list3.add("Anthony");
		list3.add("Sejal");
		list3.add("Sahil");
		
		System.out.println("Before:\n"+list3);
		list3.offer("Tiger");
		
		System.out.println("After offer:\n"+list3);
		list3.offerFirst("Pathan");
		System.out.println("After offerFirst:\n"+list3);
		
		list3.poll();
		System.out.println("After poll:\n"+list3);
		
		list3.pollLast();
		System.out.println("After pollLast:\n"+list3);
	}
}
