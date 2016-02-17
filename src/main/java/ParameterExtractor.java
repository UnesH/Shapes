
public class ParameterExtractor {

    private Double parameters[];

    public int numberOfParameters() {
        return parameters.length;
    }

    public Double getParameter(int index) {
        return parameters[index];
    }

    public void extract(String parametrs) {
        String splitedParametrs[] = parametrs.split(",");
        stringToDoubleConverter(splitedParametrs);
    }

    private void stringToDoubleConverter(String[] splitedParametrs) {
        for (int i = 0; i < splitedParametrs.length; i++)
            parameters[i] = Double.parseDouble(splitedParametrs[i]);
    }

}
