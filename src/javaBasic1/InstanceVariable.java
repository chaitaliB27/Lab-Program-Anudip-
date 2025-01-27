package javaBasic1;

public class InstanceVariable {
	int num=100;//instant variable=it available through out class.//always call the method in main method.
	String institute="anudip";
	String course="java";
	public void display() 
	{
		System.out.println("num:"+num);
		System.out.println("institute:"+institute);
		System.out.println("course:"+course);
		
		
	}
	
	
	
	public static void main(String [] args) 
	{
		InstanceVariable iv=new InstanceVariable();
		System.out.println("num:"+iv.num);
		System.out.println("institute:"+iv.institute);
		System.out.println("course:"+iv.course);
		System.out.println("\n\n calling the display method: ");
		iv.display();
		
		
	}

}
