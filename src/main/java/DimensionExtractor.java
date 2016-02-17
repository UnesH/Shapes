
public class DimensionExtractor {

    private String dimensions[];

    public int numberOfDimensions() {
        return dimensions.length;
    }

    public int getDimension(final int index) {
        return new Integer(dimensions[index]);
    }

    public void extract(final String parametrs) {
        dimensions = parametrs.split(",");
        if (dimensions.length != 1 && dimensions.length != 2)
            throw new IllegalArgumentException();
    }

}
