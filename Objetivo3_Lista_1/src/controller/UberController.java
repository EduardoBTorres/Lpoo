package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;

public class UberController {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(1, "Eduardo", "eduardobtorres@gmail.com", 984014033);
        Motorista m1 = new Motorista(10, "Rafael", "rafael@gmail.com", 91527201);
        Veiculo v1 = new Veiculo(100, "Carro", "JAG5B29", 2019);

        Corrida c1 = new Corrida(2, "Cartão", "À vista", LocalDate.of(2023,5,10), 10.50, 5);
        Corrida c2 = new Corrida(3, "Pix", "À vista", LocalDate.of(2023,8,25), 12.25, 10);

        System.out.println("\nCorridas por usuário:");
        u1.getCorridas().add(c1);
        u1.getCorridas().add(c2);
        u1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(u1.getCorridas());

        System.out.println("\nCorridas pro motorista:");
        m1.getCorridas().add(c1);
        m1.getCorridas().add(c2);
        m1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(m1.getCorridas());

        System.out.println("\nTotal de corridas do motorista:");
        System.out.println(NumberFormat.getCurrencyInstance().format(
                m1.getCorridas().stream()
                        .mapToDouble(c -> c.getPreco())
                        .sum()));
    }
}
