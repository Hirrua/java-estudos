package oo.encapsulamento;

public class ContaTest {

    public static void main(String[] args) {
        Conta c = new Conta("Hirruá", "4567899456");

        c.setSaldo(200.0); // Saldo não deve ser alterado livremente (public)

        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.getSaldo()); // Para a instancia acessar, deve ser criado métodos Getter e Setter

        /*
        * Trocando dessa forma atribuição direta para getter e setter, pode ser adicionado regras de negócios
        * Inserir lógicas dentro do métod, ENCAPSULAR uma lógica
        */

    }
}
