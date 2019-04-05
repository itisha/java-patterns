package patterns.decorator.starbuzz.additions;

import patterns.decorator.starbuzz.Beverage;
import patterns.decorator.starbuzz.BeverageDecorator;

public class Baleys extends BeverageDecorator {

    public Baleys(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Baleys, " + beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return 2.00 + beverage.getPrice();
    }
}
