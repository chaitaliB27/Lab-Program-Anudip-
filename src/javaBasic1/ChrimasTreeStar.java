package javaBasic1;
public class ChrimasTreeStar {
	public static void main(String args[])   
	{
		int n = 5; // Change the value of n to adjust the height of the tree

        // Loop to print each row of the tree
        for (int i = 0; i < n; i++) {
            // Print spaces before the asterisks to center the tree
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the tree
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        // Print the trunk of the tree
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
			
}
