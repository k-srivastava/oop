package lab1;

import java.util.Scanner;

/**
 * (a) Write a method reverse to accept once integer parameter and to return the reversed digits of accepted number. (b)
 * Using this method, check whether the inputted number is palindrome or not.
 */
public class Q2 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        scanner.close();

        int reversedNumber = reverse(number);
        System.out.println("\nReverse: " + reversedNumber);

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        }
        else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    private static int reverse(int number) throws IllegalArgumentException {
        if (number < 0) { throw new IllegalArgumentException("Cannot reverse a negative number: " + number + "."); }

        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }

    private static boolean isPalindrome(int number) throws IllegalArgumentException {
        return number == reverse(number);
    }
}
