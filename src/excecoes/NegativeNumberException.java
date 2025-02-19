package excecoes;

public class NegativeNumberException extends RuntimeException {

    private final String atributoNegarivo;

    public NegativeNumberException(String atributoNegarivo) {
        this.atributoNegarivo = atributoNegarivo;
    }

    public String getMessage() {
        return String.format("O atributo %s está negativo", atributoNegarivo);
    }
}
