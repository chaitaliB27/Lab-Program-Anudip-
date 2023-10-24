package statementandloop;
//find 3^4=? using for loop
public class ForLoop {
public static void main(String[] args) {
	int number1=3;
    int number2=4;
    int result=1;
    for(number2=4;number2!=0;--number2)
    {
   	result=result*number1;
    }
    System.out.println("As result of 3^4:"+result);
		}
}
