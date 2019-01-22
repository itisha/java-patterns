package command;

/**
 * Created by t on 1/22/2019.
 */
public class BankAccount {

    int balance = 0;
    int overdraftLimit = -500;

    public void deposit(int amount) {
        balance += amount;
    }

    public void widthdraw(int amount) {
        if (balance - amount > overdraftLimit) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

}
