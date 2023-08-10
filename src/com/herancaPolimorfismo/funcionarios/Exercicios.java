package com.herancaPolimorfismo.funcionarios;

public class Exercicios {
    
    public static void main(String[] args) {
          
    //custoTotal();
    //exibindoSalarios();
    exercicio10();
}
    
public static void exercicio10() {
    
        System.out.println("Iniciando Custo Total Exercicio 10");
        System.out.println("---------------------------");
        double custoTotal = 0;
        Funcionario funcionarios[] = new Funcionario[10];
        funcionarios[0] = new Basico();
        funcionarios[0].setNome("funcionario 1");
        funcionarios[0].setCodigo(0);

        funcionarios[1] = new Basico();
        funcionarios[1].setNome("funcionario 1");
        funcionarios[1].setCodigo(1);

        funcionarios[2] = new Basico();
        funcionarios[2].setNome("funcionario 2");
        funcionarios[2].setCodigo(2);
        
        funcionarios[3] = new Basico();
        funcionarios[3].setNome("funcionario 3");
        funcionarios[3].setCodigo(3);

        funcionarios[4] = new Basico();
        funcionarios[4].setNome("funcionario 4");
        funcionarios[4].setCodigo(4);

        funcionarios[5] = new Basico();
        funcionarios[5].setNome("funcionario 5");
        funcionarios[5].setCodigo(5);

        funcionarios[6] = new Basico();
        funcionarios[6].setNome("funcionario 6");
        funcionarios[6].setCodigo(6);

        funcionarios[7] = new Intermediario();
        funcionarios[7].setNome("funcionario 7");
        funcionarios[7].setCodigo(7);

        funcionarios[8] = new Intermediario();
        funcionarios[8].setNome("funcionario 8");
        funcionarios[8].setCodigo(8);

        funcionarios[9] = new Graduacao();
        funcionarios[9].setNome("funcionario 9");
        funcionarios[9].setCodigo(9);

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].toString());
            custoTotal = custoTotal + funcionarios[i].getSalario();
        };

        System.out.println("Custo total: R$" + custoTotal);

}
    public static void custoTotal() {
        System.out.println("Iniciando Custo Total");
        System.out.println("---------------------------");
        double custoTotal = 0;
        Funcionario funcionarios[] = new Funcionario[10];
        funcionarios[0] = new Basico();
        funcionarios[1] = new Basico();
        funcionarios[2] = new Basico();
        funcionarios[3] = new Basico();

        funcionarios[4] = new Intermediario();
        funcionarios[5] = new Intermediario();
        funcionarios[6] = new Intermediario();
        funcionarios[7] = new Intermediario();

        funcionarios[8] = new Graduacao();
        funcionarios[9] = new Graduacao();

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getSalario());
            custoTotal = custoTotal + funcionarios[i].getSalario();
        };

        System.out.println("Custo total: R$" + custoTotal);
    }

    public static void exibindoSalarios(){
        System.out.println("Iniciando Exibindo Salarios");
        System.out.println("---------------------------");
        Funcionario funcionario = new Funcionario();
        Funcionario funcionarioBasic = new Basico();
        Funcionario funcionarioInt = new Intermediario();
        Funcionario funcionarioGrad = new Graduacao();

        funcionario.setNome("João");
        funcionario.setCodigo(123);
        
        funcionarioBasic.setNome("João Basico");
        funcionarioBasic.setCodigo(1234);
        
        funcionarioInt.setNome("João Intermediario");
        funcionarioInt.setCodigo(12345);
        
        funcionarioGrad.setNome("João Graduado");
        funcionarioGrad.setCodigo(12356);


        System.out.println(funcionario.getSalario());
        System.out.println(funcionarioBasic.getSalario());
        System.out.println(funcionarioInt.getSalario());
        System.out.println(funcionarioGrad.getSalario());
    }
}
