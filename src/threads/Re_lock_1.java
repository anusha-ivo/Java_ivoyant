package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Re_lock_1 {
    public static void main(String[] args){
        R1 r=new R1();
        Thread t=new Thread(r,"t1");
        Thread t2=new Thread(r,"t2");
        t.start();
        t2.start();


    }
}
class R1 implements Runnable {
    ReentrantLock r = new ReentrantLock();

    public void run() {
        try {
            if (r.tryLock(200, TimeUnit.MILLISECONDS)) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + "is excecuting");
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {

                }
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "is excecuting bez its get lock");
                }

            }

        } catch (Exception e) {

        }
    }
}

