package colecoes_genericas.exercicios;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<String>();
        lista1.add("B");
        lista1.add("E");
        lista1.add("A");
        lista1.add("C");
        lista1.add("D");

        System.out.println("Lista");
        exibir(lista1);

        System.out.println("Lista ordenada");
        Collections.sort(lista1);
        exibir(lista1);

        System.out.println("Lista embaralhada");
        Collections.shuffle(lista1);
        exibir(lista1);

    }

    private static <T> void exibir(Collection<T> elementos){
        Iterator<T> iterator = elementos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
