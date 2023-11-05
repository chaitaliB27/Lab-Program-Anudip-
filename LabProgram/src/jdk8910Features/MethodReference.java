package jdk8910Features;
interface Demo{
	
	public void display(String s);
}
public class MethodReference {

	public static void main(String[] args) {
		//Demo d=s->{System.out.println("The length of given String :"+s.length());};
		Demo d=new MethodReferenceEx()::show;
		d.display("Anudip Foundation");
	}

}
