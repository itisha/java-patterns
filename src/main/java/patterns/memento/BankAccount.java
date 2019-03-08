package patterns.memento;

public class BankAccount {

    private int balance = 0;

    public Memento deposit(int amount) {
        Memento memento = new Memento(this.balance);
        this.balance += amount;
        return memento;
    }

    public void rollback(Memento memento) {
        this.balance = memento.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
