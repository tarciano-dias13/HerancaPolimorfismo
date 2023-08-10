package com.herancaPolimorfismo.animais;

public class Veterinario {
    public void examinarAnimal(Animal animal) {
        System.out.println("Pegando o Animal " + animal.getNome() + " para a Veterinaria");
        System.out.println("Examinando Animal...");
        animal.emitirSom();
        System.out.println("Fim examinarAnimal!");
        System.out.println("---------------------------");
    }
}
