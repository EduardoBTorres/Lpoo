package model;

import java.util.List;

public class Veiculo {
    private long id;
    private String tipo;
    private String placa;
    private int anoFabricacao;

    public Veiculo(long id, String tipo, String placa, int anoFabricacao) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    List<Motorista> motoristas;

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motoristas=" + motoristas +
                '}';
    }
}
