package constructor;
/*Why interfaces can not have the constructor?
 * 1.An Interface is a complete abstraction of class. 
 * 2.All data members present in the interface are by default public, static, and final.
 * 3.The methods inside the interface are by default public abstract which means the method implementation cannot be provided by the interface itself, 
 * it has to be provided by the implementing class. 
 * Therefore, no need of having a constructor inside the interface.
 * 4.If we try to create a constructor inside the interface, the compiler will give a 
 * compile-time error.
 */
interface Subtraction {
	 
    //public Subtraction();// we unable to create a constructors in interface.
    int subtract(int a, int b);
}
public class constructorDemo3 implements Subtraction {

	@Override
	public int subtract(int a, int b) {
		int sub=a-b;
		return sub;
	}
	public static void main(String[] args) {
			constructorDemo3 cd=new constructorDemo3();
			System.out.println(cd.subtract(20, 5));
	}

}
