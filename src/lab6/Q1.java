package lab6;

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

class ScienceStudent extends Student {
    private final float practicalMarks;

    public ScienceStudent(String name, float[] marks, float practicalMarks) {
        super(name, marks);
        this.practicalMarks = practicalMarks;
    }

    public float practicalMarks() { return practicalMarks; }

    @Override
    public void computeMarks() {
        super.computeMarks();

        total += practicalMarks;
        average = total / (marks.length + 1);
    }
}

class ArtStudent extends Student {
    private final String electiveSubject;

    public ArtStudent(String name, float[] marks, String electiveSubject) {
        super(name, marks);
        this.electiveSubject = electiveSubject;
    }
}

public class Q1 { }
