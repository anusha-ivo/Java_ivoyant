package threads;

public class Synch_runnable {
    public static void main(String[] args){
        A1 a=new A1();
        Thread t=new Thread(a,"thread-1");
        Thread t2=new Thread(a,"thread-2");
        t.start();

        t2.start();


    }
}
class A1 implements Runnable{
    public synchronized void run(){
        for(int i=0;i<4;i++){
            System.out.println("by child thread" +Thread.currentThread().getName());
        }

    }
}
