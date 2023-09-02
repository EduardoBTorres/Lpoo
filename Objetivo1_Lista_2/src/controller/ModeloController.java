package controller;
import model.Modelo;

import java.security.MessageDigest;
import java.util.*;

public class ModeloController {
    public static void main(String[] args) {

        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo("Prisma");
        System.out.println(modelo1);
        System.out.println(modelo2);

        System.out.println("\nAlterando estado na memória RAM\n");
        System.out.println("Modelo 1\n");

        modelo1.setDescricao("Cobalt");
        System.out.println(modelo1.getDescricao());

        System.out.println("\nModelo 2\n");

        modelo2.setDescricao("Tracker");
        System.out.println(modelo2.getDescricao());

        //2 adicionando com atributo Id

        Modelo modelo3 = new Modelo("S10");
        Modelo modelo4 = new Modelo("Spin");
        Modelo modelo5 = new Modelo("Cruze");

        List<Modelo> marcasList = new ArrayList<>();
        marcasList.add(modelo1);
        marcasList.add(modelo2);
        marcasList.add(modelo3);
        marcasList.add(modelo4);
        marcasList.add(modelo5);
        System.out.println("\nColeções tipo List\n");
        System.out.println(marcasList);

        //ordenando

        System.out.println("\nOrdenando Modelos\n");
        marcasList.sort(Comparator.comparing(Modelo::getDescricao));
        System.out.println(marcasList);

        //pesquisando

        Modelo modeloFind = marcasList.stream().filter(m -> m.getDescricao().equals("Cobalt")).findAny().orElse(null);
        System.out.println("\nEncontrando modelo\n");
        System.out.println(modeloFind);

        //coleção Map

        Map<String,Modelo> marcasMap = new HashMap<>();
        marcasMap.put(modelo1.getDescricao(), modelo1);
        marcasMap.put(modelo2.getDescricao(), modelo2);
        marcasMap.put(modelo3.getDescricao(), modelo3);
        marcasMap.put(modelo4.getDescricao(), modelo4);
        marcasMap.put(modelo5.getDescricao(), modelo5);
        System.out.println("\nColeção tipo map\n");
        System.out.println(marcasMap);

        //pesquisando objetos na colecao Map

        System.out.println();
        System.out.print("\nEncontrando o objeto pela chave de pesquisa (id=3 na coleção Map\n");
        System.out.println(marcasMap.get("Tracker"));

    }
}

