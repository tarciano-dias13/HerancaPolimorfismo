package com.herancaPolimorfismo.funcionarios;

public class Intermediario extends Basico {
    private String escolaMedia;
    
    
    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
    }

    public double getComissao(){
        return super.getComissaoSupervisor();
    }
    public double getSalario(){
        double  salario = super.getSalario();
        double comissao = getComissao();
        return (salario + (salario * 0.5) + comissao);
    }

    public String toString(){
        String str = "Nome: " + getNome() + ", \n" + "Comissao: " + getComissao() + ",\n Salario: " + getSalario();
        return str;  
    }
}
