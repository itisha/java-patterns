package patterns.bridge.automobiles.cars;

import patterns.bridge.automobiles.makes.Make;

public class Hatchback extends Car {

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    String getType() {
        return "Hatchback";
    }
}
