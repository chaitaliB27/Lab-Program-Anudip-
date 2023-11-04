package collectionProgram;

import java.util.HashSet;

/*
 * HashSet implements Set interface.
 * 
 * Properties of HashSets : 
 * 1]  Duplicates are not allowed.
 * 2]  Insertion order not maintained.
 * 3]  Members are not sorted.
 * 4]  Only one null value is allowed.
 * */
public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Pen");
		hs.add("Eraser");
		hs.add("Shapner");
		hs.add(null);
		hs.add(null);
		hs.add("Protractor");
		hs.add("Scale");
		hs.add("Shapner");
		hs.add("Protractor");
		hs.add("Scale");
		System.out.println(hs);

	}

}
