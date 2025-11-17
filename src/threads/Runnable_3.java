package threads;

public class Runnable_3 {
    public static void main(String[] args){
        Run3 r=new Run3();
        Thread t=new Thread(r);
        t.start();



    }
}
class Run3 implements Runnable{
    public void run(){
        System.out.println("by child thread by run 3");
    }
}
