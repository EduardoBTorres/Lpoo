package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        //a
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor();
        Desenvolvedor d3 = new Desenvolvedor();
        Desenvolvedor d4 = new Desenvolvedor();
        Desenvolvedor d5 = new Desenvolvedor();
        Desenvolvedor d6 = new Desenvolvedor();

        d1.setNome("Eduardo");
        d1.setSalario(2000.50);
        d2.setNome("Ana");
        d2.setSalario(3000.00);
        d3.setNome("Ronaldo");
        d3.setSalario(2000.00);
        d4.setNome("Helena");
        d4.setSalario(1000.00);
        d5.setNome("Bruna");
        d5.setSalario(3000.00);
        d6.setNome("Mario");
        d6.setSalario(7000.00);

        System.out.println("\nDesenvolvedores\n");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println();

        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente();
        Gerente g3 = new Gerente();
        Gerente g4 = new Gerente();
        Gerente g5 = new Gerente();
        Gerente g6 = new Gerente();

        g1.setNome("Alberto");
        g1.setSalario(10000.00);
        g1.setTicker("BTG");
        g1.setQuantidade(10);
        g2.setNome("Bruno");
        g2.setSalario(12000.00);
        g2.setTicker("BTG");
        g2.setQuantidade(10);
        g3.setNome("Marcelo");
        g3.setSalario(13000.00);
        g3.setTicker("BTG");
        g3.setQuantidade(10);
        g4.setNome("Alice");
        g4.setSalario(14000.00);
        g4.setTicker("BTG");
        g4.setQuantidade(10);
        g5.setNome("Antonio");
        g5.setSalario(15000.00);
        g5.setTicker("BTG");
        g5.setQuantidade(10);
        g6.setNome("Mateus");
        g6.setSalario(16000.00);
        g6.setTicker("BTG");
        g6.setQuantidade(10);

        System.out.println("\nGerentes\n");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);

        System.out.println();

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        Cliente c5 = new Cliente();
        Cliente c6 = new Cliente();

        c1.setNome("Vagner");
        c1.setSobrenome("Moura");
        c1.setTicker("Itaú");
        c1.setQuantidade(10);
        c2.setNome("Ítalo");
        c2.setSobrenome("Ferreira");
        c2.setTicker("Itaú");
        c2.setQuantidade(20);
        c3.setNome("Gabriel");
        c3.setSobrenome("Medina");
        c3.setTicker("Itaú");
        c3.setQuantidade(30);
        c4.setNome("Alam");
        c4.setSobrenome("Santos");
        c4.setTicker("Itaú");
        c4.setQuantidade(40);
        c5.setNome("Patrick");
        c5.setSobrenome("Melo");
        c5.setTicker("Itaú");
        c5.setQuantidade(50);
        c6.setNome("Miguel");
        c6.setSobrenome("Damasceno");
        c6.setTicker("Itaú");
        c6.setQuantidade(60);

        System.out.println("\nClientes\n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        //b
        System.out.println("\nFuncionarios\n");
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);
        System.out.println(funcionarios);

        System.out.println("\nInvestidores");
        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        System.out.println(investidores);

        //c
        System.out.println("\nOrdenando os funcionários pelo salario em ordem decrescente\n");

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarios);
        System.out.println();

        System.out.println("\nOrdenando os investidores pela quantidade de ações em ordem descrescente\n");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println(investidores);
        System.out.println();

        //d
        System.out.println("\nFuncionário com maior salário:");
        Funcionario maiorSalario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if (f.getSalario() >= maiorSalario.getSalario()){
                System.out.print(f);
            }
        });

        System.out.println();
        System.out.print("\nInvestidor (s) com maior quantidade de ações:\n");
        Investidor maior_quantidade_acoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= maior_quantidade_acoes.getQuantidade()) {
                System.out.println(i);
            }
        });
    }
}
