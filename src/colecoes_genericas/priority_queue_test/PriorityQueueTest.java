package colecoes_genericas.priority_queue_test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Aluno> alunos = new PriorityQueue<Aluno>((a1, a2) -> Double.compare(a2.getNota(), a1.getNota()));

        alunos.add(new Aluno("Alice", 6.5));
        alunos.add(new Aluno("Bob", 9.8));
        alunos.add(new Aluno("Charlie", 4.2));
        alunos.add(new Aluno("David", 3.8));

        AlunosAprovados.aprovados(alunos, 5.0);
    }
}
