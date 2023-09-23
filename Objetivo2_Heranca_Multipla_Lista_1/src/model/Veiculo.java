package model;

public abstract class Veiculo {
    private int numeroDeEixos;
    private String propulsao;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo() {
    }

    public Veiculo(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao) {
        this.numeroDeEixos = numeroDeEixos;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
}
