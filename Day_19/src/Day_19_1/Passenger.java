package Day_19_1;

public class Passenger {
    private String name;
    private String routeName;
    private String pullIn;
    private String pullOut;

    public Passenger(String name, String routeName, String pullIn, String pullOut) {
        this.name = name;
        this.routeName = routeName;
        this.pullIn = pullIn;
        this.pullOut = pullOut;
    }

    public Passenger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getPullIn() {
        return pullIn;
    }

    public void setPullIn(String pullIn) {
        this.pullIn = pullIn;
    }

    public String getPullOut() {
        return pullOut;
    }

    public void setPullOut(String pullOut) {
        this.pullOut = pullOut;
    }
}
