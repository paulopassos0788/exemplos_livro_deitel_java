package colecoes_genericas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Método Collections sort.
// Utilizando um objeto Comparator com o método sort.
public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);

        list.sort(Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s%n", list);
    }
}
