public class Exa_3 {
    public static void main(String[] args){
        Dress d1=new Dress("kurthi",22);
d1.dis();
        Dress d2=new Dress(d1);
        d2.dis();

    }
}
class Dress{
    String name;
    int age;

    public Dress(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Dress(Dress d){
        name=d.name;
        age=d.age;
    }
    void dis(){
        System.out.println(name);
        System.out.println(age);

    }
}
