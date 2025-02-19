package excecoes;

public class Pessoa {

    private final String nome;
    private final int idade;

     public Pessoa(String nome, int idade) {
         this.nome = nome;

         if (idade < 0) {
             throw new NegativeNumberException("idade");
         }

         this.idade = idade;
     }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
