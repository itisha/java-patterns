package patterns.decorator.starbuzz.coffee;

import patterns.decorator.starbuzz.Beverage;

public class Decaf implements Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
