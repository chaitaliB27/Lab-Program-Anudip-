package javaBasic1;
import java.util.*;
public class LinkedListEx1 {
public static void main(String []args) {
	 // Create a LinkedList
    LinkedList<String> linkedList = new LinkedList<>();

    // Add elements to the LinkedList
    linkedList.add("Element 1");
    linkedList.add("Element 2");
    linkedList.add("Element 3");
    System.out.println(linkedList);
    // Retrieve elements from the LinkedList
    String firstElement = linkedList.get(0);
    String secondElement = linkedList.get(1);
    String thirdElement = linkedList.get(2);

    // Display retrieved elements
    System.out.println("First Element: " + firstElement);
    System.out.println("Second Element: " + secondElement);
    System.out.println("Third Element: " + thirdElement);
}
}
