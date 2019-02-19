package patterns.decorator.static_decorator.shapes.shapes;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String shapeInfo() {
        return "Square with side = " + side;
    }
}
