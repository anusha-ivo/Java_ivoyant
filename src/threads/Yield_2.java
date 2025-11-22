package threads;

public class Yield_2 {
    public static void main(String[] args){


        T1 t=new T1();
        t.start();
        T2 t2=new T2();
        t2.setPriority(10);
        t2.start();
        //t2.start();
        //t2.setPriority(10);
        System.out.println("by main thread");


    }

}
class T1 extends Thread{
    public void run(){
        System.out.println("by t1 thread");

    }
}
class T2 extends Thread{
    public void run(){
        System.out.println("by t2 by thread");
        //Thread.yield();
    }
}
