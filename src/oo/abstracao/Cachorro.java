package oo.abstracao;

public class Cachorro extends Animal{

    public Cachorro() {
        super("Mumu");
    }

    @Override
    public void fazerSom() {
        System.out.println("Auau");
    }
}
