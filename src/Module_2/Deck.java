package Module_2;
import java.util.ArrayList;

public class Deck {

    /**
     * This deck of Cards
     */
    private ArrayList<Card> myDeck;
    /**
     * The names of the card suits
     */
    private String[] suits = {"spades", "hearts", "diamonds", "clubs"};

    /**
     * Class constructor that initializes myDeck to a standard deck of 52 playing cards (without jokers)
     */
    public Deck() {
        myDeck = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 2; j <= 14; j++) {
                myDeck.add(new Card(suits[i], j));
            }
        }
    }

    /**
     * Shuffles this Deck
     */
    public void shuffle()
    {

        for (int i = 0; i < 500; i++){
            int randomIndex = (int) (Math.random() * myDeck.size());
            Card card = myDeck.remove(randomIndex);
            myDeck.add(card);
        }


    }

    /**
     * If possible, deals a Card from the Deck
     *
     * @return the first Card in myDeck (if it's not empty) or null (otherwise)
     */
    public Card dealCard()
    {
        if (myDeck.size() > 0){
            Card card = myDeck.remove(0);
            return Card;
        }




    }
}

private ArrayList<Card> myHand;

public Hand(){
    myHand = new ArrayList<Card>(5);
}

public ArrayList<Card> getHand(){
    return myHand;
}

public void addCard(Card card){
    myHand.add(card);
}

public void printHand(){
    for (int i = 0; i < myHand.size(); i++){
        System.out.println(myHand.get(i));
    }
}