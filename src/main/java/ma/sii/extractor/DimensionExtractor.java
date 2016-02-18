package ma.sii.extractor;

import java.util.ArrayList;
import java.util.List;

public class DimensionExtractor {

    private List<Integer> dimensions;

    public DimensionExtractor() {
        this.dimensions = new ArrayList<Integer>();
    }

    public List<Integer> getDimensions() {
        return dimensions;
    }

    public void extract(final String parametrs) {
        String[] parametres = parametrs.split(",");
        for (int i = 0; i < parametres.length; i++) {
            dimensions.add(Integer.parseInt(parametres[i]));
        }
        if (dimensions.size() != 1 && dimensions.size() != 2)
            throw new IllegalArgumentException();
    }

}
