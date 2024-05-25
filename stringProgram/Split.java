package stringProgram;

public class Split {

	public static void main(String[] args) {
		
		String team = "Indian Hockey Team";
		
		String[] s = team.split("o");
		
		for(int i=0; i<s.length; i++) {
			
			System.out.println(s[i]);
		}
		
		System.out.println("Original team: " + team);
	}

}
