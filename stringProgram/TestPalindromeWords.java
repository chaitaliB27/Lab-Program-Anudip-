package stringProgram;

public class TestPalindromeWords {

    public static void main(String[] args) {
        String[] words = {"bob", "said", "wow", "when", "he", "saw", "the", "kayak", "and", "the", "racecar"};

        System.out.println("Palindrome Words:");

        for (String word : words) {
            int left = 0;
            int right = word.length() - 1;

            boolean isPalindrome = true;
            
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(word);
            }
        }
    }
}
