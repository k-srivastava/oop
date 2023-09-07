package lab3;

import java.util.Scanner;

/**
 * Define a class Employee having the following members: name, ID, basic, DA, gross salary, net salary and the following
 * methods:<p> (i) read(): to read N employee details<p> (ii) display(): to display employee details<p> (iii)
 * computeNetSalary(): to compute net salary<p> Write a Java program to read data of N employee and compute and display
 * net salary of each employee. Note: (DA = 52% of basic, gross salary = basic + DA, income tax = 30% of the gross
 * salary).
 */
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

    @Override
    public String toString() {
        return "Employee Details:\n" +
            "\tName: " + name + "\n" +
            "\tID: " + id + "\n" +
            "\tBasic Salary: " + basicSalary + "\n" +
            "\tNet Salary: " + netSalary;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee[] employees = Employee.readDetails();

        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Net Salary [" + i + "]: " + employees[i].netSalary);
        }
    }
}
