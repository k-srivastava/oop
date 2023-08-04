package lab2;

import java.util.Scanner;

/**
 * Search an element in a 1D array using linear search.
 */
public class Q5 {
    public static void main(String[] args) {
        int length, target;
        //noinspection DuplicatedCode
        int[] numbers;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        length = scanner.nextInt();

        numbers = new int[length];

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print("Number [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the target number: ");
        target = scanner.nextInt();

        scanner.close();

        int index = linearSearch(numbers, target);

        System.out.println();
        if (index == -1) {
            System.out.println("Number: " + target + " does not exist in the array.");
        }

        else {
            System.out.println("Number: " + target + " exists at index " + index + ".");
        }
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) { return i; }
        }

        return -1;
    }
}
