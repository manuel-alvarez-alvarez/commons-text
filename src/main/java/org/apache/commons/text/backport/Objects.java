package org.apache.commons.text.backport;

import java.util.Arrays;

public abstract class Objects {

    private Objects() {

    }

    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    public static int hash(Object... values) {
        return Arrays.hashCode(values);
    }

    public static String toString(Object o, String nullDefault) {
        return (o != null) ? o.toString() : nullDefault;
    }

    public static int hashCode(Object o) {
        return o != null ? o.hashCode() : 0;
    }
}
