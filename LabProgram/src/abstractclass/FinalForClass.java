package abstractclass;
/*If we are declare final class then we cannot inherit it.
 *A final class never be a super class.
 */
final class Demo4{
	String name="chaitali";
	int id=500;
	public void display() 
	{System.out.println("Hello Everyone!!");
	}	
}
//class subclass extends Demo4{
//Here we are unable to extends demo4 class because Demo4 id final class.
//}
public class FinalForClass {
	public static void main(String[] args) {
		Demo4 d1=new Demo4();
       d1.display();
	}
}
