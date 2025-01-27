package javaBasic1;

public class SimpleInterest {
public static void main(String []args) {
	double interest=1;
	double rate=5;
	double year=2;
    double pAmount=5000;
    interest=pAmount*rate*year/100;
    System.out.println("Interest:"+interest);
}
}
