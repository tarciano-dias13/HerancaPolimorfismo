package com.herancaPolimorfismo.funcionarios;

public class Basico extends Funcionario {
    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    public double getComissao(){
        return super.getComissaoVendedor();
    }

    public double getSalario(){
        double salario = super.getSalario();
        double comissao = getComissao();
        return (salario + (salario * 0.1) + comissao);
    }

        public String toString(){
            String str = "Nome: " + getNome() + ", \n" + "Comissao: " + getComissao() + ",\n Salario: " + getSalario();
            return str;  
        }
}
