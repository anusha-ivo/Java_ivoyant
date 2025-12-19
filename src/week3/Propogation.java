package week3;

public class Propogation {
    public static void main(String[] args){
        m1();

    }
    static void m1(){
        m2();
    }
    static void m2(){
        try {
            m3();
        }
        catch (Exception e){
            System.out.println("not divided by 0 ");
        }
    }
    static void m3(){
        System.out.println(10/0);
    }

}
