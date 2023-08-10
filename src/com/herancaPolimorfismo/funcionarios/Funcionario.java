package com.herancaPolimorfismo.funcionarios;

public class Funcionario {
    private int codigo;
    private String nome;
    private double salario = 1000;
    private double comissaoGerente = 1500; 
    private double comissaoSupervisor = 600; 
    private double comissaoVendedor = 250; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComissaoGerente(){
        return comissaoGerente;        
    }

    public double getComissaoSupervisor(){
        return comissaoSupervisor;
    }

    public double getComissaoVendedor(){
        return comissaoVendedor;
    }

    public double getSalario(){
        return salario;
    };
}
