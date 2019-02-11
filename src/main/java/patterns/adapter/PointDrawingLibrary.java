package patterns.adapter;

public class PointDrawingLibrary {

    //this is the only API that we can use for drawing
    //we cannot modify it for whatever reason
    public static void drawPoint(Point point) {
        System.out.println(point.toString());
    }
}
