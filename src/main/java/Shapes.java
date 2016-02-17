import java.io.StringWriter;

public class Shapes {
    private StringWriter out;
    private Shape shape;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(final String shape, final String dimension) {
        createShape(shape, dimension);
        out.write(this.shape.area() + "\n");
    }

    private void createShape(final String string, final String string2) {
        DimensionExtractor dimension = new DimensionExtractor();
        dimension.extract(string2);
        switch (string) {
        case "SQUARE":
            shape = new Square(dimension.getDimension(0));
            break;
        case "RECTANGLE":
            shape = new Rectangle(dimension.getDimension(0), dimension.getDimension(1));
            break;
        case "TRIANGLE":
            if (dimension.numberOfDimensions() == 1)
                shape = new DegradedTriangle(dimension.getDimension(0));
            else
                shape = new Triangle(dimension.getDimension(0), dimension.getDimension(1));
            break;

        default:
            break;
        }
    }

}
