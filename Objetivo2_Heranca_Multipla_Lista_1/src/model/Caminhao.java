package model;

public class Caminhao extends Veiculo implements Automovel{
    private int capacidadeDeCarga;

    public Caminhao() {
    }

    public Caminhao(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                '}';
    }
}
