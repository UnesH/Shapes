package ma.sii.writer;

import java.io.StringWriter;

public class WriterForStringWriter implements Writer {

    StringWriter stringWriter;

    public WriterForStringWriter(StringWriter stringWriter) {
        this.stringWriter = stringWriter;
    }

    @Override
    public void write(String s) {
        stringWriter.write(s);
    }
}