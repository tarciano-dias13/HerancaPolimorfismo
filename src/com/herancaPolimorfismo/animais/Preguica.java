package com.herancaPolimorfismo.animais;
public class Preguica extends Animal{
	public Preguica() {
		this.setNome("Preguica");
	}
	
	public void subirArvore() {
		System.out.println("Subindo Arvore");
	};

	public void emitirSom() {
		
		System.out.println("É minha vez de lavar a louça?");
	}
}
