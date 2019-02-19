package patterns.decorator.static_decorator.shapes.decorator;


import patterns.decorator.static_decorator.shapes.shapes.Shape;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {

    private T shape;
    private String color;

    public ColoredShape(Supplier<? extends T> supplier, String color) {
        this.shape = supplier.get();
        this.color = color;
    }

    @Override
    public String shapeInfo() {
        return shape.shapeInfo() + " and color = " + color;
    }
}
