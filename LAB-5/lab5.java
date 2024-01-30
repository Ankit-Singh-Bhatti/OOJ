import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
}

class CurAcct extends Account {
    double minimumBalance = 1000; // Minimum balance required for a current account
    double serviceCharge = 100; // Service charge imposed if balance falls below the minimum

    public CurAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current Account", balance);
    }

    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of " + serviceCharge + " imposed for falling below minimum balance.");
            System.out.println("Updated balance: " + balance);
        }
    }
}

class SavAcct extends Account {
    double interestRate = 0.05; // Compound interest rate for savings account

    public SavAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings Account", balance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest computed and deposited. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class lab5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example Usage
        CurAcct currentAccount = new CurAcct("John Doe", 123456789, 1500);
        currentAccount.displayBalance();
        currentAccount.checkMinimumBalance(); // No service charge

        System.out.println("\nEnter the deposit amount: ");
        double depositAmount = scanner.nextDouble();
        currentAccount.deposit(depositAmount);
        currentAccount.checkMinimumBalance(); // Service charge imposed

        SavAcct savingsAccount = new SavAcct("Jane Doe", 987654321, 5000);
        savingsAccount.displayBalance();

        System.out.println("\nEnter the withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawalAmount);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.displayBalance();
    }
}
