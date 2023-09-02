package controller;

import model.Desenvolvedor;
import model.Gerente;

public class FuncionarioController {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor();
        Gerente g1 = new Gerente();

        System.out.println(d1.getBonus());
        System.out.println(g1.getBonus());

        d1.setSalario(1000.00);
        System.out.println(d1.getBonus());

        g1.setSalario(1000.00);
        System.out.println(g1.getBonus());


    }
}
