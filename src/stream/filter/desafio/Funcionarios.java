package stream.filter.desafio;

public class Funcionarios {

    private final String nome;
    private final String departamento;
    private final double salario;

    public Funcionarios(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
}
