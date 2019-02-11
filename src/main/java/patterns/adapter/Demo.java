package patterns.adapter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<VectorObject> vectorObjects = new LinkedList<>(Arrays.asList(
                new VectorRectangle(1, 1, 5, 5),
                new VectorRectangle(1, 1, 12, 12)
        ));

        vectorObjects.forEach(vo -> {
            vo.forEach(line -> {
                new LineToPointAdapter(line).forEach(PointDrawingLibrary::drawPoint);
            });
        });

    }
}
