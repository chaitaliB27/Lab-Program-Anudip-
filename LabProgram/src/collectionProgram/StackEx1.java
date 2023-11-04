package collectionProgram;

import java.util.Enumeration;
import java.util.Stack;

/*
 * Stack class extends Vector class hence We see similar properties as Vector. We can use Enumeration
 * with Stack also.
 * 
 * Stack follows LIFO (Last In First Out).
 * push method is used to add members in the Stack
 * pop method is used to delete the last member that was added to the Stack.
 */
public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("January");
		s.push("February");
		s.push("March");
		s.push("April");
		s.push("May");
		s.push("June");
		
		System.out.println("Before:\n"+s);
		
		s.pop();
		System.out.println("After popping:\n"+s);
		
		Enumeration<String> e = s.elements();
		while (e.hasMoreElements()) {
			e.nextElement();
		}

	}

}
