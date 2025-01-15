package oo.encapsulamento;

public class Conta {

    public String nome;
    public String cpf;
    private Double saldo; // Encapsulando o saldo, para somente a classe ter acesso

    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Double getSaldo() { // Convensão GET/SET
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
