package patterns.command;


import com.google.common.collect.Lists;
import patterns.command.BankAccountCommand.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t on 1/22/2019.
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = new ArrayList<>(List.of(
                new BankAccountCommand(ba, Action.DEPOSIT, 100),
                new BankAccountCommand(ba, Action.WIDTHDRAW, 1000))
        );

        commands.forEach(command -> {
            command.call();
            System.out.println(ba);
        });


        Lists.reverse(commands).forEach(command -> {
            command.undo();
            System.out.println(ba);
        });
    }
}
