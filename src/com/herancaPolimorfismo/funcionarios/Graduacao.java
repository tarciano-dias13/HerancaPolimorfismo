package com.herancaPolimorfismo.funcionarios;

public class Graduacao extends Intermediario {
    private String universidade;
    
    
    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double getComissao(){
        return super.getComissaoGerente();
    }
    public double getSalario(){
        double salario = super.getSalario();
        double comissao = getComissao();
        return (salario + salario + comissao);
    }

    public String toString(){
        String str = "Nome: " + getNome() + ", \n" + "Comissao: " + getComissao() + ",\n Salario: " + getSalario();
        return str;  
    }
}
