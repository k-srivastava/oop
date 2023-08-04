package lab2;

import java.util.Scanner;

/**
 * Write a program that creates a "triangular" two-dimensional array A of 10 rows. The first row has length 1, the
 * second row has length 2, the third row has length 3, and so on. Then initialise the array using nested for loops so
 * that the value if A[i][j] is i + j. Finally, print out the array in a nice triangular form.
 */
public class Q6 {
    public static void main(String[] args) {
        int rows;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        scanner.close();
        System.out.println();

        int[][] triangularArray = generateTriangularArray(rows);
        displayTriangularArray(triangularArray);
    }

    private static int[][] generateTriangularArray(int rows) {
        int[][] triangularArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangularArray[i] = new int[i + 1];

            for (int j = 0; j < i + 1; j++) {
                triangularArray[i][j] = i + j;
            }
        }

        return triangularArray;
    }

    private static void displayTriangularArray(int[][] triangularArray) {
        for (int[] nums : triangularArray) {
            for (int num : nums) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
