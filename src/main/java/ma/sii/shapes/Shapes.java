package ma.sii.shapes;

import java.io.StringWriter;

import ma.sii.extractor.DimensionExtractor;

public class Shapes {
    private StringWriter out;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(final String shapeString, final String dimensions) {
        final DimensionExtractor dimensionExtractor = new DimensionExtractor();
        dimensionExtractor.extract(dimensions);
        final ShapeFactory shapeFactory = ShapeFactory.getInstance();
        final Shape shape = shapeFactory.createShape(shapeString, dimensionExtractor.getDimensions());
        out.write(shape.area() + "\n");
    }

}
