package mapInterface;

import java.util.concurrent.CountDownLatch;

public class CountDown_2 {
    public static void main(String[] args)throws Exception{
        CountDownLatch l=new CountDownLatch(2);
        for(int i=1;i<=2;i++){
            Demo_4 d=new Demo_4(l);
            Thread t=new Thread(d);
            t.start();


        }
        System.out.println("main thread waiting...");

        l.await();
        System.out.println("main thread completed");
    }

}
class Demo_4 implements Runnable{
    CountDownLatch l;
    Demo_4(CountDownLatch l){
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
