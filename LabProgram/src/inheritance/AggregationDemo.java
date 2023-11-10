package inheritance;
class Food{
	int foodInt=101;
	String foodName="Wada pav";
	double foodPrice=25.00;
   public void addSalt() {
    System.out.println("Adding more salt in food..");	
}
	public void addChutney() {
	
    System.out.println("Adding more chutney in food...");	
	}
}
class Cart{
	Food f=new Food();//It is show Has-a relationship (partly functionality)
	public void changeFood() {
		f.addSalt();
	}
}
public class AggregationDemo {

	public static void main(String[] args) {
		Cart c=new Cart();
		c.f.addSalt();
		c.f.addChutney();
		//Above we perform the Has-A relationship 
		c.changeFood();
		}
}
