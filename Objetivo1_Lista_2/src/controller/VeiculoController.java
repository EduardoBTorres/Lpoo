package controller;

import model.Veiculo;

import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {

        // criando instancias do objeto
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo("1234", "JAG5B29", "Preto", 15, "Gasolina", "40000", "ABCDEFG", 250.50);
        System.out.println("Veiculos: ");
        System.out.println(veiculo1);
        System.out.println(veiculo2);

        System.out.print("\nAlterando estado na memoria RAM");
        System.out.println();

        System.out.println("Veiculo 1");

        veiculo1.setRenavan("9876");
        veiculo1.setPlaca("IMT8037");
        veiculo1.setCor("Branco");
        veiculo1.setNum_rodas(14);
        veiculo1.setCombustivel("Gasolina/álcool");
        veiculo1.setQuilometragem("50000");
        veiculo1.setChassi("zyxwu");
        veiculo1.setValor_locacao(500.60);
        System.out.println(veiculo1.getRenavan());
        System.out.println(veiculo1.getPlaca());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getNum_rodas());
        System.out.println(veiculo1.getCombustivel());
        System.out.println(veiculo1.getQuilometragem());
        System.out.println(veiculo1.getChassi());
        System.out.println(veiculo1.getValor_locacao());

        System.out.println();
        System.out.println("Veiculo 2");

        veiculo2.setRenavan("1234567890");
        veiculo2.setPlaca("IRJ9640");
        veiculo2.setCor("Vermelho");
        veiculo2.setNum_rodas(17);
        veiculo2.setCombustivel("Diesel");
        veiculo2.setQuilometragem("60000");
        veiculo2.setChassi("fdjhsjfkdshfjk");
        veiculo2.setValor_locacao(469.58);
        System.out.println(veiculo2.getRenavan());
        System.out.println(veiculo2.getPlaca());
        System.out.println(veiculo2.getCor());
        System.out.println(veiculo2.getNum_rodas());
        System.out.println(veiculo2.getCombustivel());
        System.out.println(veiculo2.getQuilometragem());
        System.out.println(veiculo2.getChassi());
        System.out.println(veiculo2.getValor_locacao());

        //2 Adionando instancias com atributo id no objeto

        Veiculo veiculo3 = new Veiculo("1020304050", "ITM0510", "Azul", 19, "Diesel", "150000", "lhklgkhlg", 678.79 );
        Veiculo veiculo4 = new Veiculo("547892", "IOT2233", "Amarelo", 30, "Diesel", "200000", "hdfskf", 300.90);
        Veiculo veiculo5 = new Veiculo("293748", "RNW2244", "Cinza", 20, "Gasolina", "567000", "ggfhdf", 300.70);

        //coleção tipo List

        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(veiculo1);
        veiculosList.add(veiculo2);
        veiculosList.add(veiculo3);
        veiculosList.add(veiculo4);
        veiculosList.add(veiculo5);
        System.out.println("\nColeção do tipo List\n");
        System.out.println(veiculosList);

        //ordenando objetos na coleção do tipo List

        veiculosList.sort(Comparator.comparing(Veiculo::getPlaca).reversed());
        System.out.println(veiculosList);

        //pesquisa na coleção tipo List pela placa

        Veiculo veiculoFind = veiculosList.stream().filter(v -> v.getPlaca().equals("IRJ9640")).findAny().orElse(null);
        System.out.print("\nEncontrando veículo na coleção do tipo List pela placa");
        System.out.println(veiculoFind);

        //criando um coleçao do tipo map e adcionando objetos nela

        Map<String,Veiculo> veiculosMap = new HashMap<>();
        veiculosMap.put(veiculo1.getCor(), veiculo1);
        veiculosMap.put(veiculo2.getCor(), veiculo2);
        veiculosMap.put(veiculo3.getCor(), veiculo3);
        veiculosMap.put(veiculo4.getCor(), veiculo4);
        veiculosMap.put(veiculo5.getCor(), veiculo5);
        System.out.println("\nColeção do tipo Map");
        System.out.println(veiculosMap);

        //pesquisando objetos na colecao Map

        System.out.println();
        System.out.print("\nEncontrando o objeto pela chave de pesquisa (id=3 na coleção Map");
        System.out.println(veiculosMap.get("Azul"));
    }
}
