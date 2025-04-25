public class Day_11_03 {
    public static void main(String[] args) {
        ManCreateFactory manCreateFactory = new ManCreateFactory();
        WomanCreateFactory womanCreateFactory = new WomanCreateFactory();
        Man man1 = new Man();
        Woman woman1 = new Woman();
        manCreateFactory.create();
        man1.speak();
        man1.eat();
        man1.sleep();
        womanCreateFactory.create();
        woman1.speak();
        woman1.eat();
        woman1.sleep();
    }

}
