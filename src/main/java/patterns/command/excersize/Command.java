package patterns.command.excersize;

/**
 * Created by t on 1/22/2019.
 */
public class Command {

    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount) {
        this.action = action;
        this.amount = amount;
    }

    enum Action {
        DEPOSIT, WITHDRAW
    }
}
