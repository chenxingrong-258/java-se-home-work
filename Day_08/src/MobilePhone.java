public class MobilePhone {
    String colour;
    String brand;
    String factory;
    int weight;
    public MobilePhone(String colour, String brand, String factory, int weight) {

    }

    public MobilePhone() {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
    void call(){
        System.out.println("Calling mobile phone");
    }
    void  message(){
        System.out.println("Message from mobile phone");
    }
}
