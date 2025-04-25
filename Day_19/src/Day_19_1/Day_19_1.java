package Day_19_1;

public class Day_19_1 {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("李白","上行","凤凰山站","万寿路站");
        Passenger passenger1 = new Passenger("杜甫","下行","河滨公园站","南京工业大学站");
        Route route = new Route();
        Subway subway = new Subway();
        subway.priceCalculation(passenger,route);
        subway.priceCalculation(passenger1,route);
    }
}
