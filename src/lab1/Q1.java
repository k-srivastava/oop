package lab1;

import java.util.Scanner;

/**
 * Create a method called max that has three integer parameters, x, y, and z, and it returns the largest of the three.
 * Do it two ways: once using an if-else-if ladder and once using nested if statements.
 */
public class Q1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        boolean useLadder;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        System.out.println("\nUse if-else ladder?");
        useLadder = scanner.nextBoolean();

        scanner.close();

        int greatest = useLadder ? maxLadder(num1, num2, num3) : maxNested(num1, num2, num3);
        System.out.println("\nThe largest number is " + greatest + ".");
    }

    private static int maxLadder(int num1, int num2, int num3) {
        int greatest;

        if (num1 > num2 && num1 > num3) { greatest = num1; }
        else if (num2 > num1 && num2 > num3) { greatest = num2; }
        else { greatest = num3; }

        return greatest;
    }

    private static int maxNested(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) { return num1; }
        }

        if (num2 > num1) {
            if (num2 > num3) { return num2; }
        }

        return num3;
    }
}
