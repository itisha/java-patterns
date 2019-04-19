package patterns.bridge.automobiles.makes;

public abstract class Make {

    public String getName() {
        return this.getClass().getSimpleName();
    }

}
