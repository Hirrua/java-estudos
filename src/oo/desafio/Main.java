package oo.desafio;


public class Main {
    public static void main(String[] args) {
        /*
        * Criar cliente
        * Criar duas compras (cada compra com 2 itens)
        * Cada item associado ao produto
        * */

        Compra c1 = new Compra();
        c1.adicionarItens("Melancia", 20.0, 2);
        c1.adicionarItens("Laranja", 8.0, 2);

        Compra c2 = new Compra();
        c2.adicionarItens("Arroz", 25.0, 2);
        c2.adicionarItens("Feijão", 17.50, 2);

        Cliente cliente = new Cliente("João");
        cliente.adicionarCompra(c1);
        cliente.adicionarCompra(c2);
        cliente.obterValorCompra();
    }
}
