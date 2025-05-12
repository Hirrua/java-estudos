package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

    // Aceita qualquer lista de subtipos de Animal
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getName());
        }
        // animals.add(new Dog()); // ERRO de compilação!
    }

    // Aceita qualquer lista de supertipos de Dog
    public static void addDogs(List<? super Cachorro> dogs) {
        dogs.add(new Cachorro());
        // dogs.add(new Animal()); // ERRO! Não é garantido que Animal é aceitável
    }

    public static void main(String[] args) {
        List<Cachorro> dogList = new ArrayList<>();
        dogList.add(new Cachorro());

        List<Gato> catList = new ArrayList<>();
        catList.add(new Gato());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cachorro());
        animalList.add(new Gato());

        // Exemplo de leitura com extends
        System.out.println("Animais:");
        printAnimals(dogList);
        printAnimals(catList);
        printAnimals(animalList);

        // Exemplo de escrita com super
        System.out.println("\nAdicionando dogs:");
        addDogs(animalList);
        addDogs(dogList);

        printAnimals(animalList);
    }

}
