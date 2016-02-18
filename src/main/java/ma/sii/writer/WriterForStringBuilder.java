package ma.sii.writer;

public class WriterForStringBuilder implements Writer {

    StringBuilder stringBuilder;

    public WriterForStringBuilder(StringBuilder stringWriter) {
        this.stringBuilder = stringWriter;
    }

    @Override
    public void write(String s) {
        stringBuilder.append(s);
    }

}
