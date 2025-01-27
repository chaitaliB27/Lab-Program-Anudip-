package javaBasic1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListRetrive {
	public static void main(String []args) {
	ArrayList<Integer> rollNo = new ArrayList<>();
	rollNo.add(01);
	rollNo.add(11);
	rollNo.add(22);
	rollNo.add(33);
	rollNo.add(44);
	
	Iterator<Integer> it = rollNo.iterator();
	System.out.println("Using Iterator");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	int index =rollNo.indexOf(22);
	System.out.println("index of 22:"+index);
	int indexOfREplace=3;
	int replacement=66;
	rollNo.set(indexOfREplace,replacement );
	System.out.println("After replacement:"+rollNo);
	
			
}
}