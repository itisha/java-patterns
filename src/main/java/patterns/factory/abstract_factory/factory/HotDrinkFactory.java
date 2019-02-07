package patterns.factory.abstract_factory.factory;

import patterns.factory.abstract_factory.model.HotDrink;

public interface HotDrinkFactory {
    HotDrink prepare(int amount);
}
