package patterns.bridge.automobiles.cars;

import patterns.bridge.automobiles.makes.Make;

public abstract class Car {

    private Make make;

    public Car(Make make) {
        this.make = make;
    }

    //template method
    public String getDetails() {
        return make.getName() + " " + getType();
    }

    abstract String getType();
}
