package colecoes_genericas.exercicios;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<String>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        lista1.add("D");
        lista1.add("E");

        System.out.println("ArrayList");
        exibir(lista1);
        remover(lista1);
        exibir(lista1);

        List<String> lista2 = new LinkedList<>();
        lista2.add("A");
        lista2.add("B");
        lista2.add("C");
        lista2.add("D");
        lista2.add("E");

        System.out.println("LinkedList");
        exibir(lista2);
        remover(lista2);
        exibir(lista2);
    }
    
    private static <T> void exibir(Collection<T> elementos){
        Iterator<T> iterator = elementos.iterator();

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }

    private static <T> void remover(Collection<T> elementos){
        Iterator<T> iterator = elementos.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
