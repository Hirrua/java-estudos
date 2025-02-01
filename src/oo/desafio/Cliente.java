package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public double totalCompra = 0;
    List<Compra> listaDeCompras = new ArrayList<Compra>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        this.listaDeCompras.add(compra);
    }

    public void obterValorCompra() {

        for (Compra compraAtual: listaDeCompras) {
            this.totalCompra += compraAtual.obterValor();
        }

        System.out.println("Valor total da compra: R$ " + this.totalCompra);
    }
}
