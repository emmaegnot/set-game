import java.util.ArrayList;

public class Triple {
    private final ArrayList<Card> cards;
    private boolean valid;

    public Triple(ArrayList<Card> cards){
        if (cards.size() == 3) {
            this.cards = cards;
            setValid();
        }
        else throw new IllegalArgumentException("too many cards in triple");
    }

    //this will return whether
    public void setValid(){
        // check whether triple is a set
        // then set valid attribute
    }
}
