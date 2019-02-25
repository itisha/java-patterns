package patterns.proxy.safety;

public class CarProxy extends Car {

    public Driver driver;

    public CarProxy(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        if (driver.age < 18) {
            System.out.println("Driver too young");
        } else {
            super.drive();
        }
    }
}
