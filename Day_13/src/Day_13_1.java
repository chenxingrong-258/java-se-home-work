import java.util.Objects;

public class Day_13_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tiger tiger = new Tiger(1.5,300);
        Tiger tiger1 = (Tiger)tiger.clone();
        System.out.println(tiger.equals(tiger1));
        System.out.println(tiger1.toString());
    }

}
class Tiger implements Cloneable {
    double height;
    int weight;

    public Tiger(double height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Tiger() {
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return Double.compare(height, tiger.height) == 0 && weight == tiger.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
