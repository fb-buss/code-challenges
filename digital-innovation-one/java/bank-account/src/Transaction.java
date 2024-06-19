import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private LocalDateTime timestamp;
    private String type;
    private double amount;
    private double balanceAfter;

    // Formatador de data e hora para ser utilizado no método toString
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Transaction(String type, double amount, double balanceAfter) {
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    @Override
    public String toString() {
        return timestamp.format(formatter) + " - " + type + ": $" + amount
                + " (Balance: $" + balanceAfter + ")\n" + "-".repeat(80);
    }
}
