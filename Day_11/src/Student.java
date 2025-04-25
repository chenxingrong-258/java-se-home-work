public class Student {
    private String name;
    private Card card;

    public Student(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
