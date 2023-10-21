package FundametalOfJava;
/*A local variable in Java is a variable that’s declared within the body of a method. 
 * Then you can use the variable only within that method. Other methods in the class aren’t even aware that the variable exists. If we are declaring a local variable 
 * then we should initialize it within the block before using it.
 * 
 */
public class LocalVariable {
public static void main(String[] args)
{
		String college="Bharati vidyapeeth college ";
				System.out.println("college name:"+college);
				LocalVariable lv=new LocalVariable();
				lv.display();
		
	}
		public void display()
		{int num=10;//num is local variable in display method
			System.out.println("number:"+num);
			
			
		}	
}
