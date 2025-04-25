public class Card {
    private String color;
    private char type;

    public Card(String color, char type) {
        this.color = color;
        this.type = type;
    }
    public Card() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
