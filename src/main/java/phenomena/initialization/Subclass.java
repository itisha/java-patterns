package phenomena.initialization;

public class Subclass extends Superclass {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = (int) Math.random() * 5;

    static {
        System.out.println("Subclass: static initializer");
    }

    public Subclass() {
        System.out.println("Subclass: constructor");
    }
}
