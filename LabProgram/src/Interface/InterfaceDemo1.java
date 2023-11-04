package Interface;
/*Interfaces are template of a class. We use it to create a basic structure for class.
 * 
 * point to remembers:
 * 1)All methods in the interface are automatically considered as abstract, we can not have to
 * add the keyword public or abstract.
 * 
 * 2)All variable in interface are automatically public static and final.
 * 
 * 3)Interface object cannot be created.
 * 
 * 4)Interface do not have constructors.constructors basically are used to create object and to initialize
 * the instant variable.
 * 
 *  5)since we cannot make the object of interface and we cannot initialize final variable therefore constructor 
 *  hence there is no requirement of constructor in interface therefore the concept of constructors are not 
 *  allowed in interface.
 *  
 *  6) we use implement keyword to make an Is-A relation  between class and interface.
 * 
 *  7)Interface can never extends another class,it can extends another interface.
 *  
 *  8)we are only extends the another interface but we cannot extends the class using interface
 *  
 *  9)A class can implement more than one interface.
 *  
 *  10)we are also extends and implement class and interface together.but should always before extends and then 
 *  implement the interface.
 *  
 *  11) we also create nested interface. It is helpful for together related methods.
 * 
 * 
 */
interface ClothingApp{
	public String addTocart(String s);
	public double coupon(String code);
}
class shyamApp implements ClothingApp{
@Override
	public String addTocart(String s) 
	{System.out.println("It is addTocart method ");
		return null;
	}
	@Override
	public double coupon(String code) 
	{System.out.println("It is coupon method ");
	return 800.0;
	}
	}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		shyamApp sa=new shyamApp();
		sa.addTocart("jeans");
	
		double result=sa.coupon("123@asd");
		System.out.println("You can use 123@asd code and using this code you get discount:"+result+ "on jean");
	}

}
