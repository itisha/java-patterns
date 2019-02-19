package patterns.decorator.dynamic_decorator;

import patterns.decorator.dynamic_decorator.decorator.ColoredShape;
import patterns.decorator.dynamic_decorator.decorator.TransparentShape;
import patterns.decorator.dynamic_decorator.shapes.Circle;
import patterns.decorator.dynamic_decorator.shapes.Shape;
import patterns.decorator.dynamic_decorator.shapes.Square;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle.shapeInfo());

        Shape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.shapeInfo());

        Shape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.shapeInfo());

        // cannot call myCircle.resize()
    }
}
