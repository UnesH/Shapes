package ma.sii.formater;

public class BracketFormat implements Formater {
    @Override
    public String format(String stringToFormate) {
        final String format = "[" + stringToFormate + "]";
        return format;
    }

}
