package command.excersize;


import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by t on 1/22/2019.
 */
public class Demo {
    public static void main(String[] args) {
        Account a = new Account();

        Command command = new Command(Command.Action.DEPOSIT, 100);
        a.process(command);

        assertEquals(100, a.balance);
        assertTrue(command.success);

        command = new Command(Command.Action.WITHDRAW, 50);
        a.process(command);

        assertEquals(50, a.balance);
        assertTrue(command.success);

        command = new Command(Command.Action.WITHDRAW, 150);
        a.process(command);

        assertEquals(50, a.balance);
        Assert.assertFalse(command.success);

    }
}
