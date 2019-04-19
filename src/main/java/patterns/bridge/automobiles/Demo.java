package patterns.bridge.automobiles;

import patterns.bridge.automobiles.cars.Car;
import patterns.bridge.automobiles.cars.Sedan;
import patterns.bridge.automobiles.makes.Honda;

public class Demo {

    public static void main(String[] args) {

        //Decouple abstraction Car from implementation Make
        //Easy to add new classes
        //Ho huge and complicated hierarchy

        //now we can create any type of car from any make:
        Car car = new Sedan(new Honda());

        System.out.println();
        System.out.println("*** " + car.getDetails() + " ***");
        System.out.println();
    }
}
