package patterns.command.excersize;

/**
 * Created by t on 1/22/2019.
 */
public class Account {

    public int balance = 0;

    public void process(Command command) {
        switch (command.action) {
            case DEPOSIT: {
                if (command.amount < 0) {
                    command.success = false;
                    System.out.println("Error: Deposit negative value.");
                } else {
                    balance += command.amount;
                    command.success = true;
                    System.out.println("Success: Deposit " + command.amount + " balance = " + balance);
                }
            }
            break;

            case WITHDRAW: {
                if (balance - command.amount < 0) {
                    command.success = false;
                    System.out.println("Error: WITHDRAW too many, balance = " + balance + " amount = " + command.amount);
                } else {
                    balance -= command.amount;
                    command.success = true;
                    System.out.println("Success: WITHDRAW " + command.amount + " balance = " + balance);
                }
            }
            break;
        }
    }
}
