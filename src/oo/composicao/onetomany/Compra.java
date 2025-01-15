package oo.composicao.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    // Uma compra tem muitos itens
    List<Item> itens = new ArrayList<Item>();

    public void visualizarItens() {
        for (Item item: this.itens) {
            System.out.println(item.nome);
        }
    }

    public double valorTotal() {
        double soma = 0;

        if (itens.isEmpty()) {
            return 0.0;
        }

        for (Item item: this.itens) {
            soma += item.quantidade * item.preco;
        }

        return soma;
    }
}
