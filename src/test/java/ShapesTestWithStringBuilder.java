
/*
 * The Shapes class should use the Writer to print the area of the given shape
 * using the dimensions given in the parameters. Every time the Shapes.area
 * method is invoked, it should add a new line.
 *
 * Please implement this class to have all tests in ShapesTest turn green. Try
 * doing that with the simplest, cleanest code you can craft.
 * 
 * Setup the classpath and make sure you can run the ShapesTest. The ShapesTest
 * results will be a main factor when evaluating the solution.
 */

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import ma.sii.formater.BracketFormat;
import ma.sii.formater.Formater;
import ma.sii.writer.Writer;
import ma.sii.writer.WriterForStringBuilder;
import presentation.Shapes;

public class ShapesTestWithStringBuilder {

    private StringBuilder result;
    private Writer writer;
    private Formater formater;
    private Shapes shapes;

    @Before
    public void init() {
        result = new StringBuilder();
        writer = new WriterForStringBuilder(result);
        formater = new BracketFormat();
        shapes = new Shapes(writer, formater);
    }

    @Test
    public void square() throws IOException {
        shapes.area("SQUARE", "30");
        assertEquals("[900]", result.toString());
    }
}
