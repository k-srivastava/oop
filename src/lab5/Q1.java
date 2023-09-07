package lab5;

import java.util.Scanner;

class Employee {
    public String name;
    public long id;
    public float basicSalary;
    public float dearnessAllowance;
    public float grossSalary;
    public float netSalary;

    public Employee(String name, long id, float basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;

        dearnessAllowance = 0.52F * basicSalary;
        grossSalary = basicSalary + dearnessAllowance;
        float incomeTax = 0.3F * grossSalary;

        netSalary = grossSalary - incomeTax;
    }

    public static Employee[] readDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int number = scanner.nextInt();

        Employee[] employees = new Employee[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Employee [" + i + "]");

            System.out.print("\tName: ");
            String name = scanner.next();

            System.out.print("\tID: ");
            long id = scanner.nextLong();

            System.out.print("\tBasic Salary: ");
            float basicSalary = scanner.nextFloat();

            System.out.println();

            employees[i] = new Employee(name, id, basicSalary);
        }

        scanner.close();
        return employees;
    }

    public static float computeNetSalary(float basicSalary) {
        float dearnessAllowance = 0.52F * basicSalary;
        float grossSalary = basicSalary + dearnessAllowance;
        float incomeTax = 0.3F * grossSalary;

        return grossSalary - incomeTax;
    }

    public String formattedName() {
        String[] names = name.split(" ");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            names[i] = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }

        return String.join(" ", names);
    }

    public String generateEmail(String domain) {
        String[] names = name.split(" ");
        return Character.toLowerCase(names[0].charAt(0)) + names[names.length - 1].toLowerCase() + "@" + domain;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
            "\tName: " + name + "\n" +
            "\tID: " + id + "\n" +
            "\tBasic Salary: " + basicSalary + "\n" +
            "\tNet Salary: " + netSalary;
    }
}

/**
 * Add the following string processing methods to the class Employee:<p> (a) formatEmployeeName(): A method that formats
 * the employee's name by capitalizing the first letter of each word and converting the remaining letters to lowercase.
 * For example, if the employee's name is "JOHN DOE", this method would transform it to "John Doe".<p> (b)
 * generateEmail(): A method that generates an email address for the employee based on their name. For example, if the
 * employee's name is "John Doe", this method would generate an email address like "jdoe@example.com".
 */
public class Q1 { }
