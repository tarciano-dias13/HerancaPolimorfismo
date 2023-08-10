package com.herancaPolimorfismo.animais;
public class Cavalo extends Animal{
	public Cavalo() {
		setNome("Cavalo");
	};
	
	public void correr() {
		System.out.println("Correndo loucamente");
	};

	public void emitirSom() {
		System.out.println("Pocotó Pocotó");
	}
}
