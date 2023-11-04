package collectionProgram;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet implements Set interface.
 * 
 * Properties of HashSets : 
 * 1]  Duplicates are not allowed.
 * 2]  Insertion order is maintained.
 * 3]  Members are not sorted.
 * 4]  Only one null value is allowed.
 * */
public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Pen");
		hs.add("Eraser");
		hs.add("Eraser");
		hs.add("Shapner");
		hs.add(null);
		hs.add("Protractor");
		hs.add("Scale");
		hs.add("Shapner");
		hs.add("Protractor");
		
		System.out.println(hs);
		

	}

}
