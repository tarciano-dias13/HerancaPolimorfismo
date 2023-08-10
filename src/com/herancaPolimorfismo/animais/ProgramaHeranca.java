package com.herancaPolimorfismo.animais;

public class ProgramaHeranca {
    public static void main(String args[]) {
        
        // Animais
        Cachorro dog = new Cachorro();
        Cavalo cav = new Cavalo();
        Preguica preg = new Preguica();
        //chamandoAnimal();
        
        //Veterinario veterinario = new Veterinario();
        //veterinario.examinarAnimal(dog);
        //veterinario.examinarAnimal(cav);
        //veterinario.examinarAnimal(preg);
        
        Zoologico zoologico = new Zoologico();
        for (int i = 0; i < zoologico.animais.length; i++) {            
            zoologico.animais[i].emitirSom();
            
            if(zoologico.animais[i] instanceof Cachorro) {
                ((Cachorro)zoologico.animais[i]).correr();
            }
            
            if(zoologico.animais[i] instanceof Cavalo) {
                ((Cavalo)zoologico.animais[i]).correr();
            }
        };
    }

    public static void chamandoAnimal() {
        Cachorro dog = new Cachorro();
        System.out.println("Vem Cachorro!");
        dog.emitirSom();
        
        Cavalo cav = new Cavalo();
        System.out.println("Vem Cavalo!");
        cav.emitirSom();
        
        Preguica preg = new Preguica();
        System.out.println("Vem Preguica!");
        preg.emitirSom();

        System.out.println("Fim chamandoAnimal!");
        System.out.println("---------------------------");
    }
}