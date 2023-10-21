package FundametalOfJava;
/*The static variable can be used to refer to the common property of all objects
 * The static variable gets memory only once in the class area at the time of class loading.
 * Java static property is shared to all objects.
 */
public class StaticVariable {
	int num=100;
	static int num2=1300;//memory is allocated when class load.
	//for static member not required object. 
	
	public static void main (String[] args) {
		StaticVariable sv=new StaticVariable();
		System.out.println("num1:"+sv.num);
		System.out.println("num2:"+num2);
		sv.display();
	} 
    public void display() {
        System.out.println("This is display method");
		System.out.println("num1:"+num);
		System.out.println("num2:"+num2);
    	}
}
