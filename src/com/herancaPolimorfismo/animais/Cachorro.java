package com.herancaPolimorfismo.animais;
public class Cachorro extends Animal{
	public Cachorro() {
		super();
		this.setNome("Cachorro");
	}
	
	public void correr() {
		System.out.println("Correndo atras do Carteiro");
	};

	public void emitirSom() {
		System.out.println("AuAu");
	}

}
