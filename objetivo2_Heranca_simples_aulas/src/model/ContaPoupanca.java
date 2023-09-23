package model;

public class ContaPoupanca extends Conta{

    public void saca(double valor){
        this.saldo += valor;
    }

}
