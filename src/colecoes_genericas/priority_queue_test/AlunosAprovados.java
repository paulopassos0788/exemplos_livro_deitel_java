package colecoes_genericas.priority_queue_test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AlunosAprovados {

    public static void aprovados(PriorityQueue<Aluno> alunos, double limiteNota) {

        List<Aluno> reprovados = new ArrayList<>();
        List<Aluno> aprovados = new ArrayList<>();

        // Filtrando alunos em uma única passagem
        while (!alunos.isEmpty()) {
            Aluno aluno = alunos.poll();
            if (aluno.getNota() < limiteNota) {
                reprovados.add(aluno);
            } else {
                aprovados.add(aluno);
            }
        }

        // Exibindo os alunos reprovados
        System.out.println("Alunos reprovados:");
        for (Aluno aluno : reprovados) {
            System.out.println("Aluno reprovado: " + aluno);
        }

        // Exibindo os alunos aprovados
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : aprovados) {
            System.out.println(aluno);
        }

    }
}
