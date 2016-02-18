package presentation;

import java.io.StringWriter;
import java.util.List;

import ma.sii.extractor.DimensionExtractor;
import ma.sii.formater.Formater;
import ma.sii.formater.NewLineFormat;
import ma.sii.shapes.Shape;
import ma.sii.shapes.ShapeFactory;
import ma.sii.writer.Writer;
import ma.sii.writer.WriterForStringWriter;

public class Shapes {
    private final Writer writer;
    private final DimensionExtractor dimensionExtractor;
    private final ShapeFactory shapeFactory;
    private final Formater formater;

    public Shapes(StringWriter out) {
        this.writer = new WriterForStringWriter(out);
        this.formater = new NewLineFormat();
        dimensionExtractor = DimensionExtractor.getInstance();
        shapeFactory = ShapeFactory.getInstance();
    }

    public Shapes(Writer writer, Formater formater) {
        this.writer = writer;
        this.formater = formater;
        dimensionExtractor = DimensionExtractor.getInstance();
        shapeFactory = ShapeFactory.getInstance();
    }

    public void area(final String nameOfShape, final String parameterForDimensions) {
        final List<Integer> dimensions = dimensionExtractor.extract(parameterForDimensions);
        final Shape shape = shapeFactory.createShape(nameOfShape, dimensions);
        String area = String.valueOf(shape.area());
        String formatedArea = formater.format(area);
        writer.write(formatedArea);
    }

}
