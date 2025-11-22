package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_3 {
    public static void main(String[] args){
        RE_2 r=new RE_2();
        Thread t=new Thread(r,"t1");
        Thread t2=new Thread(r,"t2");
        t.start();
        t2.start();


    }
}
class RE_2 implements Runnable{
    ReentrantLock r=new ReentrantLock();
    public void run(){
        if(r.tryLock()){
            try{
                for(int i=0;i<4;i++) {
                    System.out.println("by thread " + Thread.currentThread().getName());
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {

            }
            r.unlock();
        }
        else{        System.out.println(" unable to get chance so alternative perform by thread "+Thread.currentThread().getName());

        }
    }
}
