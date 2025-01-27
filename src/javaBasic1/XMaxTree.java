package javaBasic1;

public class XMaxTree {
	public static void main(String[] args) {
        int height = 5;
        printXMaxTree(height);
    }

    public static void printXMaxTree(int height) {
        // Loop through each level of the tree
        for (int i = 0; i < height; i++) {
            // Print spaces before the stars
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next level
            System.out.println();
        }
    }
}
