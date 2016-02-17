import java.io.StringWriter;

public class Shapes {
    private StringWriter out;
    private Shape shape;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(final String string, final String string2) {
        createShape(string, string2);
        out.write(shape.area() + "\n");
    }

    private void createShape(final String string, final String string2) {
        DimensionExtractor dimensions = new DimensionExtractor();
        dimensions.extract(string2);
        switch (string) {
        case "SQUARE":
            shape = new Square(dimensions.getDimension(0));
            break;
        case "RECTANGLE":
            shape = new Rectangle(dimensions.getDimension(0), dimensions.getDimension(1));
            break;
        case "TRIANGLE":
            if (dimensions.numberOfDimensions() == 1)
                shape = new Triangle(dimensions.getDimension(0));
            else
                shape = new Triangle(dimensions.getDimension(0), dimensions.getDimension(1));
            break;
        }
    }

}
