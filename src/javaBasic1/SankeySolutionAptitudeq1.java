package javaBasic1;

public class SankeySolutionAptitudeq1 {
	 public static void main(String[] args) {
	        String inputString = "sankey solution";

	        // Task 1: Count the vowels in the input string
	        int vowelCount = countVowels(inputString);
	        System.out.println("Total number of vowels: " + vowelCount);

	        // Task 2: Count each vowel separately
	        int[] vowelCounts = countEachVowel(inputString);
	        System.out.println("Counts of each vowel:");
	        System.out.println("A: " + vowelCounts[0]);
	        System.out.println("E: " + vowelCounts[1]);
	        System.out.println("I: " + vowelCounts[2]);
	        System.out.println("O: " + vowelCounts[3]);
	        System.out.println("U: " + vowelCounts[4]);

	        // Task 3: Convert vowels to upper case
	        String modifiedString = upperCaseVowels(inputString);
	        System.out.println("Modified string with vowels in upper case: " + modifiedString);
	    }

	    // Function to count the total number of vowels in the string
	    public static int countVowels(String str) {
	        int count = 0;
	        for (char ch : str.toLowerCase().toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Function to count each vowel separately
	    public static int[] countEachVowel(String str) {
	        int[] counts = new int[5]; // Array to store counts of each vowel (A, E, I, O, U)
	        for (char ch : str.toLowerCase().toCharArray()) {
	            switch (ch) {
	                case 'a':
	                    counts[0]++;
	                    break;
	                case 'e':
	                    counts[1]++;
	                    break;
	                case 'i':
	                    counts[2]++;
	                    break;
	                case 'o':
	                    counts[3]++;
	                    break;
	                case 'u':
	                    counts[4]++;
	                    break;
	            }
	        }
	        return counts;
	    }

	    // Function to convert vowels to upper case in the string
	    public static String upperCaseVowels(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            switch (ch) {
	                case 'a':
	                case 'e':
	                case 'i':
	                case 'o':
	                case 'u':
	                    sb.append(Character.toUpperCase(ch));
	                    break;
	                default:
	                    sb.append(ch);
	                    break;
	            }
	        }
	        return sb.toString();
	    }
}
