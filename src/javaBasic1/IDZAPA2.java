package javaBasic1;

import java.util.Scanner;

import java.util.Scanner;

public class IDZAPA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int difference = 0;

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array with the given size
        int[] arr = new int[size];

        // Ask the user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the difference between elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                difference = Math.abs(arr[i] - arr[j]);
                if (difference == 2 || difference == 3) {
                    System.out.println("Difference between " + arr[i]+","+ arr[j] + " is " + difference);
                }
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


