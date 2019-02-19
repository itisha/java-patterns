package patterns.decorator.dynamic_decorator.decorator;

import patterns.decorator.dynamic_decorator.shapes.Shape;

public class ColoredShape implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String shapeInfo() {
        return shape.shapeInfo() + " and color = " + color;
    }
}
