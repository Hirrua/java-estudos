package classes_metodos;

public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto (String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    double calcularDesconto (double preco, double desconto) {
        return preco - (preco * desconto);
    }
}
