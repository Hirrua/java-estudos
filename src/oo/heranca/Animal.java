package oo.heranca;

/*
* Exemplo de Herança e Polimorfismo
*/

public class Animal {
    public String nome;
    public String cor;
    public int idade;

    public Animal(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public void comer(String animal) {
        System.out.printf("\nA %s está comendo", animal);
    }

    public void beber(String animal) {
        System.out.printf("\nA %s está bebendo água", animal);
    }

    public void dadosAnimal() {
        System.out.printf("\nNome: %s\nCor: %s\nIdade: %d", this.nome, this.cor, this.idade);
    }
}
