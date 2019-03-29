package concurrency.race.condition.problem;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);

        Thread john = new Thread(bankAccount);
        john.setName("John");

        Thread anita = new Thread(bankAccount);
        anita.setName("Anita");

        john.start();
        anita.start();
    }
}


class BankAccount implements Runnable {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void run() {
        makeWithdrawal(75);
        if (balance < 0) {
            System.out.println("Money overdrawn!!!");
        }
    }

    private void makeWithdrawal(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
        } else {
            System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
        }
    }

}