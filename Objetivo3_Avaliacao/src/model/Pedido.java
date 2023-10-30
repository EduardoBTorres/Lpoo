package model;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate data;
    private double valor;
    private String tipo;
    private Vendedor vendedor;
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems(){
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Pedido() {
    }

    public Pedido(int numero, LocalDate data, double valor, String tipo, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" +  NumberFormat.getCurrencyInstance().format(valor) +
                ", vendedor=" + vendedor +
                ", items=" + items +
                '}';
    }
}
