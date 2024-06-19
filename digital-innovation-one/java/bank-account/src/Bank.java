import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {

    private Scanner scanner;
    private Map<Integer, Account> accounts;
    private Client client;
    private static int number = 1;

    public Bank() {
        scanner = new Scanner(System.in);
        accounts = new HashMap<>();
        View.welcomeToBank();
    }

    public void createAccount() {
        askForClientName();
        createNewAccount();
    }

    private void askForClientName() {
        View.msgAskClientName();
        String name = scanner.nextLine();
        client = new Client(name);
    }

    private void createNewAccount() {
        accounts.put(number, new Account(client));
        View.msgAccountCreatedSuccessfully(number);
        number++;
    }

    private int getAccountNumber() {
        int accountNumber;
        while (true) {
            try {
                View.msgEnterAccountNumber();
                accountNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                View.msgInvalidInput();
            }
        }
        return accountNumber;
    }

    public void accountOptions() {
        int accountNumber = getAccountNumber();
        Account account = accounts.get(accountNumber);
        if (account == null) {
            View.msgAccountNotFound();
            return;
        }

        boolean continueOperation = true;
        while (continueOperation) {
            View.msgOptions();
            int option = getValidOption();
            switch (option) {
                case 1:
                    showBalance(account);
                    break;
                case 2:
                    deposit(account);
                    break;
                case 3:
                    withdraw(account);
                    break;
                case 4:
                    transfer(account);
                    break;
                case 5:
                    showTransactions(account);
                    break;
                case 6:
                    continueOperation = false;
                    break;
                default:
                    View.msgInvalidOption();
                    break;
            }
        }
        View.msgProgramTerminatedSuccessfully();
    }

    private int getValidOption() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            View.msgInvalidInput();
            return -1;
        }
    }

    private void showBalance(Account account) {
        View.msgShowBalance(account.getBalance());
    }

    private void deposit(Account account) {
        View.msgAskDepositAmount();
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.println("¨".repeat(20));
            if (amount > 0) {
                account.deposit(amount);
                View.msgDepositSuccess();
            } else {
                View.msgInvalidInput();
            }
        } catch (NumberFormatException e) {
            View.msgInvalidInput();
        }
    }

    private void withdraw(Account account) {
        View.msgAskWithdrawAmount();
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.println("¨".repeat(23));
            if (amount > account.getBalance()) {
                View.msgInsufficientFunds();
            } else {
                account.withdraw(amount);
                View.msgWithdrawSuccess();
            }
        } catch (NumberFormatException e) {
            View.msgInvalidInput();
        }
    }

    private void transfer(Account account) {
        View.msgAskTargetAccountNumber();
        try {
            int targetAccountNumber = Integer.parseInt(scanner.nextLine());
            Account targetAccount = accounts.get(targetAccountNumber);
            if (targetAccount == null) {
                View.msgAccountNotFound();
                return;
            }
            View.msgAskTransferAmount();
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.println("¨".repeat(21));
            if (amount > account.getBalance()) {
                View.msgInsufficientFunds();
            } else {
                account.transfer(amount, targetAccount);
                View.msgTransferSuccess();
            }
        } catch (NumberFormatException e) {
            View.msgInvalidInput();
        }
    }

    private void showTransactions(Account account) {
        View.msgShowTransactions();
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }
    }
}
