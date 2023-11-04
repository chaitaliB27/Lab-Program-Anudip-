package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class FoodTestArrayList {
public static void main(String[] args) {
	ArrayList<Food> flist=new ArrayList<Food>();
	flist.add(new Food(106,"idli","south indian item",51,2));
	flist.add(new Food(101,"Pav Bhaji","Veg",120,3));
	flist.add(new Food(56,"Rava Masala Dose","Dose type",567,2));
	flist.add(new Food(02,"Butter pav","Veg",15,5));
	flist.add(new Food(45,"Chicken masala","non-Veg",390,3));
	flist.add(new Food(89,"Chicken Handi","Non-Veg",220,2));
	flist.add(new Food(345,"Butter chicken","Non-Veg",340,2));
	System.out.println("list:"+flist);
    Collections.sort(flist);
    System.out.println("After sorting :\n"+flist);
}
}
