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
        MeasureExtractor measure = new MeasureExtractor();
        measure.extract(string2);
        switch (string) {
        case "SQUARE":
            shape = new Square(measure.getParameter(0));
            break;
        case "RECTANGLE":
            shape = new Rectangle(measure.getParameter(0), measure.getParameter(1));
            break;
        case "TRIANGLE":
            if (measure.numberOfParameters() == 1)
                shape = new Triangle(measure.getParameter(0));
            else
                shape = new Triangle(measure.getParameter(0), measure.getParameter(1));
            break;
        }
    }

}
