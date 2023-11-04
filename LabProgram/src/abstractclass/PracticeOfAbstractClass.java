package abstractclass;
abstract class MovieTicketApp{
	public void availableShow() {
		System.out.println("It is shoe the available show");
	}
	public void availbleDate() {
		System.out.println("It is show the available date for movie");
		}
	public abstract void bookseat();
	public abstract void applyCoupon();
}
class BookMYShow extends MovieTicketApp
{public void bookseat() {
		System.out.println("Book your ticket from your bookshow app");
}
public void applyCoupon() {
	System.out.println("you can apply coupon for booking ticket. ");
}
}
public class PracticeOfAbstractClass {
public static void main(String[] args) {
	BookMYShow bs=new BookMYShow();
	bs.availableShow();
	bs.availbleDate();
	bs.bookseat();
	bs.applyCoupon();
}
}
