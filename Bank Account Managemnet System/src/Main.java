import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Parameterized constructor
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method to deposit funds
    public void depositFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
            System.out.println(". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw funds
    public void withdrawFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("=====> Account Details <=====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: $" + balance);
    }
}

class BankAccountManagementSystem {

    public static void main(String[] args) {
        // Create an instance of the BankAccount class
        BankAccount account = new BankAccount("12345098765", 1000.0, "Luca Johanson", "Luca@example.com", "088989999");

        // Display initial account details
        account.displayAccountDetails();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Menu-based system
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Funds");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Get user input for the menu choice
            choice = scanner.nextInt();

            // Perform operations based on user's choice
            switch (choice) {
                case 1:
                    // Deposit Funds
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.depositFunds(depositAmount);
                    break;

                case 2:
                    // Withdraw Funds
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawFunds(withdrawAmount);
                    break;

                case 3:
                    // View Account Details
                    account.displayAccountDetails();
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting Bank Account Management System. Thank you!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        // Close the Scanner
        scanner.close();
    }
}
