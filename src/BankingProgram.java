import java.util.Scanner;

// java banking program!

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    static void main() {

        double balance = 0;
        boolean isRunning = true;
        int choice;


        while(isRunning) {
            System.out.println("###############");
            System.out.println("BANKING PROGRAM");
            System.out.println("###############");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("###############");
            System.out.print("Choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID OPTION");

            }
        }

        System.out.println("###############");
        System.out.println("Have a nice day.");
        System.out.println("###############");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("###############");
        System.out.printf("Balance: $%.2f\n",balance);

    }
    static double deposit(){

        double amount;

        System.out.print("Amount to be deposited: ");
        amount = scanner.nextInt();

        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount;

        System.out.print("amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds.");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}