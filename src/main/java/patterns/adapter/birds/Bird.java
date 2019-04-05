package patterns.adapter.birds;

public abstract class Bird {

    abstract String makeSound();

    abstract String fly();

    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName() + ":\n" + makeSound() + "\n" + fly();
    }
}
