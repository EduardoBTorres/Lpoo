package model;

public abstract class Animal {
    protected double x=0, y=0;

    public Animal() {
    }

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y){
        System.out.println("Moveu um Animal.");
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();

    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
