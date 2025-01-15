package oo.polimorfismo;

public class Pessoa {
    // Sobrecarga -> reescrever o mesmo métod. mudando assinatura (alterando quantidade e tipo dos parametros)

    public void falar() { // Assinatura
        System.out.println("Oi");
    }

    public void falar(String texto) { // Assinatura
        System.out.println("Oi " + texto);
    }

    public void falar(String texto, String nome) { // Assinatura
        System.out.println("Oi " + texto + " " + nome);
    }

}
