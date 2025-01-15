package oo.composicao.onetomany;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compras = new Compra();

        compras.itens.add(new Item("Melancia", 1, 20.0));
        compras.itens.add(new Item("Laranja", 8, 8.0));
        compras.itens.add(new Item("Feijão", 1, 23.0));
        compras.itens.add(new Item("Arroz", 1, 25.0));
        compras.itens.add(new Item("Frango", 5, 15.0));

        compras.visualizarItens();
        System.out.println(compras.valorTotal());
    }
}
