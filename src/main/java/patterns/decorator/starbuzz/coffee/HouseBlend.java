package patterns.decorator.starbuzz.coffee;

import patterns.decorator.starbuzz.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}
