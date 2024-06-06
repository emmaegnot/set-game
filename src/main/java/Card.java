public final class Card {
    //first attributes
    private final Game.Colour colour;
    private final Game.Number number;
    private final Game.Shape shape;
    private final Game.Fill fill;

    public Card (Game.Colour colour, Game.Number number, Game.Shape shape, Game.Fill fill){
        this.colour = colour;
        this.number = number;
        this.shape = shape;
        this.fill = fill;
    }
}
