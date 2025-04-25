public class Servicshop {
    public void valuation(Car[] cars) {
        int totalPrice = 0;
        for (Car car :cars){
            if (car.getLitre()<=1){
                System.out.println(car.getModel()+"型号的车应付款"+360+"元");
                totalPrice = totalPrice+360;
            } else if (car.getLitre()>1&&car.getLitre()<=1.6) {
                System.out.println(car.getModel()+"型号的车应付款"+420+"元");
                totalPrice = totalPrice+420;
            } else if (car.getLitre()>1.6&&car.getLitre()<=2.0) {
                System.out.println(car.getModel()+"型号的车应付款"+540+"元");
                totalPrice = totalPrice+550;
            } else if (car.getLitre()>2.0&&car.getLitre()<=2.5) {
                System.out.println(car.getModel()+"型号的车应付款"+800+"元");
                totalPrice = totalPrice+800;
            } else if (car.getLitre()>2.5&&car.getLitre()<=3.0) {
                System.out.println(car.getModel()+"型号的车应付款"+1800+"元");
                totalPrice = totalPrice+1800;
            } else if (car.getLitre()>3.0&&car.getLitre()<=4.0) {
                System.out.println(car.getModel()+"型号的车应付款"+2800+"元");
                totalPrice = totalPrice+2800;
            } else if (car.getLitre()>4.0) {
                System.out.println(car.getModel()+"型号的车应付款"+3600+"元");
                totalPrice = totalPrice+3600;
            }
        }
        System.out.println("总计为"+totalPrice);
    }
}
