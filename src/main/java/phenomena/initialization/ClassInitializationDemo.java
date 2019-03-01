package phenomena.initialization;

public class ClassInitializationDemo {
    static {
        System.out.println("ClassInitializationDemo: static initializer");
    }

    public static void main(String[] args) {
        System.out.println("Subclass.STATIC_FINAL: " + Subclass.STATIC_FINAL);
        System.out.println("Subclass.STATIC_FINAL2: " + Subclass.STATIC_FINAL2);
        new Subclass();
    }
}
