package threads;

public class Volatile_1 {
    public static void main(String[] args)throws Exception{
        V v=new V();
        Thread t=new Thread(v);
        t.start();
        Thread.sleep(40);
        v.a=false;
        System.out.println("main cls closed");


    }
}
class V extends Thread{
    volatile boolean a=true;
    public void run(){
        System.out.println(" v cls started");
        while(a){
            System.out.println(" while loop started");
        }
        System.out.println("v cls stopped");
    }
}
