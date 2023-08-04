package lab2;

import java.util.Scanner;

/**
 * Write a program that creates an integer array of length N, fills the array with the sequence of values (from 1 to N)
 * using a for loop, and then loops through the array printing out the values. Use a for-each style loop tp print out
 * the values.
 */
public class Q2 {
    public static void main(String[] args) {
        int length;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        length = scanner.nextInt();

        scanner.close();

        Integer[] numbers = createArray(length);
        displayArray(numbers);
    }

    private static Integer[] createArray(int length) {
        Integer[] numbers = new Integer[length];

        for (int i = 1; i <= length; i++) { numbers[i - 1] = i; }
        return numbers;
    }

    private static <T> void displayArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
