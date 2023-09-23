package model;

public class Bicicleta extends Veiculo{
    private int tamanhoRoda;
    private String chassi;

    public Bicicleta() {
    }

    public Bicicleta(int tamanhoRoda, String chassi) {
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
