package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

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
        d1.setNome("Pedro");
        d1.setSalario(2000.00);

        System.out.println("\n");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        //calcula bonus

        System.out.println("\nCalculo de bonus:\n");
        System.out.println(g1 + " " + g1.getBonus());
        System.out.println(g2 + " " + g2.getBonus());
        System.out.println(d1 + " " + d1.getBonus());
        System.out.println(d2 + " " + d2.getBonus());

        //Respostas da pergunta 1: Não é possível criar instâncias da classe Funcionario, porque ela e abstract.
        //Resposta da pergunta 2: As regras do negocio devem inseridas nas classes Gerente e Desenvolvedor.

        //Questao 2
        // cria os gerentes

        Gerente ger1 = new GerenteGeral("Ana Júlia", 6500.00);
        Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);

        //Cria mais 18 desenvolvedores
        Desenvolvedor dev1 = new DesenvolvedorSenior("Beatriz", 3500.00);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Elis", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("João", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Mario", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("José", 3500.00);

        Desenvolvedor dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Paula", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Denise", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);

        Desenvolvedor dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Glória", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Caio", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Clara", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Mel", 1800.00);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(ger1);
        funcionarioList.add(ger2);
        funcionarioList.add(dev1);
        funcionarioList.add(dev2);
        funcionarioList.add(dev3);
        funcionarioList.add(dev4);
        funcionarioList.add(dev5);
        funcionarioList.add(dev6);
        funcionarioList.add(dev7);
        funcionarioList.add(dev8);
        funcionarioList.add(dev9);
        funcionarioList.add(dev10);
        funcionarioList.add(dev11);
        funcionarioList.add(dev12);
        funcionarioList.add(dev13);
        funcionarioList.add(dev14);
        funcionarioList.add(dev15);
        funcionarioList.add(dev16);
        funcionarioList.add(dev17);
        funcionarioList.add(dev18);
        System.out.print("Funionários cadastrados na empresa\n" + funcionarioList);

        double acum = 0;
        for(Funcionario f : funcionarioList){
            acum += f.getSalario();
        }
        System.out.print("Folha salarial sem bônus= "
                + NumberFormat.getCurrencyInstance().format(acum));

        acum = 0;
        for(Funcionario f : funcionarioList){
            acum += f.getSalario() + f.getBonus();
        }
        System.out.print("\nFolha salarial COM bônus= "
                + NumberFormat.getCurrencyInstance().format(acum));
    }
}
