public class Day_11_02 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        Factory factory = new Factory();
        factory.create(man);
        man.eat();
        man.sleep();
        man.speak();
        factory.create(woman);
        woman.eat();
        woman.sleep();
        woman.speak();
    }
}
