package threads;

public class Runnable_2 {
    public static void main(String[] args){
        Run2 r=new Run2();
        Thread t=new Thread(r);
        t.start();


    }
}
class Run2 implements Runnable{
    public void run(){
        System.out.println("by child thread");
    }
}
