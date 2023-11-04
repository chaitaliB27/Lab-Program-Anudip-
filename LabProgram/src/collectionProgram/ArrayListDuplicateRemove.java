package collectionProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDuplicateRemove {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Chaitali");
		ar.add("Mohini");
		ar.add("Yash");
		ar.add("Mayur");
		ar.add("Mohini");
		ar.add("Chaitali");
		System.out.println("Before duplicates Remove "+ar);
		//Method1
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();//LinkedHashSet is not allow duplicate.
        lhs.addAll(ar);
        ar.clear();
        ar.addAll(lhs);
        System.out.println("After Duplicates Remove:"+ar);
        //Method2
        ArrayList<String> ar1=new ArrayList<String>();
        for(int i=0;i<ar.size();i++) {
        	if(!ar1.contains(ar.get(i)));
        	{
        		ar1.add(ar.get(i));
        	}
        }
        System.out.println("After Duplicates Remove using method 2:"+ar1);
	}

}
