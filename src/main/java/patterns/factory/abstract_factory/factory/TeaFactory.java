package patterns.factory.abstract_factory.factory;

import patterns.factory.abstract_factory.model.HotDrink;
import patterns.factory.abstract_factory.model.Tea;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Preparing " +
                amount + " of Tea.");
        return new Tea();
    }
}
