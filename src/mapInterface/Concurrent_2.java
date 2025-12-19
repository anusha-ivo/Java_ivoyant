package mapInterface;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_2 {
    static  ConcurrentHashMap c=new ConcurrentHashMap();
    public static void main(String[] args)throws Exception{
        c.put(1,'a');
        c.put(3,'u');
        System.out.println(c);
        MyT m=new MyT();
        m.start();
        Thread.sleep(2000);
        System.out.println("final changes "+c);

    }
}
class MyT extends Thread{

    public void run(){
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        System.out.println("added by child thread");
        Concurrent_2.c.put(2,'f');
    }
}
