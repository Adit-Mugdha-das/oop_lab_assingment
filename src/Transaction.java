import java.time.LocalDateTime;

public class Transaction {
    public enum Type { DEPOSIT, WITHDRAW }
    public final Type type;
    public final double amount;
    public final LocalDateTime time;

    public Transaction(Type type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    @Override public String toString() {
        return time + " - " + type + ": " + amount;
    }
}