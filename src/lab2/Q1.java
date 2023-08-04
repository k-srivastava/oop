package lab2;

import java.util.Scanner;

/**
 * Write a program that creates an array of integers and then uses a for loop to reverse the order of the elements in
 * the array.
 */
public class Q1 {
    public static void main(String[] args) {
        int length;
        Integer[] numbers;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        length = scanner.nextInt();

        numbers = new Integer[length];

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print("Number [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        reverseArray(numbers);

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
    }

    private static <T> void reverseArray(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
    }
}
