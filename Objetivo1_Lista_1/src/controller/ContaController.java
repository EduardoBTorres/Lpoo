package controller;

import model.Carro;
import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        Conta c2 = new Conta(2000.00);
        System.out.println(c1);
        System.out.println(c2);

        //Alterando estado na memoria
       c1.setSaldo(4000.00);
       c2.setSaldo(100000.00);
       System.out.println(c1.getSaldo());
       System.out.println(c2.getSaldo());

       //2 - coleções tipo list

        List<Conta> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        System.out.println(contas);

        //Ordenando
        contas.sort(Comparator.comparing(Conta::getSaldo));
        System.out.println(contas);

        System.out.println("\nColeção tipo Map\n");
        Map<Double,Conta> contasMap = new HashMap<>();
        contasMap.put(c1.getSaldo(), c1);
        contasMap.put(c2.getSaldo(), c2);
        System.out.println(contasMap);

        //Pesquisando na coleção Map

        System.out.println("Pesquisando tipo Map");
        System.out.println();
        System.out.println("Encontrando objeto pela chave id");
        System.out.println(contasMap.get(4000.00));

        //Ordenando coleção list com reversed

        System.out.println("Ordenando na ordem decrescente tipo List:");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);
    }
}
