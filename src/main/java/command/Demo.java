package command;


import command.BankAccountCommand.Action;

/**
 * Created by t on 1/22/2019.
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        Lists.of(new BankAccountCommand(ba, Action.DEPOSIT, 100),
                new BankAccountCommand(ba, Action.WIDTHDRAW, 50),
                new BankAccountCommand(ba, Action.WIDTHDRAW, 1000))

                .forEach(command -> {
                    command.call();
                    System.out.println(ba);
                });
    }
}
