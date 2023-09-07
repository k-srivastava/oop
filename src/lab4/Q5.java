package lab4;

import java.util.Arrays;

class CustomArray<T> {
    public T[] array;

    public CustomArray() { }

    public CustomArray(T[] array) {
        this.array = array;
    }

    public int search(T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { return i; }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "CustomArray{" + "array=" + Arrays.toString(array) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray<?> that = (CustomArray<?>) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}

/**
 * Define a class IntArray which hosts an array of integers. Provide the following methods:<p> 1. A default
 * constructor.<p> 2. A parameterized constructor which initializes the array of the object.<p> 3. A method called
 * display to display the array contents.<p> 4. A method called search for an element in the array.<p> 5. A method
 * called compare which compares two IntArray objects for equality.
 */
public class Q5 { }
