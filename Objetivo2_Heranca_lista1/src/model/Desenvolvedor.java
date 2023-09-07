package model;

public class Desenvolvedor extends Funcionario{
    @Override
    public double getBonus() {
        return this.salario * 0.05;
    }

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
}
