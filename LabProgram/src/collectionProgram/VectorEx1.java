package collectionProgram;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Saturday");
		v.add("Friday");
		v.add("Monday");
		v.add(null);
		v.add("Sunday");
		v.add("Tuesday");
		v.add("Thursday");
		v.add("Wednesday");
		
		System.out.println(v);
		
		System.out.println("Using Enumeration...");
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
