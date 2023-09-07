package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2,"Celular", "Samsung", 1700.00, 50);
        System.out.println(produto1);
        System.out.println(produto2);

        //Alterando estado na memória RAM

        produto1.setId(1);
        produto1.setNome("Garrafa");
        produto1.setDescricao("Plástica");
        produto1.setValor(30.00);
        produto1.setEstoque(100);
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        produto2.setNome("Caneta");
        produto2.setDescricao("Azul");
        produto2.setValor(10.00);
        produto2.setEstoque(1000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        //2 - adicionando instancias com id

        Produto produto3 = new Produto(3, "Borracha", "Branca", 5.00, 200);
        Produto produto4 = new Produto(4, "Lápis", "Grafite", 2.00, 20);

        //Coleção tipo list

        System.out.println("\nColeção tipo List:\n");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        System.out.println(produtos);

        //Ordenando

        System.out.println("\nOrdenando list\n");
        produtos.sort(Comparator.comparing(Produto::getId));
        System.out.println(produtos);

        //Pesquisando tipo list

        System.out.println("\nPesquisa tipo List\n");
        Produto produtosFind = produtos.stream().filter(p -> p.getNome().equals("Borracha")).findAny().orElse(null);
        System.out.println(produtosFind);

        //Coleções tipo Map

        System.out.println("\nColeção tipo Map\n");
        Map<Integer,Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        System.out.println(produtosMap);

        //Pesquisando na coleção Map

        System.out.println("Pesquisando tipo Map");
        System.out.println();
        System.out.println("Encontrando objeto pela chave id");
        System.out.println(produtosMap.get(3));

        //Ordenando coleção list com reversed

        System.out.println("Ordenando na ordem decrescente tipo List:");
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);
    }
}