package model;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        this.saldo += valor;
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
    }
}
