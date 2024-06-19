import java.util.ArrayList;
import java.util.List;

public class Account {

    private double balance;
    private List<Transaction> transactions;

    public Account(Client client) {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transactions.add(new Transaction("Deposit", amount, this.balance));
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, this.balance));
        }
    }

    public void transfer(double amount, Account target) {
        if (amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            target.deposit(amount);
            transactions.add(new Transaction("Transfer to account " + target.hashCode(), amount, this.balance));
            target.getTransactions()
                    .add(new Transaction("Transfer from account " + this.hashCode(), amount, target.getBalance()));
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
