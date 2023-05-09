import java.util.Scanner;

public class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Transaction is Successful");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();

        BankAccount account = new BankAccount(5000); // initialize account balance
        try {
            account.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
