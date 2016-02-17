
public class MeasureExtractor {

    private String measures[];

    public int numberOfMeasures() {
        return measures.length;
    }

    public int getMeasure(final int index) {
        return new Integer(measures[index]);
    }

    public void extract(final String parametrs) {
        measures = parametrs.split(",");
    }

}
