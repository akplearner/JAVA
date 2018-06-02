enum Suit{
//instance varibles
    CLUBS("black"),DIAMONDS("red"),HEARTS("red"),SPADES("black");
    private final String color;
//constructor    
    private Suit(String suitColor){
        color = suitColor;
    }
//getter
    public String getColor(){
        return color;
    }
}