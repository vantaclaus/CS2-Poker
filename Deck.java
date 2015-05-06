import java.util.*;

public class Deck {
   private ArrayList<Card> deck;
   private Random rng = new Random();

   public Deck(){
      String[] suits = {"h","s","d","c"};
      deck = new ArrayList<Card>();
      //TODO: Add a card (2-14) of each suit (h,s,d,c)
      for(int i=0; i<4; i++){
        for(int j=2; j<15; j++){
          deck.add(new Card(j,suits[i]));
        }
      }
   }

   public Card remove(){
      int rand = rng.nextInt(deck.size()-1);
      return deck.remove(rand);
   }

   public String toString(){
      return deck.toString();
   }
}
