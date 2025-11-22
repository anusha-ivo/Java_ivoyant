package threads;

public class Volatile_2 {
    public static void main(String[] args)throws Exception{
        V2 v=new V2();
        Thread t=new Thread(v);
        t.start();
        Thread.sleep(30);
        v.a=6;


    }
}
class V2 extends Thread{
    volatile static int a=4;
    public void run(){
        System.out.println("V2 cls started");
        while(a==4){
            System.out.println("a is 4");
        }
        System.out.println("V2 cls stoped");
    }
}
