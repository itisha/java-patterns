package patterns.factory.abstract_factory.model;

public class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("Tes is delicious.");
    }
}
