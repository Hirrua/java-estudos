package generics.instancia;

public class Caixa<T> {

    private T algo;

    public T guardar(T algo) {
        this.algo = algo;
        return algo;
    }
}
