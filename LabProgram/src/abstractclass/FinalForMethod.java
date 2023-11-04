package abstractclass;
/*final method =We are not able to override this final method.
 *meaning final method behavior cannot be changed by overriding.
 */
class DemoN{
	
	public void show()
	{
	for(int i=1;i<=10;i++){
		System.out.print("i");
		}
	}
	final void display() {
		
		System.out.println("This is a display method");
		}
	}
class Demo2 extends DemoN{
//final void display() {//We are unable to override the method because this method is final
		
		//System.out.println("This is a display method");
		//}
	
}		
public class FinalForMethod
{	public static void main(String[] args) {
	Demo2 d=new Demo2();
	d.display();
}
}
