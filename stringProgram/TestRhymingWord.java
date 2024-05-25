package stringProgram;

public class TestRhymingWord {

	public static void main(String[] args) {
		
		String s = "Tom and his mom are giving a boy a small toy";
		String[] s2 = s.split(" ");
		
		String s3 = "om";
		String s4 = "oy";
		for(String e:s2) {
			
			for(String d:s2) {
				
				if(e.endsWith(s3)) {
					
					if(d.endsWith(s4)) {
					
						System.out.println(e);
						System.out.println(d);
					}
				}
			}
		}
	}
}
