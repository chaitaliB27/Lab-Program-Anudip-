package inheritance;
/*Multilevel inheritance
 * syntax:parent class
 * child class extends parent class
 * now, 
 * child class become parent of other class.
 */
class employee2{
	int empID;
	String company;
	public void markattendance() {
		System.out.println("Your attendance has been marked!");
	}	
}
class Programmer extends employee2{
	String category;
	public void coding() 
	{
		System.out.println("The programmer is coding as a "+category+" programmer");
	}
}
 class javadeveloper extends Programmer{
	 String Designation;
	String project;
	public void usingHibernate()
	{
		System.out.println("java developer is using hibernate...");		
	}
} 
public class MultiLevelInheritance {

	public static void main(String[] args) {
		javadeveloper jd=new javadeveloper();
		jd.empID=101;
		jd.company="Accenture";
		jd.category="junior";
		jd.Designation="Intern";
		jd.project="Data management";
		
		
		jd.markattendance();
		jd.coding();
		jd.usingHibernate();
		
		System.out.println("Printing the details...");
		System.out.println(jd);

	}

}
