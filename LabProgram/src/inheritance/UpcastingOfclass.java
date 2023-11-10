package inheritance;
class LivingThing{
	public void movement() {
		System.out.println("This being is moving..");
		}
}
class Birds extends LivingThing{
		public void layingEggs() {
			System.out.println("The bird is laying Eggs... ");
		}
} 
public class UpcastingOfclass {

	public static void main(String[] args) {
		Birds b=new Birds();
		b.movement();
		
		LivingThing l1=new Birds();
		l1.movement();
		//Above we are trying for upcasting of object therefore child behaviors like the parent.
}
}
