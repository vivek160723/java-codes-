package DSA_TASK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Double> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, initialBalance);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account already exists!");
        }
    }

    public void displayBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            System.out.println("Account Balance: $" + balance);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void makeTransaction(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double currentBalance = accounts.get(accountNumber);
            double newBalance = currentBalance + amount;
            accounts.put(accountNumber, newBalance);
            System.out.println("Transaction successful!");
        } else {
            System.out.println("Account not found!");
        }
    }
}

public class Tympass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Display Balance");
            System.out.println("3. Make Transaction");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter initial balance: $");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accNumber, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextLine();
                    bank.displayBalance(accNumber);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextLine();
                    System.out.print("Enter transaction amount: $");
                    double amount = scanner.nextDouble();
                    bank.makeTransaction(accNumber, amount);
                    break;

                case 4:
                    System.out.println("Exiting the banking system. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
