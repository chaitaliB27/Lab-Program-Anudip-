package Interface;
interface Demo3{
	public void display();
}
class Programmer implements Demo3{
@Override
	public void display() {
		System.out.println("This is display method of class programmer "
				+ "and it is override by interface demo3.");
		}
}
interface Demo4 extends Demo3{
	public void show();
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
         Programmer p=new Programmer();
         p.display();
         }
}
