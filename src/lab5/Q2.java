package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static Student[] containSubstringName(Student[] students, String substring) {
        List<Student> studentsWithSubstring = new ArrayList<>();

        for (Student student : students) {
            if (student.name.contains(substring)) { studentsWithSubstring.add(student); }
        }

        return studentsWithSubstring.toArray(new Student[0]);
    }

    public static void sortStudents(Student[] students) { Arrays.sort(students); }

    public void computeMarks() {
        float total = 0;
        for (float mark : marks) {
            total += mark;
        }

        this.total = total;
        average = (double) total / marks.length;
    }

    public String generateInitials() {
        StringBuilder initials = new StringBuilder();
        for (String name : name.split(" ")) { initials.append(name.charAt(0)); }
        return initials.toString().toUpperCase();
    }

    public String removeWhitespace() {
        StringBuilder result = new StringBuilder();

        for (char c : name.toCharArray()) {
            if (!Character.isSpaceChar(c)) { result.append(c); }
        }

        return result.toString();
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
 * Add the following string processing methods to the class Student.<p> (a) extractInitials(): A method that extracts
 * the initials from the student's name. For example, if the student's name is "John Doe", this method would return
 * "JD".<p> (b) removeWhitespace(): A method that removes any whitespace characters from the student's name. For
 * example, if the student's name is "John Doe", this method would transform it to "JohnDoe".<p> (c) List all the
 * student names containing a particular sub string.<p> (d) Sort the students alphabetically
 */
public class Q2 { }