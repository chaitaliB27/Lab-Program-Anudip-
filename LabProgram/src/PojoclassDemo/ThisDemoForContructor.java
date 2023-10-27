package PojoclassDemo;

public class ThisDemoForContructor {
	int rollNo;
	String name;
	ThisDemoForContructor(){
		
		System.out.println("This is non parametrized constructor.");
	}
	ThisDemoForContructor(int rollNo){
		
		System.out.println("This is one paramertized construcor");
		
	}
	ThisDemoForContructor(int rollNo,String name){
		this(200);
		
		System.out.println("this is two paramertized constructor");
		
	}
	public static void main(String[] args) {
		ThisDemoForContructor td=new ThisDemoForContructor(200,"chaitali");
}
}
