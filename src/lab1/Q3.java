package lab1;

import java.util.Scanner;

/**
 * (a) Write a method fact to accept one integer parameter and to find the factorial of a given number.
 * (b) Using fact, compute nCr in the main method.
 */
public class Q3 {
    public static void main(String[] args) {
        int number;
        int n, r;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        n = scanner.nextInt();

        System.out.print("Enter the value of R: ");
        r = scanner.nextInt();

        scanner.close();

        System.out.println("\n" + number + "! = " + factorial(number));
        System.out.println("nCr = " + permutation(n, r));
    }

    private static int factorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number: " + number + ".");
        }

        int factorialNumber = 1;
        for (int i = 2; i <= number; i++) { factorialNumber *= i; }

        return factorialNumber;
    }

    private static int permutation(int n, int r) throws IllegalArgumentException {
        return factorial(n) / factorial(r);
    }
}
