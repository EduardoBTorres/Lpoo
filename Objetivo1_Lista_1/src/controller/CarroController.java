package controller;

import model.Carro;
import model.Produto;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro(2, "Chevrolet", "Prisma", 2019);
        System.out.println(carro1);
        System.out.println(carro2);

        // Alterando o estado na memoria ram
        carro1.setId(1);
        carro1.setMarca("Dodge");
        carro1.setModelo("Ram");
        carro1.setAnoFabricacao(2023);
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        carro2.setId(2);
        carro2.setMarca("Ford");
        carro2.setModelo("F1000");
        carro2.setAnoFabricacao(2022);
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        //2 adicionando instancias com id

        Carro carro3 = new Carro(3, "Hyundai", "HB20", 2018);
        Carro carro4 = new Carro(4, "Wolkswagen", "Gol", 2009);
        Carro carro5 = new Carro(5, "Citroen", "Cactus", 2022);

        //Colecao tipo list

        System.out.println("\nColeção tipo List\n");
        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);
        System.out.println(carrosList);

        //ordenando

        System.out.println("\nOrdenando tipo List\n");
        carrosList.sort(Comparator.comparing(Carro::getId));
        System.out.println(carrosList);

        //Pesquisando

        System.out.println("\nPesquisando tipo list\n");
        Carro carroFind = carrosList.stream().filter(c -> c.getMarca().equals("Hyundai")).findAny().orElse(null);
        System.out.println(carroFind);

        System.out.println("\nColeção tipo Map\n");
        Map<Integer,Carro> carroMap = new HashMap<>();
        carroMap.put(carro1.getId(), carro1);
        carroMap.put(carro2.getId(), carro2);
        carroMap.put(carro3.getId(), carro3);
        carroMap.put(carro4.getId(), carro4);
        System.out.println(carroMap);

        //Pesquisando na coleção Map

        System.out.println("Pesquisando tipo Map");
        System.out.println();
        System.out.println("Encontrando objeto pela chave id");
        System.out.println(carroMap.get(3));

        //Ordenando coleção do tipo list com reversed

        System.out.println("Ordenando na ordem decrescente tipo List:");
        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carroMap);

    }
}
