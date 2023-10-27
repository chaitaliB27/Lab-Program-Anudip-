package EncapsulationOppsFeature;
class Employee
{private int empId;
 private String empName;
 private double salary;
 public Employee() {
		System.out.println("non-paramaterized constructor");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Employee(int empId,String empName,double salary)
	{
		System.out.println("\n\nDetails of second employee");
		System.out.println("Name:"+empName+"\nID of employee:"+empId+"\nsalary of employee:"+salary);
		
	}
	public String toString() {
		System.out.println("Details of employee 1");
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
}
public class EncapsulationDemo {
public static void main(String[] args) {

	Employee e1= new Employee();
	e1.setEmpName("chaitali");
	e1.setSalary(50000);
	e1.setEmpId(101);
	String ans=e1.toString();
	System.out.println(ans);
	
	//double s=e1.getSalary();
	//double ei=e1.getEmpId();
	//String  en=e1.getEmpName();
	Employee e3=new Employee(106,"mohini",60000.0);	
}
}
