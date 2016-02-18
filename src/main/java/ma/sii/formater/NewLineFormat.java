package ma.sii.formater;

public class NewLineFormat implements Formater {
    @Override
    public String format(String stringToFormate) {
        final String format = stringToFormate + "\n";
        return format;
    }

}
