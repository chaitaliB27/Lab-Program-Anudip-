package operatorsandassignments;
/*/=number are divided and quotient given as answer
 * %=number are divided and remainder given as answer
 * *,+,-
 */
public class ArithmeticOperators {
	public int division() {
		  int num1 = 10;
		  int num2 = 20;
		  int num3 = num1 / num2;
          return num3;
          }
    public int reminder() {
		  int number = 40;
		  int number2 = 50;
     	  int r= number % number2;
     	  return r;
		}
    public int addition() {
		  int number = 40;
		  int number2 = 50;
   	  int a= number + number2;
   	  return a;
		}
    public int subtraction() {
		  int number = 80;
		  int number2 = 50;
 	  int s= number - number2;
 	  return s;
		}
    public int multiplication () {
		  int number = 40;
		  int number2 = 50;
   	  int m= number * number2;
   	  return m;
		}
		public static void main(String[] args) {
		  ArithmeticOperators ao = new ArithmeticOperators();
    	  int  total = ao.division();
		  System.out.println("division of number:" + total);

		  int reminder1 = ao.reminder();
		  System.out.println("division of number:" + reminder1);

		  int add = ao.addition();
		  System.out.println("addition of number:" + add);

		  int sub = ao.subtraction();
		  System.out.println("substraction of number:" + sub);

		  int mul = ao.multiplication();
		  System.out.println("multipication of number:" + mul);
		}
}
