package meli.java.e1;

import java.util.InvalidPropertiesFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String value;
    private Pattern regex;
    private String format;
    public Password() {
    }

    public Password(String regex) {
        this.regex = Pattern.compile(regex);
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) throws Exception {
        Matcher matcher = this.regex.matcher(value);
        if (!matcher.find()) { throw new InvalidPropertiesFormatException(this.format); }
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
