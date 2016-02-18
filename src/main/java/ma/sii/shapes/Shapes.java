package ma.sii.shapes;

import java.io.StringWriter;

import ma.sii.extractor.DimensionExtractor;

public class Shapes {
    private StringWriter out;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(final String shapeString, final String dimension) {
        DimensionExtractor dimensions = new DimensionExtractor();
        dimensions.extract(dimension);
        Shape shape = ShapeFactory.getInstance().createShape(shapeString, dimensions.getDimension());
        out.write(shape.area() + "\n");
    }

}
