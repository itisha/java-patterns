package patterns.factory.abstract_factory.model;

public class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("Coffee is delicious.");
    }
}
