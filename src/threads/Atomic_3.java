package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_3 {
    public static void main(String[] args)throws Exception{
        At_2 a1=new At_2();
        Thread t1=new Thread(a1);
        Thread t2=new Thread(a1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a1.a.get());


    }
}
class At_2 implements Runnable{
    AtomicInteger a=new AtomicInteger(0);
    public void run(){
        for(int i=0;i<20;i++){
            a.incrementAndGet();
        }
    }


}
