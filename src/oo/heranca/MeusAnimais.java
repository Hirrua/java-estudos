package oo.heranca;

public class MeusAnimais {
    public static void main(String[] args) {
        Gato mimi = new Gato("Mimi", "cinza", 1);

        mimi.comer(mimi.nome);
        mimi.beber(mimi.nome);
        mimi.dadosAnimal();

        Cachorro mumu = new Cachorro("Mumu", "marrom", 3);

        mumu.comer(mumu.nome);
        mumu.beber(mumu.nome);
        mumu.dadosAnimal();
    }
}
