package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        //a
        Peixe px1 = new Peixe(0.5, 0.5);
        Peixe px2 = new Peixe(1, 1);
        Peixe px3 = new Peixe(2, 2);

        Cachorro c1 = new Cachorro(2.5, 2.5);
        Cachorro c2 = new Cachorro(3, 3);
        Cachorro c3 = new Cachorro(4, 4);

        Passaro p1 = new Passaro(4.5, 4.5);
        Passaro p2 = new Passaro(5, 5, 5);
        Passaro p3 = new Passaro(6, 6, 6);

        List<Animal> animais = new ArrayList<>();
        animais.add(px1);
        animais.add(px2);
        animais.add(px3);
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        System.out.println("\nPosição Inicial dos Animais:\n");
        System.out.println(animais);

        //b
        System.out.println("\nAnimais movidos pra coordenada x=2, y=2:\n");
        animais.forEach(a -> {
            a.mover(2.0, 2.0);
            a.desenhar();
            System.out.println(a);
        });

        //c
        System.out.println("\nAnimais da classe Cachorro movidos para x=8 e y=8:\n ");
        animais.forEach(a -> {
            if (a instanceof Cachorro){
                a.mover(8.0, 8.0);
                a.desenhar();
                System.out.println(a);
            }
        });

        //d
        System.out.println("\nAnimais da classe Peixe e Pássaro movidos para coordenada x=5.0, y=5, z=5:");
        animais.forEach(a -> {
            if (a instanceof Peixe){
                ((Peixe) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
                System.out.println(a);
            } else if (a instanceof Passaro) {
                if (a instanceof Passaro) {
                    ((Passaro) a).mover(5.0, 5.0, 5.0);
                    a.desenhar();
                    System.out.println(a);
                }
            }
        });
    }
}
