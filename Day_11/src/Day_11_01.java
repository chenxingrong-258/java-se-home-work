public class Day_11_01 {
    public static void main(String[] args) {
        Manager manager = new Manager("杜甫");
        Student s1 = new Student("李白");
        Card card1 = new Card("红色",'A');
        s1.setCard(card1);
        manager.check(s1);
        Card card2 = new Card("红色",'B');
        s1.setCard(card2);
        manager.check(s1);
    }
}
