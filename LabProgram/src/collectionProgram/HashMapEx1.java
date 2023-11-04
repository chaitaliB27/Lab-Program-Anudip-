package collectionProgram;

import java.util.HashMap;
/*properties:
 * 1)Insertion order is not maintained.
 * 2)Members are not sorted
 * 3)Keys cannot be duplicate,but values can be duplicate.
 * 4)If we try to duplication then that time reassign value to key
 * 5)Only one null is allowed,Multiple null value are allowed. 
 */
public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String,Long> contact=new HashMap<String,Long>();
		contact.put("Chaitali", 8976453290l);
		contact.put("Mohini",567890345l);
		contact.put("Rutu",6789545l);
		contact.put("Chaitali",34786896l);//Here only reassign the value to value but cannot create new as chaitali(key).
 System.out.println(contact);
 System.out.println("Contact of chaitali:"+contact.get("Chaitali"));
       HashMap<Integer,Food> foodDetails=new HashMap<Integer,Food>();
       foodDetails.put(1,new Food(123,"samba","veg",20,3));
       System.out.println(foodDetails.get(1));
	}

}
