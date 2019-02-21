package patterns.decorator.static_decorator.shapes;

import patterns.decorator.static_decorator.shapes.decorator.ColoredShape;
import patterns.decorator.static_decorator.shapes.decorator.TransparentShape;
import patterns.decorator.static_decorator.shapes.shapes.Circle;
import patterns.decorator.static_decorator.shapes.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.shapeInfo());

        ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20), "blue");
        System.out.println(blueSquare.shapeInfo());

        // ugly!
        TransparentShape<ColoredShape<Circle>> myCircle =
                new TransparentShape<>(() ->
                        new ColoredShape<>(() -> new Circle(5), "green"), 50
                );
        System.out.println(myCircle.shapeInfo());
        // cannot call myCircle.resize()
    }
}
