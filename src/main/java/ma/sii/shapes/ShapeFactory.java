package ma.sii.shapes;

import java.util.List;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape(String shapeString, List<Integer> dimentions) {
        final Shape shape;
        switch (shapeString) {
        case "SQUARE":
            shape = new Square(dimentions.get(0));
            break;
        case "RECTANGLE":
            shape = new Rectangle(dimentions.get(0), dimentions.get(1));
            break;
        case "TRIANGLE":
            if (dimentions.size() == 1)

                shape = new DegradedTriangle(dimentions.get(0));
            else
                shape = new Triangle(dimentions.get(0), dimentions.get(1));
            break;

        default:
            throw new IllegalArgumentException();
        }
        return shape;
    }

}
