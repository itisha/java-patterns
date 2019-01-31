package patterns.command;

/**
 * Created by t on 1/22/2019.
 */
public class BankAccount {

    private int balance = 0;
    private int overdraftLimit = -500;

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean widthdraw(int amount) {
        if (balance - amount > overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

}
