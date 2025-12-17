package week3;

public class INheritance_1 {
    public static void main(String[] args){
        Abh a=new Abh();
        System.out.println(a.i);
        System.out.println(a.j);
        a.dis();
        a.dis1();


    }
}
class Perso{
    int i=10;
    void dis(){
        System.out.println("parent class : ");
    }
}
class Abh extends Perso{
    int j=20;
    void dis1(){
        System.out.println("Abh class : ");
    }
    void dis(){
        System.out.println("in child  class overriding  : ");//method overriding
    }
}

