package patterns.decorator.static_decorator.shapes;

import patterns.decorator.static_decorator.shapes.decorator.ColoredShape;
import patterns.decorator.static_decorator.shapes.decorator.TransparentShape;
import patterns.decorator.static_decorator.shapes.shapes.Circle;
import patterns.decorator.static_decorator.shapes.shapes.Shape;
import patterns.decorator.static_decorator.shapes.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Shape redSquare = new ColoredShape<>(() -> new Square(5), "red");
        System.out.println(redSquare.shapeInfo());

        Shape transparentGreenCircle = new TransparentShape<ColoredShape<Circle>>(() -> new ColoredShape<>(() ->
                new Circle(3.),
                "green"),
                99);
        System.out.println(transparentGreenCircle.shapeInfo());
    }
}
