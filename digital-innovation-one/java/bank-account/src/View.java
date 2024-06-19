public class View {

    public static void welcomeToBank() {
        System.out.println("-".repeat(25) + " Welcome to Frieren Bank " + "-".repeat(25));
    }

    public static void msgAskClientName() {
        System.out.print("\nEnter client name: ");
    }

    public static void msgAccountCreatedSuccessfully(int accountNumber) {
        System.out.println("Account created successfully. Account number: " + accountNumber);
    }

    public static void msgEnterAccountNumber() {
        System.out.print("\nEnter account number: ");
    }

    public static void msgAccountNotFound() {
        System.out.println("Account not found.");
    }

    public static void msgOptions() {
        System.out.println("\n| 1. Show Balance      |");
        System.out.println("| 2. Deposit           |");
        System.out.println("| 3. Withdraw          |");
        System.out.println("| 4. Transfer          |");
        System.out.println("| 5. Show Transactions |");
        System.out.println("| 6. Exit              |");
        System.out.print("\nChoose an option: ");
    }

    public static void msgInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }

    public static void msgInvalidInput() {
        System.out.println("Invalid input. Please enter a number.");
    }

    public static void msgShowBalance(double balance) {
        System.out.println("\nBalance: $" + balance);
        System.out.println("¨".repeat(7));
    }

    public static void msgAskDepositAmount() {
        System.out.print("\nEnter deposit amount: $");
    }

    public static void msgAskWithdrawAmount() {
        System.out.print("\nEnter withdrawal amount: $");
    }

    public static void msgAskTargetAccountNumber() {
        System.out.print("\nEnter target account number: ");
    }

    public static void msgAskTransferAmount() {
        System.out.print("\nEnter transfer amount: $");
    }

    public static void msgTransferSuccess() {
        System.out.println("Transfer successful.");
    }

    public static void msgTransferFailed() {
        System.out.println("Transfer failed.");
    }

    public static void msgDepositSuccess() {
        System.out.println("Deposited successfully.");
    }

    public static void msgDepositFailed() {
        System.out.println("Deposit failed.");
    }

    public static void msgWithdrawSuccess() {
        System.out.println("Withdrawal successful.");
    }

    public static void msgWithdrawFailed() {
        System.out.println("Withdrawal failed.");
    }

    public static void msgInsufficientFunds() {
        System.out.println("Insufficient funds. Transfer cannot be completed.");
    }

    public static void msgShowTransactions() {
        System.out.println("\nTransactions:");
        System.out.println("-".repeat(80));
    }

    public static void msgProgramTerminatedSuccessfully() {
        System.out.println("Program terminated successfully.");
    }
}
