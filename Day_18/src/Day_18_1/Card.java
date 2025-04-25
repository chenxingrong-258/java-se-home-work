package Day_18_1;

public class Card {
    private int number;
    private String value;
    public Card(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public Card() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", value='" + value + '\'' +
                '}';
    }
}
