package patterns.factory.abstract_factory.factory;

import patterns.factory.abstract_factory.model.Coffee;
import patterns.factory.abstract_factory.model.HotDrink;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Preparing " +
                amount + " of coffee.");
        return new Coffee();
    }
}
