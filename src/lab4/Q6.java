package lab4;

import java.util.Scanner;

class Customer {
    private final long id;
    private final String name;
    private final float creditLimit;

    public Customer(long id, String name, float creditLimit) {
        this.id = id;
        this.name = name;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", creditLimit=" + creditLimit +
            '}';
    }
}

/**
 * Define a class Customer that holds private fields for a customer ID number, name and credit limit. Include
 * appropriate constructors to initialize the instance variables of the class. Write a main() method that declared an
 * array of 5 Customer objects. Prompt the user for values for each customer and display all 5 customer objects.
 */
public class Q6 {
    public static void main(String[] args) {
        Customer[] customers;
        int length;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        length = scanner.nextInt();

        customers = new Customer[length];

        System.out.println();
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Customer [" + i + "]");

            System.out.print("\tID: ");
            long customerID = scanner.nextLong();
            scanner.nextLine();

            System.out.print("\tName: ");
            String customerName = scanner.nextLine();

            System.out.print("\tCredit Limit: ");
            float customerCreditLimit = scanner.nextFloat();

            System.out.println();

            customers[i] = new Customer(customerID, customerName, customerCreditLimit);
        }

        scanner.close();

        System.out.println();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
