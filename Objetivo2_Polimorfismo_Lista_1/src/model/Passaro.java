package model;

public class Passaro extends  Animal{
    private double z=0;

    public Passaro() {
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou um Pássaro.");
    }

    public void mover(double x, double y, double z){
        System.out.println("Moveu um Pássaro3D");
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPássaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

