package javaBasic1;

import java.util.Enumeration;
import java.util.Stack;

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

