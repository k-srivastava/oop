package lab1;

import java.util.Scanner;

/**
 * (a) Write a method isPrime to accept one integer parameter and to check whether that parameter is prime or not. (b)
 * Using this method, generate the first N prime number in the main method.
 */
public class Q4 {
    public static void main(String[] args) {
        int number;
        int numPrimes;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        System.out.print("Enter the number of primes to be generated: ");
        numPrimes = scanner.nextInt();

        scanner.close();

        System.out.println();
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        }
        else {
            System.out.println(number + " is composite.");
        }

        int[] primes = generatePrimes(numPrimes);

        System.out.println("\nFirst " + numPrimes + " primes are:");
        for (int i = 0; i < primes.length; i++) {
            System.out.println("[" + i + "]: " + primes[i]);
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) { return false; }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) { return false; }
        }

        return true;
    }

    private static int[] generatePrimes(int numPrimes) {
        int[] primes = new int[numPrimes];
        int currentNumber = 1;

        for (int i = 0; i < numPrimes; i++) {
            while (!isPrime(currentNumber)) {
                currentNumber++;
            }

            primes[i] = currentNumber++;
        }

        return primes;
    }
}
