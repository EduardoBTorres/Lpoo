package controller;

import model.Carro;
import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Eduardo", 2500.00);

        System.out.println(f1);
        System.out.println(f2);

        //Alterando estado na memoria RAM
        System.out.println("\nAlterando estado na memoria RAM\n");
        f1.setNome("Ronaldo");
        f1.setSalario(3000.00);
        f2.setNome("Ana Lúcia");
        f2.setSalario(10000.00);
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f2.getNome());
        System.out.println(f1.getSalario());

        Funcionario f3 = new Funcionario("Helena", 2000.00);
        Funcionario f4 = new Funcionario("Laura", 1000.00);

        //2- Coleção list
        System.out.println("\nColeção tipo List\n");
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(f1);
        funcionariosList.add(f2);
        funcionariosList.add(f3);
        funcionariosList.add(f4);
        System.out.println(funcionariosList);

        //Ordenando
        System.out.println("\nOrdenando tipo List\n");
        funcionariosList.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(funcionariosList);

        //pesquisando
        System.out.println("\nPesquisando tipo list\n");
        Funcionario funcionariosFind=funcionariosList.stream().filter(f -> f.getNome().equals("Helena")).findAny().orElse(null);
        System.out.println(funcionariosFind);

        //Coleção tipo Map
        System.out.println("\nColeção tipo map\n");
        Map<String, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(f1.getNome(), f1);
        funcionarioMap.put(f2.getNome(), f2);
        funcionarioMap.put(f3.getNome(), f3);
        funcionarioMap.put(f4.getNome(), f4);
        System.out.println(funcionarioMap);


        //Pesquisando na coleção Map

        System.out.println("Pesquisando tipo Map");
        System.out.println();
        System.out.println("Encontrando objeto pelo nome");
        System.out.println(funcionarioMap.get("Ronaldo"));

        //Ordenando coleção list com reversed

        System.out.println("Ordenando na ordem decrescente tipo List:");
        funcionariosList.sort(Comparator.comparing(Funcionario::getNome).reversed());
        System.out.println(funcionariosList);
    }
}
