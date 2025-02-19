package excecoes;

public class Main {

    public static void main(String[] args) {

        try {
            var pessoa = new Pessoa("EU", -19);
        } catch (NegativeNumberException err){
            System.out.println(err.getMessage());
        }
    }
}
