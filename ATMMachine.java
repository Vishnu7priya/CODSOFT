package atmmachine;
import java.util.Scanner;
class BankAccount {
    
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
class ATM {
    
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void Menu() {
        
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        
        System.out.println("\nEnter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("\nYour balance is: " + account.getBalance()+"Rs");
                break;
            case 2:
                System.out.print("\nEnter deposit amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                System.out.println("Deposit successful.");
                break;
            case 3:
                System.out.print("\nEnter withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();
                if (account.withdraw(withdrawalAmount)) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient funds.");
                }
                break;
            case 4:
                System.out.println("Thank you");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
        System.out.println();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1500);
        ATM atm = new ATM(account);
        while(true){
            atm.Menu();
        }
    }
}