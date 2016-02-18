package ma.sii.extractor;

import java.util.ArrayList;
import java.util.List;

public class DimensionExtractor {
    private static DimensionExtractor instance;

    private DimensionExtractor() {
    }

    public static DimensionExtractor getInstance() {
        if (instance == null) {
            instance = new DimensionExtractor();
        }
        return instance;
    }

    public List<Integer> extract(final String parametrs) {
        final String[] parametres = parametrs.split(",");
        final List<Integer> dimensions = convert(parametres);
        checkDimentions(dimensions);
        return dimensions;
    }

    private void checkDimentions(List<Integer> dimensions) {
        if (dimensions.size() != 1 && dimensions.size() != 2)
            throw new IllegalArgumentException();
    }

    private List<Integer> convert(String[] parametres) {
        List<Integer> dimensions = new ArrayList<Integer>();
        for (int i = 0; i < parametres.length; i++) {
            dimensions.add(Integer.parseInt(parametres[i]));
        }
        return dimensions;
    }

}
