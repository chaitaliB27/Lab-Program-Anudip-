package inheritance;
class University{
	String name ="university of mumbai";
}
class College extends University{
	String name="Bhavan college";
	public void display() {
		
	System.out.println("Name of college:"+name);
	System.out.println("Name of university:"+super.name);
	}
}
class Department extends College{
	String name="chemistry department";
public void show() {
		System.out.println("Name of department:"+name);
		System.out.println("Name of college:"+super.name);
}
}
public class SuperKeywordforvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c=new College();
        c.display();
        Department d=new Department();
        d.show();
	}

	}


