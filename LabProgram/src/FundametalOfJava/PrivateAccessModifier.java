package FundametalOfJava;
/*When variables and methods are declared private, 
 *they cannot be accessed outside of the class. 
 */
class Data {
    private String name;//It is private variable of data class if we want 
    //access this private variable then we can access using gettersetter and constructor.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data(String name) {//This is constructor for private variable.
		this.name = name;
		System.out.println("Name of candidate:"+name);
	}
    
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		 // create an object of Data
        Data d = new Data("Mohini");

        // access private variable and field from another class
        //d.name = "Chaitali";//we can not access private variable outside the class.
        d.setName("Chaitali");
        String name1=d.getName();
        System.out.println("Name of candidate:"+name1);
        
	}

}
