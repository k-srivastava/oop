package lab5;

import java.time.LocalDate;
import java.util.Scanner;

class ClassStudent {
    public int registrationNumber;
    public String fullName;
    public LocalDate joiningDate;
    public short semester;
    public float gpa;
    public float cgpa;

    public ClassStudent(
        int joiningNumber, String fullName, LocalDate joiningDate, short semester, float gpa, float cgpa
    ) {
        int year = joiningDate.getYear();
        String registrationString = String.valueOf((year / 10) % 10) + year % 10 + joiningNumber;

        this.registrationNumber = Integer.parseInt(registrationString);
        this.fullName = fullName;
        this.joiningDate = joiningDate;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    public static ClassStudent nextClassStudent(Scanner scanner, char delimiter) {
        System.out.print(delimiter + "Joining Number: ");
        int joiningNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print(delimiter + "Full Name: ");
        String fullName = scanner.nextLine();

        System.out.println(delimiter + "Joining Date:");
        System.out.print(delimiter + "\tDate: ");
        int date = scanner.nextInt();

        System.out.print(delimiter + "\tMonth: ");
        int month = scanner.nextInt();

        System.out.print(delimiter + "\tYear: ");
        int year = scanner.nextInt();

        System.out.print(delimiter + "Semester: ");
        short semester = scanner.nextShort();

        System.out.print(delimiter + "GPA: ");
        float gpa = scanner.nextFloat();

        System.out.print(delimiter + "CGPA: ");
        float cgpa = scanner.nextFloat();

        return new ClassStudent(joiningNumber, fullName, LocalDate.of(year, month, date), semester, gpa, cgpa);
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
            "registrationNumber=" + registrationNumber +
            ", fullName='" + fullName + '\'' +
            ", joiningDate=" + joiningDate +
            ", semester=" + semester +
            ", gpa=" + gpa +
            ", cgpa=" + cgpa +
            '}';
    }
}

/**
 * Design a class which represents a student. Every student record is made up of the following fields:<p> (a)
 * Registration Number (int)<p> (b) Full Name (String)<p> (c) Date of Joining (Gregorian Calendar)<p> (d) Semester
 * (short)<p> (e) GPA (float)<p> (f) CGPA (float)<p> Whenever a new student joins, he will be given a new registration
 * number. Registration number is calculated as follows. If year of joining is 2012 and he is the 80th student to join,
 * then his registration number will be 1280. Write member functions to do the following:<p> (a) Provide parameterized
 * constructors to this class.<p> (b) Write a display method which displays the record. Test the class by writing a
 * suitable main method.<p> (c) Create an array of student record to store minimum of 5 records in it. Input the records
 * and display them.
 */
public class Q3 {
    public static void main(String[] args) {
        int length;
        ClassStudent[] students;

        var scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        length = scanner.nextInt();
        scanner.nextLine();

        students = new ClassStudent[length];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent [" + i + ']');
            students[i] = ClassStudent.nextClassStudent(scanner, '\t');
        }

        scanner.close();

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent [" + i + ']');
            System.out.println(students[i]);
        }
    }
}
