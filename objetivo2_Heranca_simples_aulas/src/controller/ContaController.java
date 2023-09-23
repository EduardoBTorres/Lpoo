package controller;

import model.*;

public class ContaController {
    public static void main(String[] args) {

      // Conta c1 = new Conta();
        //System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente();
        System.out.println(cc1);
        System.out.println(cc1.getSaldo());
        cc1.deposita(1000.00);

        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1);
        cp1.deposita(1000.00);
        cp1.saca(2000.00);
        System.out.println(cp1.getSaldo());

        ContaConjunta ccj1 = new ContaConjunta();
        System.out.println(ccj1);

        ContaEspecial ce1 = new ContaEspecial();
        System.out.println(ce1);

        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();
        System.out.println(cps1);
    }
}
