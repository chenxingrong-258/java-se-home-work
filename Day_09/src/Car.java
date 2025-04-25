public class Car {
    private String model;
    private double litre;
    public Car(){
    }
    public Car(String model, double litre) {
        this.model = model;
        this.litre = litre;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

}
