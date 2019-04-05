package patterns.decorator.starbuzz.additions;

import patterns.decorator.starbuzz.Beverage;
import patterns.decorator.starbuzz.BeverageDecorator;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Milk, " + beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.44 + beverage.getPrice();
    }
}
