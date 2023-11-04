package collectionProgram;

import java.util.TreeMap;
/*Properties:
 * 1)sorting natural alphabet order.
 * 
 */
public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<String, Double> tm=new TreeMap<String,Double>();
		tm.put("Chaitali",45.00);
		tm.put("Mohini",60.00);
		tm.put("Rutu",95.00);
		tm.put("Devika",85.00);tm.put("Chaitali",45.00);
		System.out.println(tm);
	}

}
