package lab3;

import java.util.Arrays;

class Student {
    public String name;
    public float[] marks;
    public float total;
    public double average;

    public Student(String name, float[] marks) {
        this.name = name;
        this.marks = marks;
        computeMarks();
    }

    public void computeMarks() {
        float total = 0;
        for (float mark : marks) {
            total += mark;
        }

        this.total = total;
        average = (double) total / marks.length;
    }

    @Override
    public String toString() {
        return "Student\n" +
            "\tName: " + name + "\n" +
            "\tMarks: " + Arrays.toString(marks) + "\n" +
            "\tTotal: " + total + "\n" +
            "\tAverage: " + average + "\n";
    }
}

/**
 * Define a class student having the following members: name, marks_array, total, avg and provide the following methods:
 * (i) assign(): to assign initial values to the student object (ii) display(): to display the student object (iii)
 * compute(): to compute total, average marks
 */
public class Q1 { }
