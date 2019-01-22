package command;

/**
 * Created by t on 1/22/2019.
 */
public class BankAccountCommand implements Command {

    private BankAccount bankAccount;
    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                bankAccount.deposit(amount);
                break;
            case WIDTHDRAW:
                bankAccount.widthdraw(amount);
                break;
        }
    }

    public enum Action {
        DEPOSIT, WIDTHDRAW
    }
}
