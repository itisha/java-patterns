package patterns.decorator.starbuzz.additions;

import patterns.decorator.starbuzz.Beverage;
import patterns.decorator.starbuzz.BeverageDecorator;

public class Syrup extends BeverageDecorator {

    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Syrup, " + beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.20 + beverage.getPrice();
    }
}
