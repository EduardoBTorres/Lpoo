package controller;

import model.Empresa;
import model.Funcionario;

import java.util.Comparator;

public class Empresa_FuncionarioController {
    public static void main(String[] args) {
        //c
        Funcionario f1 = new Funcionario(1, "04764629089", "Eduardo", "Torres", "17/01/2003");
        Funcionario f2 = new Funcionario(2, "78465520399", "Helena", "Silveira", "19/08/2006");
        Funcionario f3 = new Funcionario(3, "34326563489", "Alessandra", "Gomes", "20/06/2008");
        Funcionario f4 = new Funcionario(4, "76580033254", "Junior", "Silva", "08/03/2009");
        Funcionario f5 = new Funcionario(5, "67825500135", "Estevan", "Alcantara", "30/11/1989");
        Funcionario f6 = new Funcionario(6, "98563265653", "Jorge", "Ribeiro", "23/09/1979");

        Empresa e1 = new Empresa("7868099000009", "Technner", "Tech");
        Empresa e2 = new Empresa("7563839975649", "Nike Sports", "Nike");

       e1.getFuncionarios().add(f1);
       e1.getFuncionarios().add(f2);
       e1.getFuncionarios().add(f3);
       e2.getFuncionarios().add(f4);
       e2.getFuncionarios().add(f5);
       e2.getFuncionarios().add(f6);

        System.out.println("\nTodos os funcionários por empresa:");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        System.out.println("\nFuncionários de cada empresa em ordem decrescente:");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);
    }
}
