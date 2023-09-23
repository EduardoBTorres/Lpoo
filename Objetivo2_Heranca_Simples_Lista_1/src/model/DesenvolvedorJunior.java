package model;

public class DesenvolvedorJunior extends Desenvolvedor {
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "DesenvolvedorJunior{}" + super.toString();
    }
}
