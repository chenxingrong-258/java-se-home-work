public class Manager {
    private String name;
    public Manager(String name) {

    }

    public Manager() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student) {
        Card card = student.getCard();
        if (card.getColor()=="红色"&&card.getType()=='A'){
            System.out.println(student.getName()+"可以借到《Java基础》");
        } else if (card.getColor()=="红色"&&card.getType()=='B') {
            System.out.println(student.getName()+"可以借到《Mysql数据库》");
        } else {
            System.out.println(student.getName()+"可以借到《Java编程思想》");
        }
    }
}
