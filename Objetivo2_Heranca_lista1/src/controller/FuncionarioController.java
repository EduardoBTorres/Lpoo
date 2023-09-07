package controller;

import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {
       Gerente g1 = new Gerente();
       Gerente g2 = new Gerente("Ana",  3000);

       Desenvolvedor d1 = new Desenvolvedor();
       Desenvolvedor d2 = new Desenvolvedor("Adão",  2000);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        g1.setNome("Rita");
        g1.setSalario(3000.00);
        g2.setNome("Pedro");
        g2.setSalario(2000.00);

        System.out.println(g1);
        System.out.println(g2);

        d1.setSalario(2000.00);
        d2.setNome("Lucia");

        System.out.println(d1);
        System.out.println(d2);

        //calcula bonus

        System.out.println(g1.getBonus());
        System.out.println(g1.getBonus());
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());

        //Questao 2 // cria mais desenvovledores

        //percorrer lista no java

        double acum = 0;
        for (Funcionario f: funcionList) {
            acum = += f.getSalario();
        }
        System.out.print("Folha salarial sem bonus", + acum);


    }
}
