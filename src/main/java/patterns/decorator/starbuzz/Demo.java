package patterns.decorator.starbuzz;

import patterns.decorator.starbuzz.additions.Baleys;
import patterns.decorator.starbuzz.additions.Milk;
import patterns.decorator.starbuzz.additions.Syrup;
import patterns.decorator.starbuzz.coffee.DarkRoast;
import patterns.decorator.starbuzz.coffee.Espresso;
import patterns.decorator.starbuzz.coffee.HouseBlend;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Latte:");
        Beverage latte = new Milk(new HouseBlend());
        System.out.println(latte.getDescription());
        System.out.println(latte.getPrice());

        System.out.println("\nMocha:");
        Beverage mocha = new Syrup(new Milk(new Espresso()));
        System.out.println(mocha.getDescription());
        System.out.println(mocha.getPrice());

        System.out.println("\nIrish Coffee");
        Beverage irishCoffee = new Baleys(new Syrup(new Milk(new Milk(new DarkRoast()))));
        System.out.println(irishCoffee.getDescription());
        System.out.println(irishCoffee.getPrice());

    }
}
