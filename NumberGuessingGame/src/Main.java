import java.util.Scanner;

class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 10.0;
        boolean continueShopping = true;

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Initial Balance: $" + balance);

        while (continueShopping) {
            System.out.println("\nAvailable Items:");
            System.out.println("1. Coke - $1.25");
            System.out.println("2. Pepsi - $1.50");
            System.out.println("3. Milk - $0.75");
            System.out.println("4. Water - $0.25");
            System.out.println("0. Exit");

            System.out.print("Enter the number of the item you wish to purchase (or 0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                continueShopping = false;
                System.out.println("Thank you for using the Vending Machine. Your remaining balance is: $" + balance);
            } else {
                double itemPrice = 0.0;
                String itemName = "";

                switch (choice) {
                    case 1:
                        itemName = "Coke";
                        itemPrice = 1.25;
                        break;
                    case 2:
                        itemName = "Pepsi";
                        itemPrice = 1.50;
                        break;
                    case 3:
                        itemName = "Milk";
                        itemPrice = 0.75;
                        break;
                    case 4:
                        itemName = "Water";
                        itemPrice = 0.25;
                        break;
                    default:
                        System.out.println("Invalid selection. Please choose a valid item.");
                        continue;
                }

                if (balance >= itemPrice) {
                    System.out.println("Dispensing " + itemName + ". Enjoy your drink!");
                    balance -= itemPrice;
                    System.out.println("Remaining Balance: $" + balance);
                } else {
                    System.out.println("Insufficient funds. Please add more money or choose a cheaper item.");
                }
            }
        }
        scanner.close();
    }
}
