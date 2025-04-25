public class Day_08_1 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setColour("黑色");
        mobilePhone.setBrand("Mate40");
        mobilePhone.setFactory("华为");
        mobilePhone.setWeight(200);
        mobilePhone.call();
        MobilePhone mobilePhone1 = new MobilePhone();
        mobilePhone.setColour("白色");
        mobilePhone.setBrand("V70");
        mobilePhone.setFactory("荣耀");
        mobilePhone.setWeight(189);
        mobilePhone.message();
    }
}
