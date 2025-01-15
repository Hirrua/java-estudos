package oo.composicao.onetoone;

public class Carro {
    // Carro tem um motor
    Motor motor = new Motor();

    public void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    public void frear() {
        motor.fatorInjecao -= 0.4;
    }

    public void ligar() {
        motor.ligado = true;
    }

    public void desligar() {
        motor.ligado = false;
    }

    public boolean estaLigado() {
        return motor.ligado;
    }
}
