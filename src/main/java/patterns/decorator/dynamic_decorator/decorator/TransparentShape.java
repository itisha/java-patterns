package patterns.decorator.dynamic_decorator.decorator;

import patterns.decorator.dynamic_decorator.shapes.Shape;

public class TransparentShape implements Shape {

    private Shape shape;
    private Integer transparency;

    public TransparentShape(Shape shape, Integer transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String shapeInfo() {
        return shape.shapeInfo() + " and transparency = " + transparency;
    }
}
