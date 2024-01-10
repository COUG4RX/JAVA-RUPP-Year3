import java.util.Scanner;

class BankAccountManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account instance
        BankAccount account = new BankAccount("Lucas Hernandes", 1000.0);

        // Display initial account details
        System.out.println("Welcome to the Bank Account Management System");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Funds");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");

            // Prompt user for choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.depositFunds(depositAmount);
                        System.out.println("Deposit successful. New balance: " + account.getBalance());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdrawFunds(withdrawAmount);
                        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Account Holder: " + account.getAccountHolderName());
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        // Generate a unique account number (implementation not shown for brevity)
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void depositFunds(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdrawFunds(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }

    private String generateAccountNumber() {
        // Implement your logic to generate a unique account number
        // For simplicity, let's assume a random 6-digit number
        return String.format("%06d", (int) (Math.random() * 1000000));
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
