package colecoes_genericas.metodo_shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Figura 16.10: DeckOfCards.java
// Embaralhamento e distribuição de cartas com método shuffle de Collections.
public class DeckOfCards {

    private List<Card> list;

    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0;

        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards(){
        for(int i = 0; i < list.size(); ++i){
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "%n" : "");
        }
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.printCards();
    }
}
