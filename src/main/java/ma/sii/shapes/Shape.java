package ma.sii.shapes;

import ma.sii.formater.Formater;

public abstract class Shape {
    public abstract int area();

    public final String formatedArea(Formater formater) {
        String area = String.valueOf(area());
        String formatedArea = formater.format(area);
        return formatedArea;
    }

}
