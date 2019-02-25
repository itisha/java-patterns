package patterns.proxy.safety;

public class Demo {
    public static void main(String[] args) {
        Car safeCar = new CarProxy(new Driver(17));
        safeCar.drive();
    }
}
