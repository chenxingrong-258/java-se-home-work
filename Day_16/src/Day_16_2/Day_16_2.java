package Day_16_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day_16_2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("李白","2024-9-5");
        Buyer buyer2 = new Buyer("李信","2024-9-10");
        Buyer buyer3 = new Buyer("白起","2024-9-28");
        Buyer buyer4 = new Buyer("李元芳","2024-10-10");
        buyer.buySituation(buyer);
        buyer2.buySituation(buyer2);
        buyer3.buySituation(buyer3);
        buyer4.buySituation(buyer4);
    }
}
class Buyer{

    private String name;
    private String buytime;

    public Buyer() {
    }

    public Buyer(String name, String buytime) {
        this.name = name;
        this.buytime = buytime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuytime() {
        return buytime;
    }

    public void setBuytime(String buytime) {
        this.buytime = buytime;
    }
    public void buySituation(Buyer buyer) {
        LocalDate localDate = LocalDate.of(2024,9,2);
        String [] date = buyer.getBuytime().split("-");
        LocalDate localDate1 = LocalDate.of(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
        long weeks = ChronoUnit.WEEKS.between(localDate,localDate1 );
        if (weeks>=0&&weeks<1) {
            System.out.println(buyer.getName()+"于"+buyer.getBuytime()+"购买成功并消费1430点券");
        } else if (weeks>=1&&weeks<2) {
            System.out.println(buyer.getName()+"于"+buyer.getBuytime()+"购买成功并消费1609点券");
        } else if (weeks>=2&&weeks<=3) {
            System.out.println(buyer.getName()+"于"+buyer.getBuytime()+"购买成功并消费1788点券");
        } else {
            System.out.println(buyer.getName()+"于"+buyer.getBuytime()+"购买失败");
        }
    }
}
