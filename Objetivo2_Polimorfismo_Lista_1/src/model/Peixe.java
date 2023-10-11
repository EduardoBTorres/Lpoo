package model;

public class Peixe extends Animal{
    private double z=0;

    public Peixe() {
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou um Peixe.");
    }

    public void mover(double x, double y, double z){
        System.out.println("Moveu um Peixe3D");
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
