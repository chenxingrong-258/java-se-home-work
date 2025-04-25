public class Man implements People{

    @Override
    public void eat() {
        System.out.println("Man eat");
    }

    @Override
    public void sleep() {
        System.out.println("Man sleep");
    }

    @Override
    public void speak() {
        System.out.println("Man speak");
    }
}
