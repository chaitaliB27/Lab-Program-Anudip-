package constructor;
/*Constructor in Abstract Class in Java:
 * 1.abstract class has an ability to define the constructors.
 * 
 * Rules for constructor in Abstract class:
 * 1.Abstract classes can have constructors, but they cannot be instantiated directly. 
 * The constructors are used when a concrete subclass is created.
 * 2.When a subclass extends an abstract class with constructors, the subclass needs to 
 * call one of the constructors inside the superclass with the help of super key-word.
 *  
 */
abstract class Shape {  
	    int x;  
	    int y;  
	    public Shape() {  // default constructor
	        // initialize default values for fields  
	        x = 0;  
	        y = 0;  
	    }
	        abstract double area();
	    
	    }
class Square extends Shape {  
	    protected double side;  
	  
	    // constructor  
	    public Square(double side) {  
	        this.side = side;  
	    }  
	  @Override
		double area() {
			// TODO Auto-generated method stub
			return side * side; 
		}  
	}  	
public class constructorDemo2 {	
	 public static void main(String[] args) {  
		 Square square1 =new Square(4);  
		 System.out.println("Original Area of square: "+square1.area()); 
	 }	    
}
