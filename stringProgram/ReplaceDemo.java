package stringProgram;

public class ReplaceDemo {
	
	public void display(char a, char b) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		
		String word = "Cook Book";
		String word2 = word.replace('o', 'e');
		String word3 = word.replace("Cook", "Computer");
		
		System.out.println("Word: " + word);
		System.out.println("Word2: " + word2);
		System.out.println("Word3: " + word3);
		
		ReplaceDemo rd = new ReplaceDemo();
		rd.display('K', 'P');
		
		String message = "The boy is standing on the road. The dog is sitting "
				+ "near the boy";
		String message2 = message.replace("boy", "girl");
		String message3 = message.replaceFirst("boy", "girl");
		
		System.out.println("Message: " + message);
		System.out.println("Message2: " + message2);
		System.out.println("Message3: " + message3);
	}

}
