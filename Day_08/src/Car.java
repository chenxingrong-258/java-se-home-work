public class Car {
    private String model;
    private int time;
    public Car() {
    }
    public Car(String model, int time) {
        this.model = model;
        this.time = time;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    void toll(){
        if (model.equals("小型车")&&time<=1){
            System.out.println("收费8元");
        }else if (model.equals("小型车")&&time>1){
            int price = 8+5*(time-1);
            System.out.println("收费"+price+"元");
        }else if (model.equals("大型车")&&time<=1){
            System.out.println("收费15元");
        }else if (model.equals("大型车")&&time>1){
            int price = 15+8*(time-1);
            System.out.println("收费"+price+"元");
        }
    }

}
