public class PokerHand{
//instance variables
    private Card[] hand;
    private int rank;
//constructors
    public PokerHand(){
        this( new Card(), new Card(),new Card(), new Card(), new Card() );
    }
    public PokerHand( Card c1, Card c2, Card c3, Card c4, Card c5 ){
        hand = new Card[5];
        hand[0] = c1;
        hand[1] = c2;
        hand[2] = c3;
        hand[3] = c4;
        hand[4] = c5;
      //  evalRank();
    }
//getters and setters
    public int getRank(){
        return rank;
    }
//methods

}