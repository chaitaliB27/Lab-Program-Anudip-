package abstractclass;
abstract class employee{
	int empID;
	String empName;
	public employee() {
		System.out.println("This is non-parameterized constrctor.");
	}
	public employee(String empName,int empID) {
			this.empID=empID;
		    this.empName=empName;
	}
	public void attendance() {
		System.out.println("The attendance is Marked.");
	}
	abstract public double salarycal(String employeeType);//abstract method 
}
class Developers extends employee{
   	public Developers(int empID,String empName) {
	    super(empName,empID);//call to parent class constructor.
	    System.out.println("Id of employee:"+empID+"\nName of employee:"+empName);
}
	
public double salarycal(String employeeType ) {
		if( employeeType.equals("permenant"))
		{
			return 50000;
		}
		else {
			return 25000;}
}
}
public class AbstractClassExample2 {

	public static void main(String[] args) {
       Developers d=new Developers(200,"chaitali");
		
		double salary=d.salarycal("not permenant");
		
		System.out.println(salary);

	}

}
