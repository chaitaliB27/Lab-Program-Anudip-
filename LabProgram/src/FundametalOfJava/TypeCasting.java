package FundametalOfJava;
//Borrowing and down casting
public class TypeCasting {
	public static void main(String [] args) {
		double marks=34.98;
	    System.out.println("Marks in double:"+marks);
	    //up casting 
	     int m=(int)marks;//Important syntax(Decrease the memory block)
	     System.out.println("Marks in int:"+m);
	     int num=400;
	     double num2=num;//Down casting(only increase the memory block)
	     System.out.println("num2:"+num2);

		}
}
