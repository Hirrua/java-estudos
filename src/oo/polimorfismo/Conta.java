package oo.polimorfismo;

public class Conta implements Pagar{ // Obrigado a implementar o met. PAGAR

    // Sobrescrita
    @Override
    public void pagar() {
        System.out.println("PIX");
    }
}
