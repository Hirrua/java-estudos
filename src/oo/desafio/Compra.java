package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itensDaCompra = new ArrayList<>();

    public void adicionarItens(String nome, double preco, int qtd) {
        Item i = new Item(new Produto(nome, preco), qtd);
        itensDaCompra.add(i);
    }

    public double obterValor() {
        double total = 0;

        for (Item itens: this.itensDaCompra) {
            total += itens.qtd * itens.produto.preco;
        }

        return total;
    }
}
