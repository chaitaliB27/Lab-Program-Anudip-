package FundametalOfJava;
/*1.If we do not explicitly specify any access modifier for classes, methods, variables, etc, 
 * then by default the default access modifier is considered
 * 2.if variable declarations as protected are visible only within the package
 * 
 */
class Login {
    void message(){
        System.out.println("This is a message");
    }
}
public class DefaultAccessModifier {

	public static void main(String[] args) {
		Login l=new Login();
		l.message();
		System.out.println("Here we was called message method.");

	}

}
