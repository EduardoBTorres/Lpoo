package model;

public class Desenvolvedor extends Funcionario{
    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    public String toString(){
        return "Desenvolvedor [getNome()=" + getNome() +
                ", getSalario()=" + getSalario() +
                ", getBonus()=" + getBonus() + "]";
    }
}
