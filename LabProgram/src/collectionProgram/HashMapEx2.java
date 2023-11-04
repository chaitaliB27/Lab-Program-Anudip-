package collectionProgram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("Maharashtra","Mumbai");
	hm.put("Gujrat","Gandhinagar");
	hm.put("kerala","Trivandrum");
	hm.put("Tamil nadu","Chennai");
	System.out.println("Getting all key of the HashMap....");
	Set<String>states=hm.keySet();
	System.out.println("States:"+states);
	
	System.out.println("Getting all value of HashMap....");
	Collection<String>cities=hm.values();
	System.out.println("Cities:"+cities);
	/*Map.Entry is a nested interface inside the Map interface.
	 * 
	 */
	System.out.println("\nGeeting each pair seperatly in a set");
	Set<Map.Entry<String,String>>pairs=hm.entrySet();
	Iterator<Map.Entry<String,String>> it=pairs.iterator();//map is interface and inner inner interface is Entry

	while(it.hasNext())
		System.out.println(it.next());
}
}
