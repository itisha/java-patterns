package patterns.factory.method;

public class Point {

    private double x;
    private double y;

    //constructor is private
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //this class itself is static
    //inner classes not allowed to have static declarations
    //public - to be accessed from other packages
    public static class Factory {

        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.sin(theta), rho * Math.cos(theta));
        }
    }

}
