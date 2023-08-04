package lab2;

import java.util.Scanner;

/**
 * Print out all the prime numbers in a given 1D array.
 */
public class Q3 {
    public static void main(String[] args) {
        int length;
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

        scanner.close();

        System.out.println("\nPrime numbers:");
        displayPrimes(numbers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) { return false; }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) { return false; }
        }

        return true;
    }

    private static void displayPrimes(int[] numbers) {
        for (int number : numbers) {
            if (isPrime(number)) { System.out.println(number); }
        }
    }
}
