
public class MeasureExtractor {

    private String parameters[];

    public int numberOfParameters() {
        return parameters.length;
    }

    public int getParameter(final int index) {
        return new Integer(parameters[index]);
    }

    public void extract(final String parametrs) {
        parameters = parametrs.split(",");
    }

}
