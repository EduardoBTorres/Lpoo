package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class Aluno_DisciplinaController {
    public static void main(String[] args) {
        //b
        Aluno a1 = new Aluno(20231, "Eduardo", "Torres");
        Aluno a2 = new Aluno(20221, "Alex", "Menezes");
        Disciplina d1 = new Disciplina(12345, "LPOO");
        Disciplina d2 = new Disciplina(123456, "Estrutura de Dados");
        Disciplina d3 = new Disciplina(234567, "Banco de Dados");

        System.out.println("\nAlunos:");
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\nDisciplinas:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("\nMatriculando os alunos:");
        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.println("\nDisciplinas por aluno:");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        //Desfazendo as matriculas de a2
        a2.getDisciplinas().clear();
        System.out.println("\nReimpressão de Disciplinas por aluno:");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);
    }
}
