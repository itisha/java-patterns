package patterns.adapter.birds;

public class ToyDuckAdapter extends Bird {

    private ToyDuck toyDuck;

    public ToyDuckAdapter(ToyDuck toyDuck) {
        this.toyDuck = toyDuck;
    }

    @Override
    public String makeSound() {
        return toyDuck.quack();
    }

    @Override
    public String fly() {
        return "WARNING: Toy ducks don't fly unlesss kicked.";
    }
}
