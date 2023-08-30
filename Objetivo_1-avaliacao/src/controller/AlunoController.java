package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {

        //criando instâncias da classe de modelo
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3, 12345, "Eduardo", "Torres", "eduardobtorres17@gmail.com");
        Aluno aluno4 = new Aluno(4, 4321, "Guilherme", "Macedo", "macedoguilherme@gmail.com");
        Aluno aluno5 = new Aluno(5, "Leonardo");
        Aluno aluno6 = new Aluno(6, "Junior");

        System.out.println("\nAlunos:\n");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //Alterando estado dos objetos na memória RAM
        System.out.println("Aluno 1:");
        System.out.println("\nAlterando o objeto na memória RAM:\n");
        aluno1.setId(1);
        aluno1.setCpf(987878);
        aluno1.setNome("Amanda");
        aluno1.setSobrenome("Souza");
        aluno1.setEmail("amandasouza@gmail.com");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println("Aluno 2:");
        System.out.println("\nAlterando o objeto na memória RAM:\n");
        aluno2.setId(2);
        aluno2.setCpf(878);
        aluno2.setNome("José");
        aluno2.setSobrenome("Martins");
        aluno2.setEmail("josemartins@gmail.com");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //2 Criando coleções tipo List e Map

        //Coleção tipo List
        System.out.println("\nColeção tipo List\n");
        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);

        System.out.println("\nOrdenando a coleção tipo list:\n");

        alunosList.sort(Comparator.comparing(Aluno::getId));
        System.out.println(alunosList);

        System.out.println("\nPesquisa na coleção:\n");
        Aluno alunosFind = alunosList.stream().filter(a -> a.getNome().equals("Leonardo")).findAny().orElse(null);
        System.out.print("\nEncontrando aluno na coleção do tipo List pelo id");
        System.out.println(alunosFind);

        //Coleção tipo Map
        System.out.println("\nColeção tipo Map:\n");
        Map<Integer,Aluno> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);//Como ordenar o id se ele é um inteiro??? precisa ser string!!
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);
        System.out.println(alunosMap);

        System.out.println("\nPesquisa tipo Map:\n");
        System.out.println(alunosMap.get(5));

        //Reordenando na ordem decrescente
        System.out.println("\nOrdenando a coleção tipo list:\n");

        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunosList);
        System.out.println("aaaaa");





    }
}
