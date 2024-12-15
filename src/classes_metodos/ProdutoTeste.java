package classes_metodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("PlayStation 5", 2789.91, 0.45); // No mesmo package não preciso realizar o IMPORT

        double preco_final = p1.calcularDesconto(p1.preco, p1.desconto);
        System.out.printf("Nome do produto: %s\nPreço final: %.2f", p1.nome, preco_final);

    }
}
