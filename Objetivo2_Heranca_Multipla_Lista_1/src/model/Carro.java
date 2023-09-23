package model;

public class Carro extends Veiculo implements Automovel{
    private int capacidadePortaMalas;

    public Carro() {
    }

    public Carro(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                '}';
    }
}
