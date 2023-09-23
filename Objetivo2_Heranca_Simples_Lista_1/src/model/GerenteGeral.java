package model;

public class GerenteGeral extends Gerente{
    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.getSalario() * 0.4;
    }

    @Override
    public String toString() {
        return "GerenteGeral{}" + super.toString();
    }
}
