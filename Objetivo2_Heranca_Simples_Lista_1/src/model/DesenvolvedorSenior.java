package model;

public class DesenvolvedorSenior extends Desenvolvedor{
    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.1;
    }

    @Override
    public String toString() {
        return "DesenvolvedorSenior{}" + super.toString();
    }
}
