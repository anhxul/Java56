package UNIT_1;

public class UserCreatedBalanceException {
    private int balance = 10000;

    public void validate(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Balance " + balance + " Successfully debited.");
        }
    }
}