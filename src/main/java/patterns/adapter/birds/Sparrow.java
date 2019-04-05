package patterns.adapter.birds;

public class Sparrow extends Bird {
    @Override
    public String makeSound() {
        return "чык-чырык!";
    }

    @Override
    public String fly() {
        return "Sparrow flies.";
    }
}
