package patterns.decorator.starbuzz.coffee;

import patterns.decorator.starbuzz.Beverage;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
