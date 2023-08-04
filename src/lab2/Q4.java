package lab2;

import java.util.Scanner;

/**
 * Find the addition of two matrices and display the result.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = inputMatrix(scanner);
        int[][] matrix2 = inputMatrix(scanner);

        scanner.close();

        int[][] result = add(matrix1, matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println("Matrix [" + i + "][" + j + "]: " + result[i][j]);
            }
        }
    }

    private static int[][] inputMatrix(Scanner scanner) {
        int rows, columns;

        System.out.print("Enter the rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the columns: ");
        columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        return matrix;
    }

    private static int[][] add(int[][] matrix1, int[][] matrix2) throws IllegalArgumentException {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Cannot add two matrices with different dimensions.");
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
}
