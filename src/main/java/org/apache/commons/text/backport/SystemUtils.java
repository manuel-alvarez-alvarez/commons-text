package org.apache.commons.text.backport;

public abstract class SystemUtils {

    private SystemUtils() {

    }

    public static String lineSeparator() {
        return java.lang.System.getProperty("line.separator");
    }
}
