package controller;

import model.Locacao;
import model.Veiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {

        //criando instancias no objeto

        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao(2, LocalDate.of(2023, 12, 12), LocalTime.of(10, 20), LocalDate.of(2021, 5, 12), LocalTime.of(14, 25),10000, 0.00, 180.00, true);
        System.out.println("\nLocações\n");
        System.out.println(locacao1);
        System.out.println(locacao2);

        System.out.println("\nAlternando estado na memória RAM\n");
        System.out.println("\nLocações:");

        locacao1.setDataLocacao(LocalDate.of(2023, 11, 14));
        locacao1.setHoraLocacao(LocalTime.of(9, 30));
        locacao1.setDataDevolucao(LocalDate.of(2023,12,04));
        locacao1.setHoraDevolucao(LocalTime.of(20, 30));
        locacao1.setQuilometragem(50000);
        locacao1.setValor_calcao(80.0);
        locacao1.setValor_locacao(500.0);
        locacao1.setDevolvido(false);
        System.out.println(locacao1.getDataLocacao());
        System.out.println(locacao1.getValor_locacao());
        System.out.println(locacao1.getDataDevolucao());
        System.out.println(locacao1.getHoraDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValor_calcao());

        System.out.println("\nLocação 2\n");

        locacao2.setDataLocacao(LocalDate.of(2023, 5, 30));
        locacao2.setHoraLocacao(LocalTime.of(6,40));
        locacao2.setDataDevolucao((LocalDate.of(2023,12,3)));
        locacao2.setHoraDevolucao(LocalTime.of(16,50));
        locacao2.setQuilometragem(70000);
        locacao2.setValor_calcao(1000.0);
        locacao2.setValor_locacao(200.30);
        locacao2.setDevolvido(false);
        System.out.println(locacao2.getDataLocacao());
        System.out.println(locacao2.getHoraLocacao());
        System.out.println(locacao2.getDataDevolucao());
        System.out.println(locacao2.getHoraDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValor_calcao());
        System.out.println(locacao2.getValor_locacao());
        System.out.println();

        //2 - Adicionando instancias com o id

        Locacao locacao3 = new Locacao(3, LocalDate.of(2023, 12, 8), LocalTime.of(11, 20), LocalDate.of(2020, 5, 12), LocalTime.of(18, 25),10800, 20.00, 180.00, true);
        Locacao locacao4 = new Locacao(4, LocalDate.of(2023, 12, 14), LocalTime.of(10, 50), LocalDate.of(2021, 8, 12), LocalTime.of(14, 55),10090, 9.00, 190.00, false);
        Locacao locacao5 = new Locacao(5, LocalDate.of(2023, 2, 12), LocalTime.of(20, 20), LocalDate.of(2021, 5, 12), LocalTime.of(13, 25),40000, 6.00, 500.00, true);

        //Coleção tipo list

        List<Locacao> locacoesList = new ArrayList<>();
        locacoesList.add(locacao1);
        locacoesList.add(locacao2);
        locacoesList.add(locacao3);
        locacoesList.add(locacao4);
        locacoesList.add(locacao5);
        System.out.println("\nColeções tipo list\n");
        System.out.println(locacoesList);

        //ordenando objetos na list

        System.out.println("\nOrdenando objetos tipo list\n");
        locacoesList.sort(Comparator.comparing(Locacao::getId));
        System.out.println(locacoesList);

        //pesquisa tipom list
        System.out.println("\nPesquisando tipo list\n");
        Locacao locacaoFind = locacoesList.stream().filter(l -> l.getDataLocacao().equals(2023)).findAny().orElse(null);
        System.out.print("\nEncontrando veículo na coleção do tipo List pela locação");
        System.out.println(locacaoFind);


        //Coleções tipo Map

        Map<Integer,Locacao> locacoesMap = new HashMap<>();
        locacoesMap.put(Integer.valueOf(String.valueOf(locacao1.getId())), locacao1);
        locacoesMap.put(Integer.valueOf(String.valueOf(locacao2.getId())), locacao2);
        locacoesMap.put(Integer.valueOf(String.valueOf(locacao3.getId())), locacao3);
        locacoesMap.put(Integer.valueOf(String.valueOf(locacao4.getId())), locacao4);
        locacoesMap.put(Integer.valueOf(String.valueOf(locacao5.getId())), locacao5);
        System.out.println("\nColeções tipo Map\n");
        System.out.println(locacoesMap);

        //pesquisando objetos na colecao Map

        System.out.println("\nProcurando objetos na coleção Map\n");
        System.out.println(locacoesMap.get(3));
    }
}

