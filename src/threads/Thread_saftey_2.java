package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_saftey_2 {
    public static void main(String[] args)throws Exception{
        Saf_2 s2=new Saf_2();
        Thread t1=new Thread(s2);
        Thread t2=new Thread(s2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(s2.k.get());


    }
}
class Saf_2 implements Runnable{
    AtomicInteger k=new AtomicInteger(20);
    public void run(){
        for(int i=0;i<100;i++){
            k.incrementAndGet();
        }
    }
}
