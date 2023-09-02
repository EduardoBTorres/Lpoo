package controller;

import model.Cliente;
import model.Veiculo;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        System.out.println(cliente1);
        System.out.println();
        Cliente cliente2 = new Cliente("04764629089", "Eduardo", "Torres", "Cerrito-RS", "96395000", "(53)98401-4033", "eduardobtorres17@gmail.com");
        System.out.println(cliente2);

        //Alterando o objeto na memória RAM

        System.out.println("Alterando o estado na memória RAM");
        System.out.println();

        System.out.println("Cliente 1");

        cliente1.setCpf("57244278004");
        cliente1.setNome("Ana Lucia");
        cliente1.setSobrenome("Torres");
        cliente1.setEndereco("Pelotas");
        cliente1.setCep("96040770");
        cliente1.setTelefone("(53)98122-8934");
        cliente1.setEmail("luciabertinetti@gmail.com");

        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());

        System.out.println();
        System.out.println("Cliente 2");

        cliente2.setCpf("39107523068");
        cliente2.setNome("Ronaldo");
        cliente2.setSobrenome("Torres");
        cliente2.setEndereco("Pedro Osório");
        cliente2.setCep("96395111");
        cliente2.setTelefone("(53)98436-1543");
        cliente2.setEmail("ronaldotorres@gmail.com");

        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        // adicionando instancias com atributo id

        Cliente cliente3 = new Cliente("0978485495","João", "Silva", "Pará", "84384848", "(93)8759-5768", "joaosilva@gmail.com");
        Cliente cliente4 = new Cliente("7575646465", "Helena", "Silveira", "Cerrito", "96395000", "(53)98764-4657", "helenasilveira@gmail.com");
        Cliente cliente5 = new Cliente("8548458745", "Mariza", "Oliveira", "Porto Alegre", "34657836", "(51)9878-2345", "marizaoliveira@gmail.com");

        //coleção tipo List

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        System.out.println("\nColeção tipo List\n");
        System.out.println(clientes);
        System.out.println();

        //ordenando tipo list
        System.out.println("Ordenando pelo nome");
        clientes.sort(Comparator.comparing(Cliente::getNome));
        System.out.println(clientes);
        System.out.println();

        //pesquisando na coleção list
        System.out.println("Pesquisando pessoas na coleção tipo List");
        System.out.println();
        Cliente clientesFind = clientes.stream().filter(c -> c.getNome().equals("Ronaldo")).findAny().orElse(null);
        System.out.println("Procurando clientes pelo nome:");
        System.out.println(clientesFind);

        //coleção tipo Map

        Map<String,Cliente> clientesMap = new HashMap<>();
        clientesMap.put(cliente1.getCpf(), cliente1);
        clientesMap.put(cliente2.getCpf(),cliente2);
        clientesMap.put(cliente3.getCpf(),cliente3);
        clientesMap.put(cliente4.getCpf(), cliente4);
        clientesMap.put(cliente5.getCpf(), cliente5);
        System.out.println("Coleção tipo Map");
        System.out.println(clientesMap);

        //pesquisando na coleção Map

        System.out.println();
        System.out.println("Encontrando objeto pela chave");
        System.out.println(clientesMap.get("8548458745"));

    }
}

