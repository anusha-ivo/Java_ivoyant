package threads;

public class Runnable_1 {
    public static void main(String[] args){
        Run1 r=new Run1();
        System.out.println("by main thread");
        Thread t=new Thread(r);
        t.start();

    }
}
class Run1 implements Runnable{
    public void run(){
        System.out.println("by child thread");

    }
}
