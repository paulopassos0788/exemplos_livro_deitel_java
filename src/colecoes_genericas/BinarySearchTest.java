package colecoes_genericas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Figura 16.12: BinarySearchTest.java
// Método binarySearch de Collections.
public class BinarySearchTest {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua");
        printSearchResults(list, "gray");
        printSearchResults(list, "teal");
    }

    private static void printSearchResults(List<String> list, String key) {
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if(result >= 0){
            System.out.printf("Found at index %d%n", result);
        }
        else{
            System.out.printf("Not found %d%n", result);
        }
    }
}
