public final class Card {
    //first attributes
    private final Set.Colour colour;
    private final Set.Number number;
    private final Set.Shape shape;
    private final Set.Fill fill;

    public Card (Set.Colour colour, Set.Number number, Set.Shape shape, Set.Fill fill){
        this.colour = colour;
        this.number = number;
        this.shape = shape;
        this.fill = fill;
    }
}
