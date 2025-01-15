package oo.abstracao;

public class Gato extends Animal{

    public Gato() {
        super("Mimi");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
