package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1C {
public static void main(String[] args) {
	ArrayList<Student> slist=new ArrayList<Student>();
	slist.add(new Student(210,"Chaitali","chaitalibarhate@1234gmail.com",89.67,20));
	slist.add(new Student(45,"Mohini","mohinidhadi@1234gmail.com",45.78,23));
	slist.add(new Student(111,"Rutu","rutubagde@1234gmail.com",67.89,21));
	slist.add(new Student(145,"Yash","yashkishor@1234gmail.com",56.78,22));
	slist.add(new Student(210,"Devika","devikaghadge@1234gmail.com",23.89,25));
	
	Collections.sort(slist, new CompareStudentsname());
	System.out.println("\n********************After sorting name wise****************"+slist);
	
	Collections.sort(slist, new CompareStudentsmark());
	System.out.println("\n********************After sorting mark wise****************"+slist);
	
	Collections.sort(slist, new CompareStudentage());
	System.out.println("\n********************After sorting age wise****************"+slist);
}
}
