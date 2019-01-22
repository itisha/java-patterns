package command;


import command.BankAccountCommand.Action;
import java.util.Arrays;

/**
 * Created by t on 1/22/2019.
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        Arrays.asList(new BankAccountCommand(ba, Action.DEPOSIT, 100),
                new BankAccountCommand(ba, Action.WIDTHDRAW, 50),
                new BankAccountCommand(ba, Action.WIDTHDRAW, 1000))

                .forEach(command -> {
                    command.call();
                    System.out.println(ba);
                });
    }
}
