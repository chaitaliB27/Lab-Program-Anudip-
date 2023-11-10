package inheritance;
class Opps{
	int salecount=8;
	public void show() {
		System.out.println("No of mobile sales by opps:"+salecount);
		}
}
class RealMe extends Opps{
int salecount=10;
public void sales() {
			System.out.println("No of mobile sales by Realme:"+salecount);
		    super.show();//Important syntax.
	        System.out.println("No of mobile sales by opps:"+super.salecount);
	}
}
public class SuperKeywordForMethod {

	public static void main(String[] args) {
		RealMe rm=new RealMe();
		rm.sales();

	}

}
