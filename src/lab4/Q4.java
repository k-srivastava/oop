package lab4;

import java.util.Scanner;

class Counter {
    private static int numInstances = 0;

    public Counter() { numInstances++; }

    public static int numInstances() { return numInstances; }
}

/**
 * Create a class called Counter that contains a static data member to count the number of Counter objects being
 * created. Also define a static member function called showCount() which displays the number of objects created at any
 * given point of time.
 */
public class Q4 {
    public static void main(String[] args) {
        int numCounters;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of counters to instantiate: ");
        numCounters = scanner.nextInt();
        scanner.close();

        System.out.println("\nCreating counters:");
        for (int i = 0; i < numCounters; i++) {
            new Counter();
            System.out.println(Counter.numInstances());
        }
    }
}
