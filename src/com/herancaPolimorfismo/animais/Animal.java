package com.herancaPolimorfismo.animais;
public abstract class Animal {
	private String nome;
	private int idade;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void emitirSom() {
		System.out.println("Som do Animal "+ this.nome);
	};
}
