package patterns.decorator.starbuzz;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
