package jdk8910Features;
/*we can not create outside of local area.
 * we can store any type of data in var type variable,as seen below
 * 
 * Rules:-
 * 1.we cannot make instance variable using var keyword.
 * 2.we can use it only within a local scope.
 * 3.we can not use in var keyword in method signature.like method return type,parameter
 * 4.If we want to change the value of the var variable then we should change with same
 * 5.variable with type var have to be initialized while creating.
 * 6.var datatype can be used for making refernce variable of any class object also.  
 */
public class jdk10VarKeyword {
// var id=19;//we can not create outside of local area.		
		public void display() {
			System.out.println("This is a display method");
			
		}
		public static void main(String[] args) {
			var num=15;
			var name="Chaitali";
			var marks=40.9;
			var sign="&";

			//num="Chaitali"//we can not change type of data.
		    num=40;	//we can be change value of varible.
		    
		    //var a;//initialisation of variable is compulsory. 
		    var b=12;//
		    
		    var obj=new jdk10VarKeyword();//
		    obj.display();
		    

	}

}
