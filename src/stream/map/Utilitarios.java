package stream.map;

import java.util.function.UnaryOperator;

public class Utilitarios {

    public static final UnaryOperator<String> maiuscula = String::toUpperCase;
    public static final UnaryOperator<String> grito() {
        return n-> n + "!!!!";
    }
}
