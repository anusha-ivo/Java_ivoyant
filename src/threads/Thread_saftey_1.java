package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_saftey_1 {
    public static void main(String[] args) throws Exception{
        Safe_1 s=new Safe_1();
        Thread t=new Thread(s);
        t.start();
        t.join();
        Thread t2=new Thread(s);
        t2.start();
        t2.join();
        System.out.println(s.c.get());

    }
}
class Safe_1 implements Runnable{
    AtomicInteger c=new AtomicInteger(0);
    public void run(){
        for(int i=0;i<1000;i++){
            c.incrementAndGet();
        }

    }
}
