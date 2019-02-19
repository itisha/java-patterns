package patterns.decorator.static_decorator.shapes.decorator;


import patterns.decorator.static_decorator.shapes.shapes.Shape;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

    private T shape;
    private Integer transparency;

    public TransparentShape(Supplier<? extends T> supplier, Integer transparency) {
        this.shape = supplier.get();
        this.transparency = transparency;
    }

    @Override
    public String shapeInfo() {
        return shape.shapeInfo() + " and transparency = " + transparency;
    }
}
