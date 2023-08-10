package com.herancaPolimorfismo.animais;

public class Zoologico {
    public Animal[] animais = new Animal[10];
    
    public Zoologico() {
        for (int i = 0; i < animais.length; i++) {
            
            if(i == 9 || i == 4 || i == 7) {
                Animal preg = new Preguica();
                animais[i] = preg;
                continue;
            }

            if(i %2 == 0) {
                Animal cachorro = new Cachorro();
                animais[i] = cachorro;
                continue;
            };    

            Animal cav = new Cavalo();
            animais[i] = cav;
        }

        System.out.println("Zoologico Criado:");
        for (int i = 0; i < animais.length; i++) {
            System.out.println("Animal " + animais[i].getNome());
        }
    }; 
    
    public Animal[] getAnimais() {
        return animais;
    }

}
