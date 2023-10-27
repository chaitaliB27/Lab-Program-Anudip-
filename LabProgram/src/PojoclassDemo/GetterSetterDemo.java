package PojoclassDemo;
/*Below we are giving same Variable identifier/name to the instance variable and local variable.
 * So,jvm could get confused between the two variable,hence we declare the instance variable 
 * name by using this keyword.
 * when we the this keyword then jvm will understand that the data in local variable 
 * is to be stored inside the instance variable.
 * 
 * 
 * 
 */

class customer1
{private String name;
 private String email;
 private long mobile;
 private boolean fresher;
 private String dob;
 private String education;
 private int noticeperiod;
public customer1() {
    System.out.println("non-prarameterized constructor!");
     }
 public String getEmail() {
		return email;
	}
 public void setEmail(String email) {
		this.email = email;
	}
		public boolean isFresher() {
		return fresher;
	}
	public void setFresher(boolean fresher) {
		this.fresher = fresher;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		customer1 c1=new customer1();
		c1.setEmail("chaitalibarhate@gmail.com");
		c1.setDob("27 nov 2001");
		c1.setFresher(false);
		c1.setEducation("B.E");
		String a=c1.getEmail();
		boolean b=c1.isFresher();
	    String d=c1.getDob();
        String e=c1.getEducation();
      System.out.print("email of coustomer:"+a+"\ncoustomer is fresher or not:"+b+"\nBirth date of coustomer:"
        		+d+"\nEducation of coustomer:"+e);
    }
}
