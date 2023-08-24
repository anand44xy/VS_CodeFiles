package Banking_Applicaton;
import java.util.Scanner;

class AccountHolder {
    int balance;
    int withdrawnAmount;
    int depositAmount;

    public void withdrawCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Withdraw Amount:");
        withdrawnAmount = scanner.nextInt();
        if (withdrawnAmount <= balance) {
            balance -= withdrawnAmount;
            System.out.println(withdrawnAmount + " Amount is Withdrawn Successfully");
        } else {
            System.out.println("Your account balance is insufficient!");
        }
    }

    public void depositCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Deposit Amount:");
        depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println(depositAmount + " Amount is Deposited Successfully");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void openAccount() {
        Scanner scanner = new Scanner(System.in);
        // Take Account Holder Data to open an account...
        System.out.println("Enter your Full Name:");
        String name = scanner.nextLine();
        System.out.println("Enter your DOB(xx/yy/zzzz):");
        String dob = scanner.nextLine();
        System.out.println("Enter Your Phone Number:");
        String phoneNO = scanner.nextLine();
        System.out.println("Congratulations! Your account has been successfully opened.");
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHolder accountHolder = new AccountHolder();
        BankApplication bankApp = new BankApplication();
        

        Scanner scn = new Scanner(System.in);
        int choice;
           // Menu for Action
            System.out.println("* Welcome to SBI Branch Bansoor 301402 *");
            System.out.println("_________________________");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("_________________________");

            while (true){
            System.out.println("Enter your choice:");
            choice = scn.nextInt();
            scn.nextLine();
            switch (choice) {
                case 1:
                    accountHolder.openAccount();
                    break;
                case 2:
                    accountHolder.depositCash();
                    break;
                case 3:
                    accountHolder.withdrawCash();
                    break;
                case 4:
                    accountHolder.checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using our services. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
