package lab1;

import java.util.Scanner;

/**
 * Write a method findSum to find the sum of digits of a number.
 */
public class Q5 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        scanner.close();

        int sum = findSum(number);
        System.out.println("\nThe sum of digits is: " + sum + ".");
    }

    private static int findSum(int number) {
        int total = 0;

        while (number != 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}
