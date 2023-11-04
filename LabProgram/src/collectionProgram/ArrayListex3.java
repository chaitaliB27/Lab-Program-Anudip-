package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListex3 {
	public static void main(String[] args) {
	   ArrayList<PojoPerson>plist=new ArrayList<PojoPerson>();
       
	   PojoPerson p1=new PojoPerson(102,"chaitali",true,23,"indian");
       plist.add(p1);
       
       plist.add(new PojoPerson(106,"Mohini",true,23,"British"));
       plist.add(new PojoPerson(110,"Yash",true,22,"American"));
       plist.add(new PojoPerson(108,"rutu",false,4,"Suadi"));
       plist.add(new PojoPerson(123,"Devika",false,2,"Austrlia"));
       
       System.out.println("list:"+plist);
       Collections.sort(plist);
       System.out.println("After sorting :-+\n"+plist);
}
}

