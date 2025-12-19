package threads;

public class Sync_runnable {
    public static void main(String[] args){
        A2 a=new A2();
        Thread t=new Thread(a,"priya");
        Thread t2=new Thread(a,"ranjana");
        t.start();
        t2.start();

    }
}
class A2 implements Runnable{
    public synchronized void run(){
        for(int i=0;i<4;i++) {
            System.out.println("child child thread" + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }

        }
    }
}
