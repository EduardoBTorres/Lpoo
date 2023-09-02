package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {

        Marca marca1 = new Marca();
        Marca marca2 = new Marca("Chevrolet");
        System.out.println(marca1);
        System.out.println(marca2);

        System.out.println("\nAlterando estado na memória RAM\n");
        System.out.println("Marca 1\n");

        marca1.setDescricao("Ford");
        System.out.println(marca1.getDescricao());

        System.out.println("\nMarca 2\n");

        marca2.setDescricao("Fiat");
        System.out.println(marca2.getDescricao());

        //2 adicionando com atributo Id

        Marca marca3 = new Marca("Toyota");
        Marca marca4 = new Marca("Ferrari");
        Marca marca5 = new Marca("Hyundai");

        List<Marca> marcasList = new ArrayList<>();
        marcasList.add(marca1);
        marcasList.add(marca2);
        marcasList.add(marca3);
        marcasList.add(marca4);
        marcasList.add(marca5);
        System.out.println("\nColeções tipo List\n");
        System.out.println(marcasList);

        //ordenando

        marcasList.sort(Comparator.comparing(Marca::getDescricao));
        System.out.println(marcasList);

        //pesquisando

        Marca marcaFind = marcasList.stream().filter(m -> m.getDescricao().equals("Fiat")).findAny().orElse(null);
        System.out.println("\nEncontrando marca\n");
        System.out.println(marcaFind);

        //coleção Map

        Map<String,Marca> marcasMap = new HashMap<>();
        marcasMap.put(marca1.getDescricao(), marca1);
        marcasMap.put(marca2.getDescricao(), marca2);
        marcasMap.put(marca3.getDescricao(), marca3);
        marcasMap.put(marca4.getDescricao(), marca4);
        marcasMap.put(marca5.getDescricao(), marca5);
        System.out.println("\nColeção tipo map\n");
        System.out.println(marcasMap);

        //pesquisando objetos na colecao Map

        System.out.println();
        System.out.print("\nEncontrando o objeto pela chave de pesquisa (id=3 na coleção Map");
        System.out.println(marcasMap.get("Toyota"));

    }
}
