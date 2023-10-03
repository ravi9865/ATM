package Program3;

import java.util.Scanner;

public class Atm {
    // Initial balance
    private static double balance = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the SBI ATM!");
        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Enter your card your PIN code");
            System.out.println("2. Check Balance of your account");
            System.out.println("3. Deposit money in your account");
            System.out.println("4. Withdraw money from your account");
            System.out.println("5. Display Current Balance of your account");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterCardWithPIN();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    withdraw(scanner);
                    break;
                case 5:
                    displayBalance();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thank you for using the SBI ATM!");
                    break;
                default:
                    System.out.println("Invalid choice, Please select a valid option.");
            }
        }

        scanner.close();
    }

    private static void enterCardWithPIN() {
        System.out.println("Card with PIN entered successfully.");
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    private static void displayBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}
