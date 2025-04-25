public class Factory {
    public void create(People people) {
        if (people instanceof Man){
            System.out.println("Man has been created");
        }else if(people instanceof Woman){
            System.out.println("Woman has been created");
        } else {
            System.out.println("Unknown creature");
        }
    }
}
