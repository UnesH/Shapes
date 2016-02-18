
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
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import ma.sii.formater.Formater;
import ma.sii.formater.NewLineFormat;
import ma.sii.writer.Writer;
import ma.sii.writer.WriterForStringWriter;
import presentation.Shapes;

public class ShapesTestWithStringWriterAndFormater {

    private StringWriter out;
    private Writer writer;
    private Formater formater;
    private Shapes shapes;

    @Before
    public void init() {
        out = new StringWriter();
        writer = new WriterForStringWriter(out);
        formater = new NewLineFormat();
        shapes = new Shapes(writer, formater);
    }

    @Test
    public void square() throws IOException {
        shapes.area("SQUARE", "30");
        assertEquals("900\n", out.toString());
    }

    @Test
    public void rectangle() throws IOException {
        shapes.area("RECTANGLE", "50,20");
        assertEquals("1000\n", out.toString());
    }

    @Test
    public void triangle() throws IOException {
        shapes.area("TRIANGLE", "50,20");
        assertEquals("500\n", out.toString());
    }

    @Test
    public void squareAndTriangle() throws IOException {
        shapes.area("SQUARE", "30");
        shapes.area("TRIANGLE", "40,20");
        assertEquals("900\n400\n", out.toString());
    }

    @Test
    public void degradedTriangle() throws IOException {
        shapes.area("TRIANGLE", "20");
        assertEquals("200\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void unknownShape() throws IOException {
        shapes.area("TERTT", "20");
    }

    @Test(expected = IllegalArgumentException.class)
    public void unknownArgument() throws IOException {
        shapes.area("SQUARE", ",20,30");
    }

}