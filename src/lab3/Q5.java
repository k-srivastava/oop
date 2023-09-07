package lab3;

import java.util.Scanner;

class ISBN {
    public int number;

    public ISBN(int number) throws IllegalArgumentException {
        verifyNumber(number);
        this.number = number;
    }

    private static void verifyNumber(int number) throws IllegalArgumentException {
        int length = String.valueOf(number).length();
        if (length != 10) {
            throw new IllegalArgumentException("The ISBN should be a 10 digit number, not " + length + ".");
        }

        int sum = 0;
        int currentDigitPosition = 10;

        while (number != 0) {
            int lastDigit = number % 10;

            sum += lastDigit * currentDigitPosition;
            currentDigitPosition--;

            number /= 10;
        }

        if (sum % 11 != 0) { throw new IllegalArgumentException("The ISBN is invalid but of current length."); }
    }
}

/**
 * The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. The
 * ISBN is based upon a 10-digit code.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ISBN: ");
        new ISBN(scanner.nextInt());

        scanner.close();

        System.out.println("\nThe ISBN is valid.");
    }
}
