package patterns.decorator.starbuzz;

public interface Beverage {

    default String getDescription() {
        return "Unknown";
    }

    default double getPrice() {
        return 0.00;
    }

}
