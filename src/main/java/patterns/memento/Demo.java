package patterns.memento;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);

        Memento m1 = bankAccount.deposit(150);
        System.out.println(bankAccount);

        Memento m2 = bankAccount.deposit(100);
        System.out.println(bankAccount);

        //rollback
        bankAccount.rollback(m2);
        System.out.println(bankAccount);

        bankAccount.rollback(m1);
        System.out.println(bankAccount);
    }
}
