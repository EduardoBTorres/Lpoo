package controller;

import model.*;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaController {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(1234567, "fornecedor1@gmail.com", "f1");
        Fornecedor f2 = new Fornecedor(89101112, "fornecedor2@gmail.com", "f2");

        Vendedor v1 = new Vendedor(201811124, "Rafael", "Av Juscelino", "Centro", "96070-000", "Pelotas", "RS", "Próximo ao seu zé");
        Vendedor v2 = new Vendedor(2019334455, "Enzo", "Av Duque de Caxias", "Fragata", "96040-770", "Pelotas", "RS", "Próximo ao Farroupilha");

        Produto p1 = new Produto(1, "PS5", 20, 4500.50, f1);
        Produto p2 = new Produto(2, "Fone de ouvido", 10, 600.70, f2);

        Pedido ped1 = new Pedido(12, LocalDate.of(2023, 10, 22), 300.50, "Pendente", v1);
        Pedido ped2 = new Pedido(22, LocalDate.of(2023, 5, 6), 400.70, "Atendido", v2);

        Item i1 = new Item(33, 30.60, 10);
        Item i2 = new Item(44, 60.80, 20);

        if (p1.getQuantidade() > 0 && p2.getQuantidade() > 0) {
            System.out.println("\nVendas Realizadas:");

            List<Pedido> pedidosrealizados = new ArrayList<>();
            pedidosrealizados.add(ped1);
            pedidosrealizados.add(ped2);
            System.out.println(pedidosrealizados);

            ped1.getItems().add(i1);
            ped2.getItems().add(i2);
            v1.getPedidos().add(ped1);
            v2.getPedidos().add(ped2);

            System.out.println("\nAtual estoque de vendas:");
            p1.setQuantidade(p1.getQuantidade() - i1.getQuantidade());
            p2.setQuantidade(p1.getQuantidade() - i2.getQuantidade());

            System.out.println("\nPrimeira venda:");
            System.out.println(v1.getPedidos());

            System.out.println("\nSegunda venda:");
            System.out.println(v2.getPedidos());

            Produto p3 = new Produto(3, "Controle Xbox", 4, 1200.00, f1);
            Produto p4 = new Produto(4, "Mousepad", 10, 200.00, f1);

            int forn1 = 35;
            double totalforn1 = forn1 * p3.getPreco();
            p3.setQuantidade(p3.getQuantidade() + forn1);
            Fornecimento fornecimento1 = new Fornecimento(LocalDate.of(2023, 9, 30), totalforn1, f1, p3);

            int forn2 = 45;
            double totalforn2 = forn2 * p3.getPreco();
            p4.setQuantidade(p3.getQuantidade() + forn2);
            Fornecimento fornecimento2 = new Fornecimento(LocalDate.of(2023, 8, 19), totalforn2, f1, p4);

            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(fornecimento1);
            fornecimentos.add(fornecimento2);
            System.out.println("\nFornecimentos realizados:");
            System.out.println(fornecimentos);

            double totalDoFornecimento = 0;
            for (Fornecimento fornecimento : fornecimentos) {
                totalDoFornecimento = totalDoFornecimento + fornecimento.getValorTotal();
            }
            System.out.println("\nTotal:");
            System.out.println(NumberFormat.getInstance().format(totalDoFornecimento));

        } else comportamento();
    }

    private static void comportamento() {
        EstoqueInsuficienteException();
    }

    private static void EstoqueInsuficienteException() {
        try {
            System.out.println("\nErro, estoque insuficiente.\n");
            throw new EstoqueInsuficienteException();
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Finalmente executado.");
        }
    }

    static class EstoqueInsuficienteException extends Exception {
        public EstoqueInsuficienteException() {
            super("\nErro, estoque insuficiente.");
        }
    }
}

