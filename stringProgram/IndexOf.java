package stringProgram;

public class IndexOf {

	public static void main(String[] args) {
		
		String movie = "Jailer The Movie";
		System.out.println("Length of the movie: " + movie.length());
		
		int i = movie.indexOf('e');
		System.out.println("Index number of given character: " + i);
		
		int j = movie.lastIndexOf('i');
		System.out.println("Index number of given character: " + j);
		
		int k = movie.indexOf("The"); // overloaded indexOf method
		System.out.println("Index of The: " +  k);
		
		int a = movie.indexOf('e', 6); // overloaded
		System.out.println("Index number of given character: " + a);
		
		int b = movie.indexOf("The", 8); //overloaded
		System.out.println("Index number of given character: " + b);
	}

}
