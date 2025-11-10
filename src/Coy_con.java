 class Copy_con {
    public static void main(String[] args){
        Conse c=new Conse("anu", 23,20);
c.dis();
        Conse c2=new Conse("bhoo");
        c2.dis();

    }
}
class Conse {
    String name;
    int age;
    int roll;

    Conse(String name, int age, int roll) {

        this(name);
        this.name = name;
        this.age = age;
        this.roll = roll;

    }

    Conse(String name) {
        System.out.println("1 para");
        this.name = name;
        age=22;
    }

    void dis() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }
}
