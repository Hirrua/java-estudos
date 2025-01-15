package oo.polimorfismo;

public class Funcionario extends Pessoa{
    // Sobrescrita

    @Override // Identifica que vou dar um novo comportamento para o met. da classe pai
    public void falar() {
        System.out.println("Sou funcionário");
    }
}
