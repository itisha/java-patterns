package patterns.factory.method;

public class Demo {

    public static void main(String[] args) {
        Point cartesian = Point.Factory.newCartesianPoint(1, 1);
        System.out.println(cartesian);

        Point polar = Point.Factory.newPolarPoint(12, 14);
        System.out.println(polar);
    }

}
