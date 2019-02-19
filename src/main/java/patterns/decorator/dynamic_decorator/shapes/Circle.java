package patterns.decorator.dynamic_decorator.shapes;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void scale(int factor) {
        this.radius = this.radius * factor;
    }

    @Override
    public String shapeInfo() {
        return "Circle with radius = " + radius;
    }
}
