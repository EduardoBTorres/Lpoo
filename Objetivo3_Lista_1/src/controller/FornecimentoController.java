package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        //e
        Produto p1 = new Produto(1, "Leite", 20, 5.50);
        Produto p2 = new Produto(2, "Açúcar", 50, 4.80);
        Produto p3 = new Produto(3, "Arroz", 5, 25.00);

        Fornecedor f1 = new Fornecedor(239400403, "32456784", "Leomar");
        Fornecedor f2 = new Fornecedor(465792003, "32678945", "Zafalon");

        //calcula o total
        double total = p1.getPreco() * 50;
        //baixa o estoque
        p1.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr1 = new Fornecimento(LocalDateTime.of(2021, 10, 1, 3, 5), total, f1, p1);

        //calcula o total
        total = p2.getPreco() * 50;
        // baixa o estoque
        p2.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr2 = new Fornecimento(LocalDateTime.of(2021, 5, 8, 9, 5), total, f1, p2);

        //calcula o total
        total = p3.getPreco() * 20;
        // baixa o estoque
        p3.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr3 = new Fornecimento(LocalDateTime.of(2021, 5, 2, 8, 9), total, f2, p3);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        fornecimentos.add(fr3);
        System.out.print("\nLista de Fornecimentos");
        System.out.println(fornecimentos);

        System.out.println();
        System.out.print("\nTotal Fornecido = " +
                NumberFormat.getCurrencyInstance().format(
                        fornecimentos.stream()
                                .mapToDouble(f -> f.getTotal())
                                .sum()));

    }
}
