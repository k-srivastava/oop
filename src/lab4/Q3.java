package lab4;

import java.util.Scanner;

enum AccountType {
    Current,
    Savings,
    Joint
}

class BankAccount {
    private static final float INTEREST_RATE = 0.03F;
    public String name;
    public long number;
    public AccountType type;
    public float balance;

    public BankAccount() { }

    public BankAccount(String name, long number, AccountType type, float balance) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public static float interestRate() { return INTEREST_RATE; }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) throws IllegalStateException {
        if (amount > balance) {
            throw new IllegalStateException(
                "Cannot withdraw an amount greater than the current balance: " + amount + " > " + balance + "."
            );
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
            "name='" + name + '\'' +
            ", number=" + number +
            ", type=" + type +
            ", balance=" + balance +
            '}';
    }
}

/**
 * Define a class to represent a bank account. Include the following members:<p> 1. Name of the depositor.<p> 2. Account
 * number.<p> 3. Type of account.<p> 4. Balance amount in the account.<p> 5. Rate of interest (static data).<p><p>
 * Provide a default and parameterized constructor to this class. Also provide the following methods:<p> 1. To deposit
 * amount.<p> 2. To withdraw amount after checking for minimum balance.<p> 3. To display all the details of an account
 * holder.<p> 4. Display rate of interest (static method).
 */
public class Q3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        account.name = scanner.nextLine();

        System.out.print("Enter the account type: ");
        account.type = nextAccountType(scanner);

        System.out.print("Enter the account number: ");
        account.number = scanner.nextLong();

        System.out.print("Enter the account balance: ");
        account.balance = scanner.nextFloat();

        System.out.print("\nEnter the amount to be deposited: ");
        float depositAmount = scanner.nextFloat();
        account.deposit(depositAmount);
        System.out.println("Deposited amount of: " + depositAmount + ". Current balance: " + account.balance + ".");

        System.out.print("\nEnter the amount to be withdrawn: ");
        float withdrawAmount = scanner.nextFloat();

        try {
            account.withdraw(withdrawAmount);
            System.out.println("Withdrew amount of: " + withdrawAmount + ". Current balance: " + account.balance + ".");
        }

        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n" + account);
        System.out.println("Interest Rate: " + BankAccount.interestRate());

        scanner.close();
    }

    private static AccountType nextAccountType(Scanner scanner) throws IllegalArgumentException {
        String accountType = scanner.nextLine();

        return switch (accountType.toLowerCase()) {
            case "current" -> AccountType.Current;
            case "savings" -> AccountType.Savings;
            case "joint" -> AccountType.Joint;

            default -> throw new IllegalArgumentException("Unexpected value: " + accountType.toLowerCase());
        };
    }
}
