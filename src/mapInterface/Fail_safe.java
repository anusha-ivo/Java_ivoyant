package mapInterface;

import java.util.concurrent.CopyOnWriteArrayList;

import static mapInterface.Concurrent_2.c;

public class Fail_safe {
     static CopyOnWriteArrayList c=new CopyOnWriteArrayList();
    public static void main(String[] args)throws Exception{
        c.add(45);
        c.add(67);
        System.out.println(c);
        Myt_2 m=new Myt_2();
        m.start();
        Thread.sleep(300);
        System.out.println(c);


    }
}
class Myt_2 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

        }
        System.out.println("added by child thread");
        Fail_safe.c.add(23);
    }
}
