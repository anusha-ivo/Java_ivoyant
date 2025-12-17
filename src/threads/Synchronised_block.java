package threads;

public class Synchronised_block {
    public static void main(String[] args){
        B b=new B();
        Thread t1=new Thread(b,"by t1");
        Thread t2=new Thread(b,"by t2");
        t1.start();
        t2.start();

    }
}
class B implements Runnable{
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("by child thread start : "+Thread.currentThread().getName());
        }
        synchronized (this){
            for (int i = 0; i < 2; i++) {
                try {
                    System.out.println("by child synch block method thread :"+Thread.currentThread().getName());
                    Thread.sleep(0,0);
                }
                catch (InterruptedException e){

                }
            }

        }
        for (int i = 0; i < 2; i++) {
            System.out.println("by child thread end : "+Thread.currentThread().getName());
        }
    }



}
