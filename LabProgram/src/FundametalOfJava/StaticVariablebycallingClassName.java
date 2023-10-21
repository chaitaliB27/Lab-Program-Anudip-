package FundametalOfJava;

public class StaticVariablebycallingClassName {
	public static void main(String [] args) {
		StaticVariable sv1=new StaticVariable();
		System.out.println("num1:"+sv1.num);
		System.out.println("num2:"+StaticVariable.num2);//Important syntax of program.
		//StaticVariable is class.By using class name we are call static variable.
	}
}
