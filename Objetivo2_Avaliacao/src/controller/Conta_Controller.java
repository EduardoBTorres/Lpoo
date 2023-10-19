package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Conta_Controller {
    public static void main(String[] args) {//

        //a
        ContaPoupanca cp1 = new ContaPoupanca(5000.00);
        ContaPoupanca cp2 = new ContaPoupanca(6000.00);
        ContaPoupanca cp3 = new ContaPoupanca(7000.00);
        System.out.println("\nContas Poupança:");
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

        ContaCorrente cc1 = new ContaCorrente(8000.00);
        ContaCorrente cc2 = new ContaCorrente(9000.00);
        ContaCorrente cc3 = new ContaCorrente(10000.00);
        System.out.println("\nContas Corrente:");
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        Cliente cliente1 = new Cliente("Eduardo");
        Cliente cliente2 = new Cliente("Rafael");
        Cliente cliente3 = new Cliente("Marcos");
        System.out.println("\nClientes:");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        //b
        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        System.out.println("\nContas:");
        System.out.println(contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(cliente1);
        associados.add(cliente2);
        associados.add(cliente3);
        System.out.println("\nAssociados:");
        System.out.println(associados);

        //c
        System.out.println("\nConta Poupança 1 antes das operações:");
        System.out.println(cp1);
        cp1.deposita(1000.00);
        cp1.atualiza(5);
        cp1.saca(50.00);
        System.out.println("\nSaldo atualizado da Conta Poupança 1:");
        System.out.println(cp1);

        //d
        System.out.println("\nConta Corrente 1 antes das operações:");
        System.out.println(cc1);
        cc1.deposita(500.00);
        cc1.saca(400.00);
        System.out.println("\nSaldo atualizado da Conta Corrente 1:");
        System.out.println(cc1);

        //e
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        cliente1.setQdeCotas(300);
        cliente2.setQdeCotas(600);
        cliente3.setQdeCotas(600);
        System.out.println("\nAssociados:");
        System.out.println(associados);

        //f
        System.out.println("\nAssociado com maior numero de cotas:");
        Associado associadoMaisQdeCotas = Collections.max(associados, Comparator.comparing(Associado::getqdeCotas));
        associados.forEach(f->{ if(f.getqdeCotas() >= associadoMaisQdeCotas.getqdeCotas()){
            System.out.println(f);}
        });

        //g
        // A partir da (s) coleção (ões), imprima todas as contas cadastradas no sistema, ordenadas
        //pelo critério saldo, em ordem decrescente.

        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nContas ordenadas pelo saldo:" + contas);

        //E, imprima todos associados que sejam  Associado e possua conta cadastradas no sistema, em qualquer ordem.

        System.out.println("\nClientes:");
        associados.forEach(i->{
            if(i instanceof Cliente){
                System.out.println(i);
            }});

        //Também faça o programa imprimir a lista de contas com maior saldo bancário.

        System.out.println("\nContas com maior saldo:");
        Conta contaMaiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
            for(Conta conta : contas){
                if (conta.getSaldo() >= contaMaiorSaldo.getSaldo()){
                System.out.println(conta);
                }
        };
    }
}