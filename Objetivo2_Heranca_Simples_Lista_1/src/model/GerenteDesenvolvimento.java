package model;

public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "GerenteDesenvolvimento{}" + super.toString();
    }
}
