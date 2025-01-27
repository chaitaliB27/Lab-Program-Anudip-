package javaBasic1;

public class Differenceofoperators {
	public double division() {
		  double num1 = 10.0;
		  double num2 = 20.0;

		  double num3 = num1 / num2;

		  return num3;

		}
		public double reminder() {
		  double number = 40.0;
		  double number2 = 50.0;

		  double R = number % number2;

		  return R;
		}
		public static void main(String[] args) {
			Differenceofoperators ao = new Differenceofoperators();

		  double total = ao.division();
		  System.out.println("division of number:" + total);

		  double reminder1 = ao.reminder();
		  System.out.println("division of number:" + reminder1);

		}
}
