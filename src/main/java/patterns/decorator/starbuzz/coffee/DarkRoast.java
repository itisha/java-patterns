package patterns.decorator.starbuzz.coffee;

import patterns.decorator.starbuzz.Beverage;

public class DarkRoast implements Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
