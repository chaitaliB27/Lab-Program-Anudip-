package javaBasic1;

public class LogicalDemo {
public void eligibility(double marks,int exprience) {
		
		System.out.println("eligible for techmahindra:"+((marks>60)&&(exprience>2)));
		
		System.out.println("eligible for myGlobal:"+((marks>60)||(exprience>2)));
	}
	
	
	public static void main(String []args) {
		
		
		double remesh=60;
		int remeshExp=3;
		double suresh=70;
		int sureshExp=2;
		LogicalDemo ld=new LogicalDemo();
		ld.eligibility(remesh,remeshExp);
		ld.eligibility(suresh,sureshExp);
		
		
	}
}
