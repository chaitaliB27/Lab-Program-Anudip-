package inheritance;
/*
 * 1)constructor are not inherited from parent to child. 
 ** 2)when the object of child class is created,then always the non parameterized constructor of the 
 * parent is called.
 * 3)In parent class if we do not make any constructor then creates a non parameterized constructor in it.
 *** but if we as coder are going to create constructor in parent class then always remember to make non 
 * parameterized constructor also.
 *  4) we can call any of parent from the constructor  of child by using super keyword.
 *  5)we can call  all parent  constructor only once inside the child constructor.
 *  6)parent constructor call should be the first line of code in the child constructor. 
 */

class Garden{
	public Garden() {
		System.out.println("This is the zero parameter constructor of garden");
}
	public Garden(String city) {
		System.out.println("This is the Garden in the city:"+city);
		}
}
class plant extends Garden{
	public plant() {
		System.out.println("This is the zero parameter constructor of plant");
}
	public plant(String name) {
		super("mumbai");// calling parent constructor
		System.out.println("This is the "+name+" plant");
	} 
} 
class SuperKeyWordForCoustructors {

	public static void main(String[] args) {
		Garden g=new Garden("Mumbai");
		plant p =new plant("money");
	}

}
