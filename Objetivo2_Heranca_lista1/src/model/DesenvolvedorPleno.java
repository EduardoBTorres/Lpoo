package model;

public class DesenvolvedorPleno extends Desenvolvedor{
    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "DesenvolvedorPleno{}" + super.toString();
    }
}
