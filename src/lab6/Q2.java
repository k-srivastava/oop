package lab6;

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

    public void computeNetSalary() {
        dearnessAllowance = 0.52F * basicSalary;
        grossSalary = basicSalary + dearnessAllowance;
        float incomeTax = 0.3F * grossSalary;

        netSalary = grossSalary - incomeTax;
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

class PartTimeEmployee extends Employee {
    public int hoursWorked;
    public static final float HOURLY_RATE = 150F;

    public PartTimeEmployee(String name, long id, int hoursWorked) {
        super(name, id, hoursWorked * HOURLY_RATE);
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
            "hoursWorked=" + hoursWorked +
            ", name='" + name + '\'' +
            ", id=" + id +
            ", basicSalary=" + basicSalary +
            ", dearnessAllowance=" + dearnessAllowance +
            ", grossSalary=" + grossSalary +
            ", netSalary=" + netSalary +
            '}';
    }
}

class FullTimeEmployee extends Employee {
    public float bonus;
    public float deductions;

    public FullTimeEmployee(String name, long id, float basicSalary, float bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public void computeNetSalary() {
        dearnessAllowance = 0.52F * basicSalary;
        grossSalary = basicSalary + dearnessAllowance + bonus - deductions;
        float incomeTax = 0.3F * grossSalary;

        netSalary = grossSalary - incomeTax;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
            "bonus=" + bonus +
            ", deductions=" + deductions +
            ", name='" + name + '\'' +
            ", id=" + id +
            ", basicSalary=" + basicSalary +
            ", dearnessAllowance=" + dearnessAllowance +
            ", grossSalary=" + grossSalary +
            ", netSalary=" + netSalary +
            '}';
    }
}

public class Q2 { }
