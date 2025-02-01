package lambdas.desafio;

import lambdas.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {

        /*
        * 1. A partir do produto calcular o preço real (com descontos)
        * 2. Imposto Municial: >= 2500 (8.5%)/ < 2500 (Isento)
        * 3. Arredontar: Deixar duas casas decimais
        * 5. Formatar: R$ 000.00
        * */

        Produto p1 = new Produto("Playstation 5", 3499.00, 3);

        Function<Produto, Double> valorReal = p -> p.getPreco() - (p.getPreco() * p.getDesconto()) / 100;
        UnaryOperator<Double> impostos = valor -> valor >= 2500 ? valor + (valor * 0.85) : valor;

        System.out.printf("Valor final: R$%.2f", valorReal.andThen(impostos).apply(p1));
    }
}
