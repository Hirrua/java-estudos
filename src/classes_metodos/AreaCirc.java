package classes_metodos;

public class AreaCirc {

    double raio;
    static double pi = 3.14; // Valor da classe - fixo

    public AreaCirc (double raioInicial) {
        raio = raioInicial;
    }

    double area () {
        return pi * Math.pow(raio, 2); // Não preciso criar instância, pois .pow é um method static
    }
}
