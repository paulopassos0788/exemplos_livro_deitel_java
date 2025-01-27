package colecoes_genericas;

import java.util.Arrays;
import java.util.LinkedList;

// Figura 16.4: UsingToArray.java
// Visualizando arrays como Lists e convertendo Lists em arrays
public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3, "orange");
        links.addFirst("cyan");

        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
