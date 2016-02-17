import java.io.StringWriter;

public class Shapes {
    private StringWriter out;
    private Shape shape;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(String string, String string2) {
        createShape(string, string2);
        out.write(shape.area() + "\n");
    }

    private void createShape(String string, String string2) {
        String[] parameters = extractParameters(string2);
        switch (string) {
        case "SQUARE":
            shape = new Square(new Integer(parameters[0]));
            break;
        case "RECTANGLE":
            shape = new Rectangle(new Integer(parameters[0]), new Integer(parameters[1]));
            break;
        case "TRIANGLE":
            if (parameters.length == 1)
                shape = new Triangle(new Integer(parameters[0]));
            else
                shape = new Triangle(new Integer(parameters[0]), new Integer(parameters[1]));
            break;
        }
    }

    private String[] extractParameters(String string) {
        String splitedParametrs[] = string.split(",");
        return splitedParametrs;
    }

}
