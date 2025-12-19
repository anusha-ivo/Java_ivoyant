package week3;

public class Mock_1 {
    public static void main(String[] args){
       // Moo m=new Moo();
       // m.dis();
        Mo m2=new Moo();
        m2.dis();
    }

}
class Mo{
    void dis(){
        System.out.println("this is by parent ");
    }
}
class Moo extends Mo{
    void dis(){
        super.dis();
        System.out.println("this is by child ");
    }

}
