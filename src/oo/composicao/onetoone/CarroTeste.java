package oo.composicao.onetoone;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.estaLigado());
        carro.ligar();
        System.out.println(carro.estaLigado());

        System.out.println(carro.motor.giros()); // O motor tambem é um objeto, então posso acessar os seus métodos

        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());
    }

}
