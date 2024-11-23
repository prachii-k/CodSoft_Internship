package task_3;
import java.util.Scanner;

class BankAccount1 {
    private double balance;

    public BankAccount1(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful\n");
        }else {
        	System.out.println("Invalid entry!\n");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        	System.out.println("Withdeawal Successful\n");
            balance -= amount;
        }else {
        System.out.println("Insuffucient Balance\n");
        }
    }
}
  

class ATM {
    private BankAccount1 account;

    public ATM(BankAccount1 account) {
        this.account = account;
    }

    public ATM(BankAccount1 account2) {
		// TODO Auto-generated constructor stub
	}

	public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;
                    
                case 2:
                    System.out.print("Enter the deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    
                case 3:
                    System.out.print("Enter the withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);  
                    break;
                    
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class ATMIntrDemo {
    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1(1000.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}



