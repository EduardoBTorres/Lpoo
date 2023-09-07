package model;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public double getSalario() {

        return salario;
    }

    public abstract double getBonus();


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
