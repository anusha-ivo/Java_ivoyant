package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_2 {
    public static void main(String[] args){
        Re_1 r=new Re_1();
        Thread t1=new Thread(r,"anu");
        Thread t2=new Thread(r,"bhoo");
        t1.start();
        t2.start();

    }
}
class Re_1 implements Runnable{
    ReentrantLock r=new ReentrantLock();
    public void run(){
        r.lock();
        try{
            for(int i=0;i<4;i++){
                System.out.println("this is by  thread "+Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {

        }
        r.unlock();
    }



}
