package lab3;

import java.util.Arrays;

class Mixer {
    public int[] array;
    private int currentIndex;

    public Mixer(int length) {
        array = new int[length];
        currentIndex = -1;
    }

    public void accept(int item) throws IllegalStateException, IllegalArgumentException {
        if (currentIndex == array.length - 1) {
            throw new IllegalStateException(
                "Cannot add " + item + " to mixer. Maximum quantity of " + array.length + " exceeded."
            );
        }

        if (currentIndex == -1) {
            array[0] = item;
            currentIndex++;

            return;
        }

        if (item <= array[currentIndex]) {
            throw new IllegalArgumentException("Cannot add " + item + " to mixer. Invalid item for sorting.");
        }

        array[++currentIndex] = item;
    }

    Mixer mix(Mixer other) {
        int totalLength = array.length + other.array.length;
        int[] combinedArray = new int[totalLength];

        int i = 0;
        for (int item : array) { combinedArray[i++] = item; }
        for (int item : other.array) { combinedArray[i++] = item; }

        Arrays.sort(combinedArray);

        var newMixer = new Mixer(totalLength);

        newMixer.array = combinedArray;
        newMixer.currentIndex = combinedArray.length - 1;

        return newMixer;
    }

    @Override
    public String toString() {
        return "Mixer{" + "array=" + Arrays.toString(array) + '}';
    }
}

/**
 * Define a class Mixer to merge two sorted integer arrays in ascending order with the following instance variables and
 * methods:<p> Instance Variables: int arr[]<p> Methods:<p> void accept(): to accept the elements of the array in
 * ascending order without any duplicates<p> Mixer mix(Mixer A): to merge the current object array elements with the
 * parameterized array elements and return the resultant object<p> void display(): to display the elements of the
 * array<p>
 */
public class Q3 {
}
