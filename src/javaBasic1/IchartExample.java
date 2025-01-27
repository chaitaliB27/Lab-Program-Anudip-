package javaBasic1;

public class IchartExample {
	public String replacespace(String sentence){

		return sentence.replace(" ","#");

		}

		public static void main(String [] args){
		String originalsentence="There are 3 space.";
		IchartExample s =new IchartExample();
		String result=s.replacespace(originalsentence);
		System.out.println(result);

		}
}
