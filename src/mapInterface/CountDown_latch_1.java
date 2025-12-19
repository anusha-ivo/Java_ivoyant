package mapInterface;

import java.util.concurrent.CountDownLatch;

public class CountDown_latch_1 {
    public static void main(String[] args)throws Exception{
        CountDownLatch l=new CountDownLatch(3);

        for(int i=1;i<=3;i++){
            Demo_1 d=new Demo_1(l);
            Thread t=new Thread(d);
            t.start();

        }
        System.out.println("main threads wait");
        l.await();
        System.out.println("main threads completes");





    }
}
class Demo_1 implements Runnable{
    CountDownLatch l;
    Demo_1( CountDownLatch l){
        this.l=l;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"started");
            Thread.sleep(30);
            System.out.println(Thread.currentThread().getName()+"completed");
        } catch (InterruptedException e) {

        }
        finally {
            l.countDown();
        }
    }


}
