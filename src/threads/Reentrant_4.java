package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_4 {
    public static void main(String[] args){
        Re_3 r=new Re_3();
        Thread t=new Thread(r,"t1");
        Thread t2=new Thread(r,"t2");
        t.start();
        t2.start();


    }
}
class Re_3 implements Runnable {
    ReentrantLock r = new ReentrantLock();

    public void run() {
        try {
            if (r.tryLock(2000, TimeUnit.MILLISECONDS)) {
                try {
                    for (int i = 0; i < 4; i++) {
                        System.out.println("by thread " + Thread.currentThread().getName());
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {

                }

            } else {
                for (int i = 0; i < 4; i++) {
                    System.out.println(" waited but not get by thread " + Thread.currentThread().getName());

                }
            }
        } catch (Exception e) {

        }


    }
}
