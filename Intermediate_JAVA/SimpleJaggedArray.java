package Intermediate_JAVA;

import java.util.Scanner;

public class SimpleJaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Loop through each row to get user input for row size and elements
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Enter the number of elements for row " + (i + 1) + ": ");
            int size = scanner.nextInt();
            jaggedArray[i] = new int[size];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
    }
}

