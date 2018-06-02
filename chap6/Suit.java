//listing 6.20
/** An enumeration of cards suits */
enum Suit{
//instaance variables
    CLUBS("black"), DIAMONDS("red"), HEARTS("red"), SPADES("black");
    private final String color;
//constructor
    private Suit(String suitColor) {
        color = suitColor; 
    }
//methods
    public String getColor() {
        return color; 
    }
}