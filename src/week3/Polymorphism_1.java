package week3;

public class Polymorphism_1 {
    public static void main(String[] args){
        Arun a=new Bhooo();
        System.out.println(a.i);

        a.dis();

        Bhooo b2=new Bhooo();
        System.out.println(b2.j);



    }
}
class Arun{
    int i=10;
    void dis(){
        System.out.println("IAS officer");
    }
}
class Bhooo extends Arun{
    int j=19;
    void dis(){
        System.out.println("software engineering");
    }
}
