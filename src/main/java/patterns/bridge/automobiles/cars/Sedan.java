package patterns.bridge.automobiles.cars;

import patterns.bridge.automobiles.makes.Make;

public class Sedan extends Car {

    public Sedan(Make make) {
        super(make);
    }

    @Override
    String getType() {
        return "Sedan";
    }
}
