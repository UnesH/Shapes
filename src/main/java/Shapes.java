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
        DimensionExtractor measure = new DimensionExtractor();
        measure.extract(string2);
        switch (string) {
        case "SQUARE":
            shape = new Square(measure.getDimension(0));
            break;
        case "RECTANGLE":
            shape = new Rectangle(measure.getDimension(0), measure.getDimension(1));
            break;
        case "TRIANGLE":
            if (measure.numberOfDimensions() == 1)
                shape = new Triangle(measure.getDimension(0));
            else
                shape = new Triangle(measure.getDimension(0), measure.getDimension(1));
            break;
        }
    }

}
